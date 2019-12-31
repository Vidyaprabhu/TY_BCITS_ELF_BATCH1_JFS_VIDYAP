package com.bcits.jdbcapp.inserting;

import java.sql.*;

//import com.mysql.jdbc.Driver;

public class InsertingData {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
	

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String dburl = "jdbc:mysql://localhost:3306/employee_management_info?user=root&password=root";
			con = DriverManager.getConnection(dburl);
        
			String query = "insert into employee_primary_info "
					+ "values(234,'sangeetha',9874521141,'sangeetha@gmail.com','1997-12-30','2019-02-12',"
					+ " 'softwaredeveloper','a+',25000,10,854)";
			stmt = con.createStatement();
			int rs = stmt.executeUpdate(query);

			System.out.println("number of rows affected->" + rs);

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
