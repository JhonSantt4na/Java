package _12_DataBase_JDBC.ProjetoJDBC_DAO.application;

import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao.DaoFactory;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao.SellerDao;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createDepartamentDao();
		
		
		sc.close();
	}
}
