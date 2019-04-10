package db.mssql;

import java.io.PrintStream;
import java.util.ArrayList;

public class Table{
	
	public String name;
	ArrayList<Column> columns = new ArrayList<Column>();
	Constraint primaryKey;
	ArrayList<ForeignKey> fks=new ArrayList<ForeignKey>();
	ArrayList<Index> indexes=new ArrayList<Index>();
	public void addColumn(Column c)
	{
		columns.add(c);
	}
	public void addIndex(Index index) {
		indexes.add(index);
	}
	public void addFK(ForeignKey fk) {
		fks.add(fk);
	}
	/**
	 * Write as MS SQL CREATE TABLE.<br/>
	 * @param out
	 */
	public void create(PrintStream out , boolean external){
		out.printf("CREATE %sTABLE %s (\n",external?"EXTERNAL ":"", Util.safeName(name));
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
	public void createStatistics(PrintStream out) {
		if(primaryKey != null)
		{
			out.printf("\n\ncreate statistics [%s_pk] on [%s] (%s)",name,name, String.join(",",primaryKey));
		}

	}
	public Constraint getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(Constraint primaryKey) {
		this.primaryKey = primaryKey;
	}
	public ArrayList<ForeignKey> getFks() {
		return fks;
	}
	public ArrayList<Index> getIndexes() {
		return indexes;
	}
	
}
