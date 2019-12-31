package com.bcits.UncheckedExceptionUsingTryCatch;

public class Test {
public static void main(String[] args) {
	String name=null;
	System.out.println("main started");
	try {
		try {
		System.out.println(name.length());
		}catch(NullPointerException n) {
			System.out.println(n.getMessage());
		}
		System.out.println(10/0);
	}catch(ArithmeticException  a) {
		System.out.println(a.getMessage());
	}
	System.out.println("main ended");
}
}
