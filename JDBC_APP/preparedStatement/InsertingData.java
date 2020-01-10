package com.bcits.jdbcapp.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertingData {
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl = "jdbc:mysql://localhost:3306/employee_management_info";
			con = DriverManager.getConnection(dbUrl, "root", "root");

			String query = "insert into employee_primary_info " + " values(?,?,?,?,"
					+ " '1994-03-14','2016-03-18','hr','b+',30000,20,123)";

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setLong(3, Long.parseLong(args[2]));
			pstmt.setString(4, args[3]);
			int rs = pstmt.executeUpdate();

			System.out.println("number of rows affected ->" + rs);

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {

			}
		}
	}

}
