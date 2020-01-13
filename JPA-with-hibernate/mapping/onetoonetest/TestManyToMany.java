package com.bcits.jpawithhibernateapp.onetoonetest;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateapp.manytomany.ProjectInfo;
import com.bcits.jpawithhibernateapp.onetoone.EmployeeSecondaryInfo;
import com.bcits.jpawithhibernateapp1.bean.EmployeePrimaryInfo;

public class TestManyToMany {
	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		EmployeePrimaryInfo test = new EmployeePrimaryInfo();
		test.setEmpid(25);
		test.setName("suma");
		test.setEmail("suma@gmail.com");
		test.setDateOfBirth(java.sql.Date.valueOf("1992-02-11"));
		test.setBloodGroup("a+");
		test.setDesignation("software developer");
		test.setDeptID(10);
		test.setManagerID(123);
		test.setSalary(25000);
		test.setMobileNo(9144154);
		test.setDateOfJoining(java.sql.Date.valueOf("2019-12-01"));
		
//		EmployeePrimaryInfo test1= new EmployeePrimaryInfo();
//		test1.setEmpid(153);
//		test1.setName("sumana");
//		test1.setEmail("sumana@gmail.com");
//		test1.setDateOfBirth(java.sql.Date.valueOf("1987-08-11"));
//		test1.setBloodGroup("b+");
//		test1.setDesignation("hr");
//		test1.setDeptID(20);
//		test1.setManagerID(150);
//		test1.setSalary(35000);
//		test1.setMobileNo(91441546);
//		test1.setDateOfJoining(java.sql.Date.valueOf("2016-01-09"));
//		ArrayList<EmployeePrimaryInfo> alEmployeePrimaryInfos= new ArrayList<EmployeePrimaryInfo>();
//		alEmployeePrimaryInfos.add(test);
//		alEmployeePrimaryInfos.add(test1);
		ArrayList<ProjectInfo> alProjectInfos= new ArrayList<ProjectInfo>();
		
		
		ProjectInfo pr=new ProjectInfo();
		pr.setPid(28);
		pr.setProjectName("HM");
		pr.setEndDate(java.sql.Date.valueOf("2019-10-22"));
		pr.setStartDate(java.sql.Date.valueOf("2020-12-12"));
		pr.setTechnology("java");
		pr.setLocation("bangalore");
		//pr.setPrimaryInfo(alEmployeePrimaryInfos);
		
		ProjectInfo pr1=new ProjectInfo();
		pr1.setPid(29);
		pr1.setProjectName("PM");
		pr1.setEndDate(java.sql.Date.valueOf("2019-10-22"));
		pr1.setStartDate(java.sql.Date.valueOf("2020-12-12"));
		pr1.setTechnology("java");
		pr1.setLocation("pune");
		//pr1.setPrimaryInfo(alEmployeePrimaryInfos);
		alProjectInfos.add(pr);
		alProjectInfos.add(pr1);
		test.setProjectList(alProjectInfos);
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(test);
			System.out.println("record saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}

	}
}
