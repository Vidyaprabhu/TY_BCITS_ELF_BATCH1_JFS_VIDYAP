package com.bcits.ExceptionHandling.UncheckedException.CustomUnChecked;

public class Test2 {
public static void main(String[] args) {
	System.out.println("main started");
    Election e1=new Election();
    try {
    	e1.vote(12);
       }catch(AgeLimitException a) {
    	   System.out.println(a.getMessage());
       }
    System.out.println("main ended");
}
}
