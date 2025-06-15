package com.jdbc;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String args[])
	{
		
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		
		String username = "root";
		String password = "root";
		
	//	String query = "Select * from employees";
		String query = "insert into employees(id ,name , job_title , salary) values(3 , 'harshit' , 'data analyst' , 75000)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		}
		
		try
		{
			Connection conn = DriverManager.getConnection(url , username , password);
			System.out.println("Connection Eastablished Succesfully");
			Statement stmt = conn.createStatement();
			int rowsAffected = stmt.executeUpdate(query);
			
			if(rowsAffected > 0)
			{
				System.out.println("Inserted successfully");
			}
		/*	ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				int id  = rs.getInt("id");
				String name = rs.getString("name");
				String job_title = rs.getString("job_title");
				Double salary = rs.getDouble("salary");
				
				System.out.println("====================");
				
				System.out.println("id :" + id);
				System.out.println("name :" + name);
				System.out.println("job_title :"+ job_title);
				System.out.println("salary :" +salary);*/
			
		}
		catch(SQLException e)
		{
			System.out.println("Connection failed: "+e.getMessage());
		}
	}
	
}
