package com.bcits.jdbcapp.common;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class UpdatingData {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			FileInputStream file =new FileInputStream("dbInfo.properties");
			Properties prop=new Properties();
			prop.load(file);
			
			Class.forName(prop.getProperty("driverNm"));
			String dburl = "jdbc:mysql://localhost:3306/employee_management_info?user=root&password=root";
			con = DriverManager.getConnection(dburl);

			String query = "update employee_primary_info set name='nayana' where empid=222";
			stmt = con.createStatement();
			int rs = stmt.executeUpdate(query);

			System.out.println("number of rows affected-->" + rs);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
