package _12_DataBase_JDBC.PrimeiroApp.db;

public class DbException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DbException( String msg) {
		super (msg);
	}
}
