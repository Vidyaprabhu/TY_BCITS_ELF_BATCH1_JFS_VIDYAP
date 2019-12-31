package com.bcits.ExceptionHandling.CheckedException;

public class calculator {

	String name;
	void division(int a,int b) {
		try {
			Class.forName("Person");			
		}catch(ClassNotFoundException c) {
			System.out.println("class is not found");
		}
	}
	
}
