package com.bcits.springcoreannotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;
@Data
public class EmployeeBean {

	private String name;
	private int age;
	@Autowired(required= false)
	@Qualifier("HR")
	private DepartmentBean departmentBean;
	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}
	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	@PostConstruct
//	public void init() {
//		System.out.println("it's init phase");
//	}
//	@PreDestroy
//	public void destroy() {
//		System.out.println("it's destroy phase");
//	}
}
