package db.mssql;

public class Util {

	public static String normalize(String n){
		String name = n;
		if(n.startsWith("`")){
			if(!n.endsWith("`"))
			{
				// throw error
			}
			name=n.substring(1,n.length()-1);
		}
		return name;
	}
	
	public static String safeName(String name) {
		return String.format("[%s]",name);
	}
	/**
	 * Translate MySQL datatype into MS SQL version.<br/>
	 * @param dt
	 * @return
	 */
	public static String my2mssql(String dt){
		// TODO do soemthing about non-matching datatypes
		dt = dt.toUpperCase();
		if("INT".equals(dt))
			return "INTEGER";
		if("MEDIUMINT".equals(dt))
			return "INTEGER";
		if("FLOAT".equals(dt))
			return "REAL";
		if("DOUBLE".equals(dt))
			return "FLOAT";
		if("BOOLEAN".equals(dt))
			return "BIT";
		if("VARCHAR".equals(dt))
			return "NVARCHAR";
		if("CHAR".equals(dt))
			return "NCHAR";
		if("TEXT".equals(dt) || "MEDIUMTEXT".equals(dt) || "LONGTEXT".equals(dt))
			return "NVARCHAR(4000)";
		return dt;
	}

	public static boolean typeHasLength(String dt){
		dt = dt.toLowerCase();
		return ("varchar".equals(dt)
				|| "char".equals(dt)
				|| "nvarchar".equals(dt)
				|| "nchar".equals(dt)
				|| "decimal".equals(dt));
	}
}
