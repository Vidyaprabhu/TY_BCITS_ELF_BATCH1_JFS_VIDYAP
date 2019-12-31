package com.bcits.CreatingThread;

public class Thread3 extends Thread {
	public synchronized void run() {
		System.out.println("thread is called");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				wait();
			} catch (InterruptedException e) {
        System.out.println(e.getMessage());
			}
		}
	}
	 synchronized void leaveme(){
		 System.out.println("notify called");
		 notifyAll();
	 }
}
