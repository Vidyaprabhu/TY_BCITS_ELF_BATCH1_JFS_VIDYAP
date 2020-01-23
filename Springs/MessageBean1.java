package com.bcits.springcoreannotation.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;

import lombok.Data;

@Data
public class MessageBean implements InitializingBean,DisposableBean {

	public MessageBean(){
		System.out.println("it's istantitaion phase");
	}
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("it's destroy phase");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("it's initialization phase...");
	}
	

}
