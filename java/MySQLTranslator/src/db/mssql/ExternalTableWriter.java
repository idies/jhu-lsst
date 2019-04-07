package db.mssql;

import java.io.PrintStream;

public class ExternalTableWriter {

	private String data_source,location;
	public ExternalTableWriter(String data_source, String location){
		this.data_source= data_source;
		this.location=location;
	}
	public void create(Table table, PrintStream out) {
		table.create(out,true);
		out.printf("with(location='%s',data_source=%s)",location,data_source);
	}
}
