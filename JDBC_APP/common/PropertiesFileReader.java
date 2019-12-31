package com.bcits.myproperties.common;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileReader {
	public static void main(String[] args) {
		try {
			FileInputStream inputStream = new FileInputStream("dbInfo.properties");
			Properties properties = new Properties();
			properties.load(inputStream);
			System.out.println("DriverName--->" + properties.getProperty("driverNm"));
			System.out.println("DbURL--->" + properties.getProperty("dbURL"));
			System.out.println("user-->" + properties.getProperty("user"));
			System.out.println("password-->" + properties.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
