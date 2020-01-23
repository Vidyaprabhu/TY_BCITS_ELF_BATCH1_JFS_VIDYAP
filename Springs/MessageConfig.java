package com.bcits.springcoreannotation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bciits.springannotation.mypostprocessors.MyBeanFactoryPostProcessor;
import com.bciits.springannotation.mypostprocessors.MyBeanPostProcessor;
import com.bcits.springcoreannotation.bean.MessageBean;

@Configuration
public class MessageConfig {
	@Bean(name="messageBean")
	public MessageBean getMessageBean() {
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("Wlecome to spring core...");
		return messageBean;
	}//End of getMessageBean()
	@Bean
	public MyBeanPostProcessor getMyBPP() {
		return new MyBeanPostProcessor();
	}
	@Bean

	public MyBeanFactoryPostProcessor getMyBFPP() {
		return new MyBeanFactoryPostProcessor();
	}
}//End of class
