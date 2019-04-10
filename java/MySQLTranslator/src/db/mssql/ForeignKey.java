package db.mssql;

import java.util.ArrayList;

public class ForeignKey extends Index {

	public String onDelete, onUpdate;
	public String refTable;
	public ArrayList<String> refColumns = new ArrayList<String>();
	public void addRefColumn(String name) {
		refColumns.add(name);
	}
}
