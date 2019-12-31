package com.bcits.CreatingThread;

public class Threadtest3 {
	public static void main(String[] args) {
		System.out.println("main started");
		Thread3 t1 = new Thread3();
		Thread3 t2 = new Thread3();

		t1.start();
		t2.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		t1.leaveme();
		t2.leaveme();
		System.out.println("main ended");
	}
}
