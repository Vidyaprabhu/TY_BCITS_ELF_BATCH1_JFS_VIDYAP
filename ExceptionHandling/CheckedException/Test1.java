package com.bcits.ExceptionHandling.CheckedException;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("main started");
		calculator c1 = new calculator();
		c1.division(100, 5);
		System.out.println("main ended");
	}
}
