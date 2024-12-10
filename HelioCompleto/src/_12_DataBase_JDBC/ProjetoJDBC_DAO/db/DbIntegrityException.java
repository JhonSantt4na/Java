package _12_DataBase_JDBC.ProjetoJDBC_DAO.db;

public class DbIntegrityException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DbIntegrityException(String msg) {
		super(msg);
	}
}
