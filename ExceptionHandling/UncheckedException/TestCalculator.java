package com.bcits.ExceptionHandling.UncheckedException;

public class TestCalculator {
public static void main(String[] args) {
	System.out.println("main started");
	calculator c1=new calculator();
	c1.division(20, 5);
	c1.division(100, 5);
	c1.division(20,4);
	c1.division(100, 20);
	System.out.println("main ended");
	}
}
