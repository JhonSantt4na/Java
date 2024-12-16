package _12_DataBase_JDBC.ProjetoJDBC_DAO.model.DaoImpl;

import _12_DataBase_JDBC.ProjetoJDBC_DAO.db.DB;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.db.DBException;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao.DaoFactory;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao.SellerDao;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.entities.Department;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.entities.Seller;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentDaoJDBC  implements SellerDao {
	private Connection conn;
	
	public DepartmentDaoJDBC(Connection conn) {
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
		return null;
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
		return List.of();
	}
	
}
