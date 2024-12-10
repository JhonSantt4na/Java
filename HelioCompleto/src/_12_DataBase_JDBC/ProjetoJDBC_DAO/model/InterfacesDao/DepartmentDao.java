package _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao;

import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.entities.Department;

import java.util.List;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
	
}
