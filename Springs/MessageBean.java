package com.bcits.springcore.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBean implements InitializingBean, DisposableBean {
//	public MessageBean() {
//		System.out.println("it's instatiation phase");
//	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

//	public void init() {
//		System.out.println("it's Initialization phase");
//	}
//	
//	public void destroy() {
//		System.out.println("it's destruction phase");
//	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init phase");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroying");
	}

}
