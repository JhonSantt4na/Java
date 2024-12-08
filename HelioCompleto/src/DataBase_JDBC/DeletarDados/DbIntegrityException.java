package DataBase_JDBC.DeletarDados;

public class DbIntegrityException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DbIntegrityException(String msg) {
		super(msg);
	}
}
