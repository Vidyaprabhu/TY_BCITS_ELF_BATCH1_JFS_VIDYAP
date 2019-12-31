package com.bcits.CreatingThread;

public class ThreadTest {
public static void main(String[] args) {
	System.out.println("main started");
	Thread1 t1=new Thread1();
	Thread1 t2=new Thread1();
	Thread t3=new Thread(t1);
	Thread t4=new Thread(t2);
	t4.start();
	t3.start();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		System.out.println(e.getMessage());
	}
	System.out.println("main ended");	
}
}
