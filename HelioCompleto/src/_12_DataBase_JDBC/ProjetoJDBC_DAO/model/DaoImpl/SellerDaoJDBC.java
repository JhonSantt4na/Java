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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
				Department dep = instantiateDepartment(rs);
				// Vendedor
				Seller obj = instantiateSeller(rs, dep);
				
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
	
	private Seller instantiateSeller(ResultSet rs, Department dep) throws SQLException{
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
	
	private Department instantiateDepartment(ResultSet rs) throws SQLException{
		Department dep = new Department();
		dep.setId(rs.getInt("DepartmentId"));
		dep.setName(rs.getString("DepName"));
		return  dep;
		// Não vou tratar a exeçou vou apenas propagar
	}
	
	@Override
	public List<Seller> findAll() {
		return List.of();
	}
	
	@Override
	public List<Seller> findByDepartment(Department department) {
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			st = conn.prepareStatement(
				"SELECT seller.*, department.Name AS DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "WHERE DepartmentId = ? "
					+ "ORDER BY Name"
			);
			
			st.setInt(1 , department.getId());
			
			rs = st.executeQuery();
			
			List<Seller> list = new ArrayList<>();
			Map<Integer, Department> map = new HashMap<>();
			
			while (rs.next()){ // se veio algo enguanto tiver o proximo
				Department dep  = map.get(rs.getInt("DepartmentId"));
				if (dep == null){
					dep = instantiateDepartment(rs); // instanciando
					map.put(rs.getInt("DepartmentId"), dep); // Salvando no map
					
				}
				// Vendedor
				Seller obj = instantiateSeller(rs, dep);
				list.add(obj);
			}
			return list;
			
		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}
	
}
