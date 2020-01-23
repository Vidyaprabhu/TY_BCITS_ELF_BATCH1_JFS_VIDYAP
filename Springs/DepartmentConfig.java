package com.bcits.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bcits.springcoreannotation.bean.DepartmentBean;
@Configuration
public class DepartmentConfig {
	@Bean(name="HR")
	//@Primary
	public DepartmentBean getDepartmentHR() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(102);
		departmentBean.setDeptName("HR");
		return departmentBean;
	}
	@Bean(name="Acc")
	public DepartmentBean getDepartmentAccount() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(102);
		departmentBean.setDeptName("Account");
		return departmentBean;
	}
	@Bean(name="Test")
	public DepartmentBean getDepartmentTest() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(102);
		departmentBean.setDeptName("Test");
		return departmentBean;
	}


}
