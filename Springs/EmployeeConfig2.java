package com.bcits.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.bcits.springcoreannotation.bean.DepartmentBean;
import com.bcits.springcoreannotation.bean.EmployeeBean;

@Import(DepartmentConfig.class)
@Configuration
public class EmployeeConfig2 {
	@Bean
	public EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setName("abhilash");
		employeeBean.setAge(22);
		//employeeBean.setDepartmentBean(getDepartmentBean());
		return employeeBean;
	}
}
