package com.bcits.jdbcapp.connection;

public class MainMethodClass {
	public static void main(String[] args) {
		
		String str="one";
		Connection ref =DeviceManager.myMethod(str);
		ref.print();
	}

}
