package com.bcits.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bcits.springcoreannotation.bean.EmployeeBean;
import com.bcits.springcoreannotation.config.EmployeeConfig2;

public class EmployeeTest2 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig2.class);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);

		System.out.println("Emp name= " + employeeBean.getName());
		System.out.println("Emp age= " + employeeBean.getAge());
		System.out.println("Dept name = " + employeeBean.getDepartmentBean().getDeptName());
		System.out.println("Dept Id = " + employeeBean.getDepartmentBean().getDeptId());
	}
}
