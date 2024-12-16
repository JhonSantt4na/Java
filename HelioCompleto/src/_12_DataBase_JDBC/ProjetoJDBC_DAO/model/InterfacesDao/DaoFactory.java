package _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao;

import _12_DataBase_JDBC.ProjetoJDBC_DAO.db.DB;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.DaoImpl.DepartmentDaoJDBC;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.DaoImpl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return  new SellerDaoJDBC(DB.getConnection());
	}
	
	public static SellerDao createDepartamentDao(){
		return new DepartmentDaoJDBC(DB.getConnection());
	}
	
}
