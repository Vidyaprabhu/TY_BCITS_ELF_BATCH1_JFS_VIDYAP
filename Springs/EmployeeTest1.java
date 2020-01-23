package com.bcits.springcoreannotation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bcits.springcoreannotation.bean.EmployeeBean;
import com.bcits.springcoreannotation.config.EmployeeConfig;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
	    ((ConfigurableApplicationContext)context).registerShutdownHook();
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		System.out.println("enter the name");
		employeeBean.setName(sc.nextLine());
		System.out.println("enter the age");
		employeeBean.setAge(sc.nextInt());
		sc.nextLine();

		EmployeeBean employeeBean2 = context.getBean(EmployeeBean.class);
		System.out.println("enter the name");
		employeeBean2.setName(sc.nextLine());
		System.out.println("enter the age");
		employeeBean2.setAge(sc.nextInt());

		System.out.println("Employee1 Name: " + employeeBean.getName());
		System.out.println("Employee1 age:" + employeeBean.getAge());
		System.out.println("-------------------------------");
		System.out.println("Employee2 Name: " + employeeBean2.getName());
		System.out.println("Employee2 age:" + employeeBean2.getAge());
	}

}
