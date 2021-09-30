package com.cg.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Connection1 {
   static final String DB_URL = "jdbc:mysql://localhost/Users";
   static final String USER = "root";
   static final String PASS = "Iamworkingonsql@1";

   public static Connection getConnection() {
      // Open a connection
	   Connection conn = null;
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Database and Table created successfully...");   
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection failed...");   
			e.printStackTrace();
		}
		 return conn;
	}


public static void main(String args[]) {
	int status = 0;
	Connection conn = getConnection();
	try {
		PreparedStatement ps = conn.prepareStatement("insert into user_details values('1','Prashanthi','Bende','24')");
		status = ps.executeUpdate();
		 System.out.println("Welcome");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}