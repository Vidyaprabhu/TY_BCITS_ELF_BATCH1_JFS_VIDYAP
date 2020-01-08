package com.bcits.jdbcapp.common;

import java.sql.*;

public class PreparedStatementExample {

	public static void main(String[] args) {
		Connection con= null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			// 1.Load the driver
			Class.forName("com.mysql.jdbc.Driver");

			// 2.Get the DB Connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/employee_management_info";
			con = DriverManager.getConnection(dbUrl,"root","root");

			// 3.Issue the sql querry via driver
			String query = " select * from employee_primary_info" + " where empid=? ";

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			rs = pstmt.executeQuery();

			// 4.Process the results returned by sql queries
			if(rs.next()) {
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
			}else {
				System.err.println("Employee Data Not Found in DB");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
				con.close();
				}
				if(rs!=null) {
				rs.close();
				}
				if(pstmt!=null) {
				pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}// end of catch
		}// end of finally
	}//end of main
}// end of class
