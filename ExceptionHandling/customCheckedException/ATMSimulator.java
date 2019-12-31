package com.bcits.ExceptionHandling.customCheckedException;

public class ATMSimulator {
	int balance=40000;
	void withdraw(int amount) throws InsufficientBalance{
		if(amount<balance) {
		System.out.println("withdraw amount successfully");
	}else {
		throw new InsufficientBalance();
	}
	}

}
