package db.mssql;

import java.io.PrintStream;
import java.util.ArrayList;

public class DDLs {

	public ArrayList<Table> creates = new ArrayList<Table>();
	public ArrayList<String> drops = new ArrayList<String>();
	
	
	public void write(PrintStream out, ExternalTableWriter et) {
		writeDropStatements(out, et);
		writeCreateStatements(out, et);
		writeStatisticsStatements(out, et);
		writeTestQueries(out, et);
	}	
	/*
	public void write(PrintStream out, ExternalTableWriter et){
		for(String t : drops)
			out.printf("if OBJECT_ID('%s') IS NOT NULL DROP %sTABLE  %s;\n", t,et==null?"":"EXTERNAL ",t);
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
				out.print(";\n\n");
				
			}
			out.print("--------- TEST QUERIES --------\n");
			for(Table t : creates) {				
				et.createTestQuery(t, out);
			}
		}
		
		
	}
	*/
	
	public void writeDropStatements(PrintStream out, ExternalTableWriter et) {
		for(String t : drops)
			out.printf("if OBJECT_ID('%s') IS NOT NULL DROP %sTABLE  %s;\n", t,et==null?"":"EXTERNAL ",t);
		
	}
	
	public void writeCreateStatements(PrintStream out, ExternalTableWriter et) {
		for(Table t : creates) {
			if(et == null)
				t.create(out,false);
			else
				et.create(t, out);
			out.print(";\n\n");
		}
		
	}
	
	public void writeStatisticsStatements(PrintStream out, ExternalTableWriter et) {
		if(et != null) {
			for(Table t : creates) {
				et.createStatistics(t, out);
				
			}
		
		}
	}
	
	public void writeTestQueries(PrintStream out, ExternalTableWriter et) {
		if(et != null) {
			for(Table t : creates) {				
				et.createTestQuery(t, out);
			}
		}
	}
	
	
}