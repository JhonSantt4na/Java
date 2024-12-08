package _12_DataBase_JDBC.InserindoDados;

import java.sql.*;
import java.text.SimpleDateFormat;

public class App {
	// API:
		//PreparedStatement = obj que permite montar a consulta sql deixando os parametros pra inserir depois
		//executeUpdate =
		//Statement.RETURN_GENERATED_KEYS = Permitir que recuperamos o id do obj inserido
		//getGeneratedKeys  = Para pegar o id
	
	//Checklist:
	
	//Inserção simples com preparedStatement
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			
			
			conn = DB.getConnection();
			//st = conn.prepareStatement(
				//"INSERT INTO seller "
				//+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
				//+"VALUES "
				//+ "(?,?,?,?,?)"
			//);
			
			//Inserção com recuperação de Id = inserir o valor e retorna o id
			
			/*
			st = conn.prepareStatement(// Usamos uma sobrecarga
			"INSERT INTO seller "
				+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
				+"VALUES "
				+ "(?,?,?,?,?)"
				, Statement.RETURN_GENERATED_KEYS
			);
			
			
			// Alterando as Interrogações = parameterindex( posição de cada interrogação
			st.setString(1,"Carl Purple");
			st.setString(2,"Carl@gmail.com");
			st.setDate(3,new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			st.setDouble(4,3000.0);
			st.setInt(5,4);
			*/
			
			// Inserindo um departamento
			st = conn.prepareStatement("insert into department (Name) values ('D1'), ('D2') ",
				Statement.RETURN_GENERATED_KEYS);
			
			
			int rowsAffected = st.executeUpdate();
			
			//System.out.println("Done ! Rows affected: " + rowsAffected);
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys(); // retorna com um ou mais valor
				
				// Percorendo o ResultSet
				while (rs.next()){
					int id = rs.getInt(1); // valor da primeira coluna ID no caso
					System.out.println("Done ! Id = " + id);
				}
			
			}else {
				System.out.println("No rown affected");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*catch (ParseException e) {
			e.printStackTrace();
		}*/
		finally {
			DB.closeStatement(st);
			DB.closeConnection(); // Smpre connection por ultimo
		}
	}
}
