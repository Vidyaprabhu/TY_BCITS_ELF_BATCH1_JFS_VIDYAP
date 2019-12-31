package com.bcits.ExceptionHandling.customCheckedException;

public class Test {
	public static void main(String[] args) {
		person p = new person();
		System.out.println("main started");
		try {
			p.clone();
			System.out.println("object cloned");
		} catch (CloneNotSupportedException e) {
			e.getMessage();
		}
		System.out.println("main ended");
	}

}