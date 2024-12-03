package DataBase_JDBC.TesteJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaConector {
	// Classe DatabaseConnection
	public static class DatabaseConnection {
		private static final String URL = "jdbc:mysql://localhost:3306/coursejdbc";
		private static final String USER = "root";
		private static final String PASSWORD = "root";
		
		public static Connection getConnection() throws SQLException {
			try {
				// Registra o driver JDBC
				Class.forName("com.mysql.cj.jdbc.Driver");
				return DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				throw new SQLException("Erro ao conectar ao banco de dados");
			}
		}
	}
	
	// Classe Main
	public static void main(String[] args) {
		try {
			// Testa a conexão com o banco de dados
			Connection connection = DatabaseConnection.getConnection();
			System.out.println("Conexão bem-sucedida!");
			connection.close();
		} catch (SQLException e) {
			System.out.println("Erro ao conectar: " + e.getMessage());
		}
	}
}
