package com.bcits.jdbcapp.connection;

public class DeviceManager {
	private DeviceManager() {
	}
	public static Connection myMethod(String str) {
		Connection ref = null;
		if (str.equals("one")) {
			ref = new ClassA();
		} else {
			ref = new ClassB();
		}
		return ref;
	}// end of method
} // end of class
