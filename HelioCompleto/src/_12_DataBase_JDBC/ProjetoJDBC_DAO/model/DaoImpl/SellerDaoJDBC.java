package _12_DataBase_JDBC.ProjetoJDBC_DAO.model.DaoImpl;

import _12_DataBase_JDBC.ProjetoJDBC_DAO.db.DBException;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.db.DB;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao.SellerDao;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.entities.Department;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.entities.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SellerDaoJDBC implements SellerDao {
	private Connection conn;
	
	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Seller obj) {
	
	}
	
	@Override
	public void update(Seller obj) {
	
	}
	
	@Override
	public void deleteById(Integer id) {
	
	}
	
	@Override
	public Seller findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			st = conn.prepareStatement(
				"SELECT seller.*, department.Name AS DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "WHERE seller.Id = ?"
			);
			st.setInt(1 , id);
			rs = st.executeQuery();
			if (rs.next()){ // se veio algo
				
				// departamento
				Department dep = new Department();
				dep.setId(rs.getInt("DepartmentId"));
				dep.setName(rs.getString("DepName"));
				
				// Vendedor
				Seller obj = new Seller();
				obj.setId(rs.getInt("Id"));
				obj.setName(rs.getString("Name"));
				obj.setEmail(rs.getString("Email"));
				obj.setBaseSalary(rs.getDouble("BaseSalary"));
				obj.setBirthDate(rs.getDate("BirthDate"));
				// Setando o obj dep ao departamento
				obj.setDepartment(dep);
				
				return obj;
			}
			return null;
			
		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}
	
	@Override
	public List<Seller> findAll() {
		return List.of();
	}
	
}
