package com.bcits.jdbcapp.common;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class FindEmployee {
	public static void main(String[] args) {
		Connection con=null;
		ResultSet rs=null;
		Statement  stmt=null;
		try {
					
			/*
			 * Driver driverRef=new Driver(); DriverManager.registerDriver(driverRef);
			 */
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			String dburl="jdbc:mysql://localhost:3306/employee_management_info?"
					    + "user=root&password=root";
			con=DriverManager.getConnection(dburl);
						
			String query = "select * from employee_primary_info "
					     + " where empid=123";
			
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			
			while(rs.next()) {
				int employeeID=rs.getInt("empid");
				String name=rs.getString("name");
				long mobileNumber=rs.getLong("mobileno");
				String email=rs.getString("official_mailID");
				Date Date_Of_Birth=rs.getDate("date_of_birth");
				Date Date_of_joining=rs.getDate("date_of_joining");
				String designation = rs.getString("designation");
				String bloodgroup= rs.getString("bloodgroup");
				double salary= rs.getDouble("salary");
				int deptID=rs.getInt("deptID");
				int managerID=rs.getInt("managerID");
				
				System.out.println("employeeID-->"+employeeID);
				System.out.println("name-->"+name);
				System.out.println("mobilenumber-->"+mobileNumber);
				System.out.println("email-->"+email);
				System.out.println("Date of birth-->"+Date_Of_Birth);
				System.out.println("Date of joining-->"+Date_of_joining);
				System.out.println("designation-->"+designation);
				System.out.println("bloodgroup-->"+bloodgroup);
				System.out.println("salary-->"+salary);
				System.out.println("deptID-->"+deptID);
				System.out.println("managerID-->"+managerID);				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(rs!=null) {
					rs.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
