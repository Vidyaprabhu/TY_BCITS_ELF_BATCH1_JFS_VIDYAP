package com.bcits.jdbcapp.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeletingData {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl="jdbc:mysql://localhost:3306/employee_management_info?";
			con =DriverManager.getConnection(dbUrl, "root", "root");

			String query = "delete from employee_primary_info where empid=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			int rs = pstmt.executeUpdate();

			System.out.println("number of rows affected->"+rs);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
