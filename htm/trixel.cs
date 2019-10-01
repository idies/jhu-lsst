#region Copyright Gyorgy Fekete
/* 
 * Copyright Alex Szalay, Gyorgy Fekete, Jim Gray 2007
 * The Spherical Geometry and Hierarchical Triangular Mesh libraries and source code are
 * provided as-is with no warranties. The user is hereby granted a non-exclusive license to use,
 * modify and extend these libraries. We ask that the authors (A. Szalay, T. Budavari, G. Fekete
 * at The Johns Hopkins University,  and Jim Gray, Microsoft Research be credited in any publication
 * or derived product that incorporates the whole or any part of our system
 */
#endregion
using System;
using System.Collections.Generic;
using System.Collections;
using System.Data.SqlTypes;
using Jhu.Spherical;

namespace Jhu.Spherical.Htm
{
    public struct Trixel : IComparable<Trixel>
    {
        public static Trixel Null
        {
            get { return new Trixel(0UL); }
        }

        private UInt64 htmID;

        public UInt64 HtmID
        {
            get { return htmID; }
            set
            {
                // not needed
                if (value < 0)
                {
                    throw new Exception("Invalid htmID");   // *** TODO
                }

                htmID = value;
            }
        }

        /// <summary>
        /// Compute the PseudoArea (number of level-20 trixels) of the given trixel.
        /// </summary>
        /// <param name="hid">the trixel's HtmID</param>
        /// <returns>64-bit pseudoarea</returns>
        public UInt64 PseudoArea
        {
            get
            {
                int level = Level;

                UInt64 result;
                int iter = (Constant.DefaultLevel - level);  // 4 ^ (20 - level)
                result = 1;

                for (iter = (Constant.DefaultLevel - level); iter > 0; iter--)
                {
                    result <<= 2;
                }

                return result;
            }
        }

        public double Area
        {
            get
            {
                Cartesian v0, v1, v2;
                GetTriangle(out v0, out v1, out v2);
                
                return Cartesian.SphericalTriangleArea(v0, v1, v2);
            }
        }

        public Trixel(UInt64 htmID)
        {
            this.htmID = htmID;
        }

        public Trixel(SqlInt64 htmID)
        {
            if (htmID.Value < 0)
            {
                throw new Exception("Invalid htmID");   // *** TODO
            }

            this.htmID = (UInt64)htmID.Value;
        }

        public Trixel(UInt64 lo, UInt64 hi)
        {
            UInt64 d = hi - lo + 1;

            if (PopCount(d) != 1)
            {
                throw new HtmException("Invalid (compacted?) range.");
            }

            int shift = 0;

            while (shift <  Constant.HtmIDBits && d != 1)
            {
                d >>= 2;
                shift += 2;
            }

            this.htmID = lo >> shift;
        }

        public static implicit operator Trixel(UInt64 htmID)
        {
            return new Trixel(htmID);
        }

        public static implicit operator UInt64(Trixel trixel)
        {
            return trixel.htmID;
        }

        public static implicit operator Trixel(SqlInt64 htmID)
        {
            return new Trixel((UInt64)htmID.Value);
        }

        public static implicit operator SqlInt64(Trixel trixel)
        {
            return new SqlInt64((Int64)trixel.htmID);
        }

        public static implicit operator Trixel(SqlString htmID)
        {
            return Trixel.Parse(htmID.Value);
        }

        public static implicit operator SqlString(Trixel trixel)
        {
            return new SqlString(trixel.ToString());
        }

        public static bool operator ==(Trixel trixel, Trixel other)
        {
            return trixel.htmID == other.htmID;
        }

        public static bool operator !=(Trixel trixel, Trixel other)
        {
            return trixel.htmID != other.htmID;
        }

        public static bool operator ==(Trixel trixel, UInt64 other)
        {
            return trixel.htmID == other;
        }

        public static bool operator !=(Trixel trixel, UInt64 other)
        {
            return trixel.htmID != other;
        }

        public override int GetHashCode()
        {
            return htmID.GetHashCode();
        }

        public override bool Equals(object obj)
        {
            return htmID.Equals(obj);
        }

        public static Trixel FromEq(double ra, double dec)
        {
            return FromCartesian(new Cartesian(ra, dec));
        }

        public static Trixel FromCartesian(double x, double y, double z)
        {
            return FromCartesian(new Cartesian(x, y, z, true));
        }

        public static Trixel FromCartesian(Cartesian p)
        {
            return FromCartesian(p, Constant.DefaultLevel);
        }

        public static Trixel FromCartesian(Cartesian p, int depth)
        {
            Cartesian v0, v1, v2;
            Cartesian w0, w1, w2;

            UInt64 htmid = GetStartPane(p);
            GetStartPaneVectors(htmid, out v0, out v1, out v2);

            // Start searching for the children
            while (depth-- > 0)
            {
                htmid <<= 2;

                w2 = Cartesian.MiddlePoint(v0, v1, true);
                w0 = Cartesian.MiddlePoint(v1, v2, true);
                w1 = Cartesian.MiddlePoint(v2, v0, true);

                if (Contains(p, v0, w2, w1))
                {
                    // hid |= 0;
                    v1 = w2;
                    v2 = w1;
                }
                else if (Contains(p, v1, w0, w2))
                {
                    htmid |= 1;
                    v0 = v1;
                    v1 = w0;
                    v2 = w2;
                }
                else if (Contains(p, v2, w1, w0))
                {
                    htmid |= 2;
                    v0 = v2;
                    v1 = w1;
                    v2 = w0;
                }
                else if (Contains(p, w0, w1, w2))
                {
                    htmid |= 3;
                    v0 = w0;
                    v1 = w1;
                    v2 = w2;
                }
                else
                {
                    // CATASTROPHIC ERROR!!! THROW Something!
                    throw new HtmException("Panic in Cartesian2hid");
                }
            }

            return htmid;
        }

        /// <summary>
        /// Checks if p is inside triangle given by v1, v2, v3
        /// </summary>
        /// <param name="p">point to test</param>
        /// <param name="v0">first vertex of triangle</param>
        /// <param name="v1">second vertex of triangle</param>
        /// <param name="v2">third vertex of triangle</param>
        /// <returns></returns>
        internal static bool Contains(Cartesian p, Cartesian v0, Cartesian v1, Cartesian v2)
        {
            // if (v1 X v2) . p < epsilon then false 
            // same for v2 X v3 and v3 X v1.
            // else return true..
            if (Cartesian.TripleProduct(v0, v1, p) < -Htm.Constant.DblTolerance)
            {
                return false;
            }

            if (Cartesian.TripleProduct(v1, v2, p) < -Htm.Constant.DblTolerance)
            {
                return false;
            }

            if (Cartesian.TripleProduct(v2, v0, p) < -Htm.Constant.DblTolerance)
            {
                return false;
            }

            return true;
        }

        /// <summary>
        /// Returns the start pane of the octahedron in which the specified point lies
        /// </summary>
        /// <param name="p"></param>
        /// <returns></returns>
        private static UInt64 GetStartPane(Cartesian p)
        {
            if ((p.X > 0) && (p.Y >= 0))
            {
                return (p.Z >= 0) ? Constant.N3 : Constant.S0;
            }
            else if ((p.X <= 0) && (p.Y > 0))
            {
                return (p.Z >= 0) ? Constant.N2 : Constant.S1;
            }
            else if ((p.X < 0) && (p.Y <= 0))
            {
                return (p.Z >= 0) ? Constant.N1 : Constant.S2;
            }
            else if ((p.X >= 0) && (p.Y < 0))
            {
                return (p.Z >= 0) ? Constant.N0 : Constant.S3;
            }
            else
            {
                return (p.Z >= 0) ? Constant.N3 : Constant.S0;
            }
        }

        private static void GetStartPaneVectors(UInt64 htmID, out Cartesian v0, out Cartesian v1, out Cartesian v2)
        {
            int bix = (int)(htmID - 8L);

            v0 = Constant.Faces[bix].Point0;
            v1 = Constant.Faces[bix].Point1;
            v2 = Constant.Faces[bix].Point2;
        }

        /// <summary>
        /// Decide whether or not a node in the tree of a given HtmID is an 
        /// ancestor of another node
        /// </summary>
        /// <param name="grandpa">64-bit HtmID, candidate for ancestry</param>
        /// <param name="hid">64-bit HtmID who is the potential descendant</param>
        /// <returns>true if grandpa is an ancestor of hid</returns>
        public bool IsAncestorOf(Trixel grandpa)
        {
            int shifts = Level - grandpa.Level;

            if (shifts < 0)
            {
                return false;
            }

            UInt64 descendant = HtmID >> (shifts * 2);
            return (descendant == grandpa);
        }

        /// <summary>
        /// Returns the level number of an HtmID
        /// </summary>
        /// <param name="htmid">The HtmID</param>
        /// <returns>The level number or -1</returns>
        public int Level
        {
            get
            {
                // Find the highest 1 bit to determine level
                // Skip first two bits to avoid signed/unsigned problems
                for (int i = 2; i < Constant.HtmIDBits; i += 2)
                {
                    if (((htmID << i) & Constant.HtmIDHighBit1) != 0)
                    {
                        return (Constant.HtmIDBits - i - 6) / 2;
                    }
                }

                throw new Exception("Invalid HTMID");   // *** TODO
            }
        }

        public void GetTriangle(out Cartesian v0, out Cartesian v1, out Cartesian v2)
        {
            Cartesian w0, w1, w2;
            UInt64 bix;
            
            int level = Level;

            // First get the base plane from top four bits
            int k;

            // Top two bits determine N or S
            bix = (htmID >> (level * 2 + 2)) & 0x03;

            switch (bix)
            {
                case 0x03:  // N
                    k = 4;
                    break;
                case 0x02:  // S
                    k = 0;
                    break;
                default:
                    throw new Exception("Invalid HTMID");   // *** TODO
            }

            // Next two bits determine N or S quater plane
            bix = (htmID >> (level * 2)) & 0x03;
            k += (int)bix;

            v0 = Constant.Faces[k].Point0;
            v1 = Constant.Faces[k].Point1;
            v2 = Constant.Faces[k].Point2;

            //
            for (int i = 0; i < level; i++)
            {
                bix = (htmID >> ((level - i) * 2 - 2)) & 0x03;

                w2 = Cartesian.MiddlePoint(v0, v1, true);
                w0 = Cartesian.MiddlePoint(v1, v2, true);
                w1 = Cartesian.MiddlePoint(v2, v0, true);

                switch (bix)
                {
                    case 0x00:
                        v1 = w2;
                        v2 = w1;
                        break;
                    case 0x01:
                        v0 = v1;
                        v1 = w0;
                        v2 = w2;
                        break;
                    case 0x02:
                        v0 = v2;
                        v1 = w1;
                        v2 = w0;
                        break;
                    case 0x03:
                        v0 = w0;
                        v1 = w1;
                        v2 = w2;
                        break;
                    default:
                        throw new InvalidOperationException();  // *** TODO
                }
            }
        }

        public Region GetRegion()
        {
            Cartesian v0, v1, v2;
            GetTriangle(out v0, out v1, out v2);

            var h0 = new Halfspace(v0.Cross(v1, true), 0);
            var h1 = new Halfspace(v1.Cross(v2, true), 0);
            var h2 = new Halfspace(v2.Cross(v0, true), 0);

            var convex = new Convex();
            convex.Add(h0);
            convex.Add(h1);
            convex.Add(h2);

            convex.Simplify(false);

            Region region = new Region(convex, false);
            region.Simplify();

            return region;
        }

        /// <summary>
        /// Truncate the HtmID to a lower level (hence fewer bits)
        /// The HtmID of a trixel implicitly contains the level of the trixel.
        /// When you need a lower level trixel that contains the trixel
        /// of the given HtmID, this function gives it to you.
        /// If the level of
        /// the given HtmID is less than or equal to the desired level,
        /// then there is no change.
        /// </summary>
        /// <param name="htmid">The given HtmID</param>
        /// <param name="level">Desired level</param>
        /// <returns>HtmID of lower level trixel</returns>
        public Trixel Truncate(int level)
        {
            return new Trixel((htmID >> 2 * (Level - level)));
        }

        public Range Extend(int targetLevel)
        {
            Trixel lo, hi;
            
            int level = this.Level;
            int shift = 2 * (targetLevel - level);

            if (targetLevel > level)
            {
                lo = htmID << shift;
                hi = lo + ((0x01UL << shift) - 1);
            }
            else
            {
                lo = htmID >> -shift;
                hi = lo;
            }

            return new Range(lo, hi);
        }

        public Cartesian GetCenter()
        {
            Cartesian[] v = new Cartesian[3];
            GetTriangle(out v[0], out v[1], out v[2]);

            return Cartesian.CenterOfMass(v, true);
        }

        public int CompareTo(Trixel to)
        {
            return htmID.CompareTo(to.htmID);
        }

        /// <summary>
        /// Convert the trixel from text to 64 bit HID
        /// The character array must be of size eMaxNameSize, and
        /// it is not necessary to have null termination. The
        /// number of siginificant characters in the trixel's name
        /// is given as a parameter.
        /// </summary>
        /// <param name="name">The character array with the text 
        /// representation of the trixel.</param>
        /// <param name="effectivelength">The number of significant characters
        /// in the array.</param>
        /// <returns>The 64 bit HID</returns>
        public static Trixel Parse(string name)
        {
            name = name.Trim().ToUpperInvariant();

            if (name.Length < 2)
            {
                //return 0;	// 0 is an illegal HID
                throw new Exception("Illegal HtmID");   // *** TODO
            }

            if (name.Length > Constant.HtmIDMaxNameLength)
            {
                // return 0;
                throw new Exception("Illegal HtmID");   // *** TODO
            }

            
            UInt64 tempid;

            // Top bit is always 1
            switch (name[0])
            {
                case 'N':
                    tempid = 0x03;
                    break;
                case 'S':
                    tempid = 0x02;
                    break;
                default:
                    throw new Exception("Illegal HtmID");   // *** TODO
            }

            for (int i = 1; i < name.Length; i++)
            {
                tempid <<= 2;
                tempid |= (UInt16)((name[i] - '0') & 0x03);
            }

            return new Trixel(tempid);
        }

        public bool IsValid
        {
            get
            {
                if (htmID < 0)
                {
                    return false;
                }

                if (htmID < 8)
                {
                    return false;
                }

                return true;
            }
        }

        public static UInt64 PopCount(UInt64 x)
        {
            const UInt64 m1 = 0x5555555555555555; //binary: 0101...
            const UInt64 m2 = 0x3333333333333333; //binary: 00110011..
            const UInt64 m4 = 0x0f0f0f0f0f0f0f0f; //binary:  4 zeros,  4 ones ...
            const UInt64 m8 = 0x00ff00ff00ff00ff; //binary:  8 zeros,  8 ones ...
            const UInt64 m16 = 0x0000ffff0000ffff; //binary: 16 zeros, 16 ones ...
            const UInt64 m32 = 0x00000000ffffffff; //binary: 32 zeros, 32 ones
            const UInt64 hff = 0xffffffffffffffff; //binary: all ones
            const UInt64 h01 = 0x0101010101010101; //the sum of 256 to the power of 0,1,2,3...

            x -= (x >> 1) & m1;             //put count of each 2 bits into those 2 bits
            x = (x & m2) + ((x >> 2) & m2); //put count of each 4 bits into those 4 bits 
            x = (x + (x >> 4)) & m4;        //put count of each 8 bits into those 8 bits 
            return (x * h01) >> 56;  //returns left 8 bits of x + (x<<8) + (x<<16) + (x<<24) + ... 
        }

        /// <summary>
        /// Convert a 64-bit HID to a text desciption of the trixel.
        /// </summary>
        /// <param name="name">An array of HtmTrixel.eMaxNameSize (a const in this class)
        /// character The array is null terminated.</param>
        /// <param name="hid">The HID</param>
        /// <returns>The number of significant characters in name[]</returns>
        public override string ToString()
        {
            // HtmID strinng format:
            // C0123012301230123012301230123
            // Here C is N or S, one number for main plane followed
            // by a digits equal to the level of HTM

            int level = Level;
            char[] name = new char[level + 2];

            UInt64 tempid = htmID;
         
            for (int i = 0; i < level + 1; i++)
            {
                name[level - i + 1] = (char)('0' + (int)(tempid & 0x03L));
                tempid >>= 2;
            }

            // Now the very last bit determines N or S
            name[0] = ((tempid & 0x01) != 0) ? 'N' : 'S';

            return new String(name);
        }

    }
}