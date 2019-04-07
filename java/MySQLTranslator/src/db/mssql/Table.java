package db.mssql;

import java.io.PrintStream;
import java.util.ArrayList;

public class Table{

	public String name;
	ArrayList<Column> columns = new ArrayList<Column>();
	public void addColumn(Column c)
	{
		columns.add(c);
	}
	/**
	 * Write as MS SQL CREATE TABLE.<br/>
	 * @param out
	 */
	public void create(PrintStream out , boolean external){
		out.printf("CREATE %sTABLE %s (\n",external?"EXTERNAL ":"", name);
		boolean first = true;
		for(Column c : columns){
			if(!first) {
				first = false;
				out.print(",");
			}
			c.create(out,external);
			out.print("\n");
		}
		out.printf(")");
	}
	
}
