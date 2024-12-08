package _12_DataBase_JDBC.Transações;

import _12_DataBase_JDBC.AtualizandoDados.DB;
import _12_DataBase_JDBC.PrimeiroApp.db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		try{
			conn = DB.getConnection();
			st = conn.createStatement();
			
			// Forma errada:
			//int rows1 = st.executeUpdate(
			//	"UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1"
			//);
			
			// Gerando uma falha
			//int x = 1;
			//if (x < 2) {
			//	throw new SQLException("Fake Error");
			//}
			
			//int rows2 = st.executeUpdate(
			//	"UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2"
			//);
			
			// Neste ex: a op 1 funciona e a 2 não
			
			// Forma Correta
			conn.setAutoCommit(false); // todas op ficara pendende aguardando ser feita
			
			int rows1 = st.executeUpdate(
				"UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1"
			);
			
			// Gerando uma falha
			//int x = 1;
			//if (x < 2) {
				//throw new SQLException("Fake Error");
			//}
			
			int rows2 = st.executeUpdate(
				"UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2"
			);
			
			conn.commit(); // Confirmando que terminou e pode ser efetuado a trasação
			
			
			System.out.println("rows1 " + rows1);
			System.out.println("rows2 " + rows2);
		}
		catch ( SQLException e) {
			// e.printStackTrace(); > usado no ex 1
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by : " +  e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by : " + e1.getMessage());
			}
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
