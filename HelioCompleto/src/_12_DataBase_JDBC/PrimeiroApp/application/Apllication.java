package _12_DataBase_JDBC.PrimeiroApp.application;

import _12_DataBase_JDBC.PrimeiroApp.db.DB;

import java.sql.Connection;

public class Apllication {
	
	public static void main(String[] args) {
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}
}
