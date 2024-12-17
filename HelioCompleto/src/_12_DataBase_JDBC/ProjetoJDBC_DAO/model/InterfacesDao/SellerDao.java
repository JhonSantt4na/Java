package _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao;

import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.entities.Department;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.entities.Seller;

import java.util.List;

public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
	
}
