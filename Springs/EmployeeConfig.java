package com.bcits.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.bcits.springcoreannotation.bean.EmployeeBean;
@Configuration
public class EmployeeConfig {
	@Bean
	//@Scope("prototype")
	public EmployeeBean getEmployeeBean() {
//		EmployeeBean employeeBean = new EmployeeBean();
//		employeeBean.setName("ashin");
//		employeeBean.setAge(23);
		return new EmployeeBean();
		
	}

}
