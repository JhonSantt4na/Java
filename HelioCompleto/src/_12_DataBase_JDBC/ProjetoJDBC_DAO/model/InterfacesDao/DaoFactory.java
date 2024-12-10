package _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao;

import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.DaoImpl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return  new SellerDaoJDBC();
	}
	
}
