package com.bcits.ExceptionHandling.customCheckedException;

public class InsufficientBalance extends Exception {
	String msg="Insufficient balance";
	public InsufficientBalance() {
		
	}
	InsufficientBalance(String msg){
		this.msg=msg;
	}
	public String getMessage(){
		return this.msg;
	}

}
