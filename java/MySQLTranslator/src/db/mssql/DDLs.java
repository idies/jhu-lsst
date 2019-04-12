package db.mssql;

import java.io.PrintStream;
import java.util.ArrayList;

public class DDLs {

	public ArrayList<Table> creates = new ArrayList<Table>();
	public ArrayList<String> drops = new ArrayList<String>();
	
	public void write(PrintStream out, ExternalTableWriter et){
		for(String t : drops)
			out.printf("DROP %sTABLE %s;\n", et==null?"":"EXTERNAL ",t);
		for(Table t : creates) {
			if(et == null)
				t.create(out,false);
			else
				et.create(t, out);
			out.print(";\n\n");
		}
		if(et != null) {
			for(Table t : creates) {
				et.createStatistics(t, out);
			}
		}
	}
}
