package _12_DataBase_JDBC.ProjetoJDBC_DAO.application;

import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao.DaoFactory;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao.SellerDao;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.entities.Department;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TESTE 01: Seller findById ==== ");
		Seller seller = sellerDao.findById(3);
	 
		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
	   	}
		
	}
}

