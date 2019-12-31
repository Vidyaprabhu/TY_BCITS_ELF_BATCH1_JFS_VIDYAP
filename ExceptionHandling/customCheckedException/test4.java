package com.bcits.ExceptionHandling.customCheckedException;

public class test4 {
public static void main(String[] args) {
	System.out.println("main started");
	ATMSimulator a1=new ATMSimulator();
	try {
		a1.withdraw(41000);
		}catch(InsufficientBalance a)
	{
			System.out.println(a.getMessage());
	}
	System.out.println("main ended");
}
}
