package db.mssql;

import java.io.PrintStream;

public class Column {

	public String name, datatype, length=null, precision=null, nullnotnull=null, defaultvalue = null;
	
	/**
	 * Write as MS SQL CREATE TABLE.<br/>
	 * @param out
	 */
	public void create(PrintStream out, boolean external ){
		out.printf("  [%s] %s",name,datatype);
		if(length != null){
			out.printf("(%s",length);
			if(precision != null)
				out.printf(",%s", precision);
			out.print(")");
		}
		if(nullnotnull != null)
			out.append(" ").append(nullnotnull);
		if(!external && defaultvalue != null)
			out.append(" DEFAULT ").append(defaultvalue);
	}
}
