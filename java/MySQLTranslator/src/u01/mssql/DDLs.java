package u01.mssql;

import java.io.PrintStream;
import java.util.ArrayList;

public class DDLs {

	public ArrayList<Table> creates = new ArrayList<Table>();
	public ArrayList<String> drops = new ArrayList<String>();
	
	public void write(PrintStream out){
		for(String t : drops)
			out.printf("DROP TABLE %s;\n", t);
		for(Table t : creates)
			t.create(out);
	}
}
