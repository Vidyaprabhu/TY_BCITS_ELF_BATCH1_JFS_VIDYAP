package com.bcits.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bcits.springcore.bean.EmployeeBean;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
		
		EmployeeBean employee = (EmployeeBean) context.getBean("employee");
		
//		System.out.print("enter the name: ");
//		employee.setName(sc.nextLine());
//		System.out.print("enter the age: ");
//		employee.setAge(sc.nextInt());
//		sc.nextLine();
//		System.out.print("enter the name: ");
//		employee2.setName(sc.nextLine());
//		System.out.print("enter the age: ");
//		employee2.setAge(sc.nextInt());
//		System.out.println("name:"+employee2.getName());
//		System.out.println("age:"+employee2.getAge());
		
		System.out.println("name:"+employee.getName());
		System.out.println("age:"+employee.getAge());
		System.out.println("deptId:"+employee.getDepartmentBean().getDeptId());
		System.out.println("deptName:"+employee.getDepartmentBean().getDeptName());
		sc.close();
	}
}