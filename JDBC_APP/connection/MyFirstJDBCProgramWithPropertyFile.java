package com.bcits.jdbcapp.connection;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyFirstJDBCProgramWithPropertyFile {
	public static void main(String[] args) {
		
		Connection con=null;
		ResultSet rs=null;
		Statement stmt=null;
		
		try {
			// 1.Load the "Driver"
			//Driver driveRef = new Driver();
			//DriverManager.registerDriver(driveRef);
			Class.forName("com.mysql.cj.jdbc.Driver");
			FileInputStream fileInputStream=new FileInputStream("dbInfo.properties");
			Properties properties=new Properties();
			//properties.load(fileInputStream);
			
			// 2.get the "DB connection" via "Driver"
			String dburl = "jdbc:mysql://localhost:3306/employee_management_info";
			con = DriverManager.getConnection(dburl,properties);

			// 3.Issue "SQL Queries" via "connection"
			String query = "select * from employee_primary_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			// 4."process the results" returned by "SQL Query"
			while (rs.next()) {
				int employeeID = rs.getInt("empid");
				String employeeName = rs.getString("name");
				double employeeSalary = rs.getDouble("salary");
				int departmentID = rs.getInt("deptID");
				Date joinning_date = rs.getDate("date_of_joining");
				long mobileNumber = rs.getLong("mobileno");
				String email = rs.getString("official_mailID");
				String designation = rs.getString("designation");
				Date Date_of_Birth = rs.getDate("date_of_birth");
				int managerID = rs.getInt("managerID");
				String bloodGrp = rs.getString("bloodgroup");

				System.out.println("Employee ID==>" + employeeID);
				System.out.println("Employee Name==>" + employeeName);
				System.out.println("Employee Salary==>" + employeeSalary);
				System.out.println("department ID==>" + departmentID);
				System.out.println("joinning date==>" + joinning_date);
				System.out.println("mobile number==>" + mobileNumber);
				System.out.println("Email==>" + email);
				System.out.println("designation==>" + designation);
				System.out.println("Date Of Birth==>" + Date_of_Birth);
				System.out.println("manager ID==>" + managerID);
				System.out.println("Blood Group==>" + bloodGrp);
				System.out.println("------------------------------------");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//5. close all "JDBC Objects"
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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}// End of finally

	}// End of Main
}
