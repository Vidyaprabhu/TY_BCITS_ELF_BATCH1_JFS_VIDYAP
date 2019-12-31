package com.bcits.ExceptionHandling.UncheckedException.CustomUnChecked;

public class AgeLimitException extends RuntimeException{
	String msg="Age is less than 18";
	AgeLimitException() {
	}
	AgeLimitException(String msg){
		this.msg=msg;
	}
	public String getMessage(){
		return this.msg;
	}
}
