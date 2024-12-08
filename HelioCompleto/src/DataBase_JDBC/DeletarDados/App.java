package DataBase_JDBC.DeletarDados;

import DataBase_JDBC.AtualizandoDados.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
	//Criar DbIntegrityException pois sempre que vamos deletar algo no banco
	// pode ocorrer o problema de integridade referencial
	// ex: se agente apagar um departamento quando usarmos o usuario que usa esse departamento tera um erro  ai
	// teremos que Tratar a exceção de integridade referencial
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		try{
			conn = DataBase_JDBC.AtualizandoDados.DB.getConnection();
			st = conn.prepareStatement(
				"DELETE FROM department "
				+ "WHERE "
				+ "Id = ?"
			);
			
			st.setInt(1,  2); // Sera lançado um erro pois esta sendo usado
			
			int rowsAffected = st.executeUpdate();
			System.out.println("Done ! Rows affected : " + rowsAffected );
		}
		catch ( SQLException e) { // capturando e lançando execção personalizada
			throw  new DbIntegrityException(e.getMessage());
		}
		finally {
			DataBase_JDBC.AtualizandoDados.DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
