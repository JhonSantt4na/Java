package _12_DataBase_JDBC.ProjetoJDBC_DAO.application;

import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao.DaoFactory;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao.DepartmentDao;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao.SellerDao;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.entities.Department;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = (DepartmentDao) DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: findById =======");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		sc.close();
	}
}
