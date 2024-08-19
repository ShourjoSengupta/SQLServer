package com.SQlServer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLServerConnection {
	public static void main(String[] args)throws ClassNotFoundException {
		try {
			String connectionURL = "jdbc:sqlserver://WIN2019;Database = Online Art Gallery;IntegratedSecurity = true;encrypt=false";
			Connection conn = DriverManager.getConnection(connectionURL);
			System.out.println("The connection has been established!");
		}
		catch(SQLException e){
			System.out.println("Connection failed");
			e.printStackTrace();
		}
	}
	

}
