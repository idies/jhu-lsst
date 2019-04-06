package u01.mssql;

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
	public void create(PrintStream out ){
		out.printf("CREATE TABLE %s (\n",name);
		boolean first = true;
		for(Column c : columns){
			if(!first) {
				first = false;
				out.print(",");
			}
			c.create(out);
			out.print("\n");
		}
		out.printf(");\n\n");
	}
	
}
