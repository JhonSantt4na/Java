package _12_DataBase_JDBC.ProjetoJDBC_DAO.application;

import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao.DaoFactory;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.InterfacesDao.SellerDao;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.entities.Department;
import _12_DataBase_JDBC.ProjetoJDBC_DAO.model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== TESTE 01: Seller findById ==== ");
		Seller seller = sellerDao.findById(3);
	 
		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
	   	}
		
		System.out.println("\n=== TEST 3: seller findAll =====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller Insert =====");
		Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inseted ! New id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller Update =====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update Completed");
		
		System.out.println("\n=== TEST 6: seller Delete =====");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		sc.close();
	}
}

