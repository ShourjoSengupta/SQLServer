package com.SQlServer;
import java.sql.DriverManager;
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
public class JDBCExample {

	public static void main(String[] args)throws SQLException {
		String connectionUrl= "jdbc:sqlserver://WIN2019;Database = Online Art Gallery;IntegratedSecurity = true;encrypt=false";
		Connection conn = DriverManager.getConnection(connectionUrl);
		
		Statement st = conn.createStatement();
		String s = "Select * from dbo.Art;";
		
		ResultSet rs =st.executeQuery(s);
		
		while(rs.next()) {
			System.out.println("Id=" + rs.getString("Id"));
			System.out.println("ArtName=" + rs.getString("ArtName"));
			System.out.println("ArtType=" + rs.getString("ArtType"));
			System.out.println("Material=" + rs.getString("Material"));
			System.out.println("Artist=" + rs.getString("Artist"));
			System.out.println("Price=" + rs.getFloat("Price"));
		}
		conn.close();

	}

}
