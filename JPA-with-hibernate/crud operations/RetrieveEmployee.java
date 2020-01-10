package com.bcits.jpawithhibernateapp.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateapp1.bean.EmployeePrimaryInfo;

public class RetrieveEmployee {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = entityManagerFactory.createEntityManager();
		//EmployeePrimaryInfo info = manager.find(EmployeePrimaryInfo.class, 1014);
		
		EmployeePrimaryInfo info = manager.getReference(EmployeePrimaryInfo.class, 1104);
		System.out.println(info.getName());
//		System.out.println("Employee Id-->"+info.getId());
//		System.out.println("Employee name-->"+info.getName());
//		System.out.println("Employee email-->"+info.getEmail());
//		System.out.println("Employee designation-->"+info.getDesignation());
//		System.out.println("Employee date of birth-->"+info.getDateOfBirth());
//		System.out.println("Employee date of joining-->"+info.getDateOfJoining());
//		System.out.println("Employee blood group-->"+info.getBloodGroup());
//		System.out.println("Employee department ID-->"+info.getDeptID());
//		System.out.println("Employee manager ID-->"+info.getManagerID());
//		System.out.println("Employee Mobile number-->"+info.getMobileNo());
		System.out.println("=====================================");
		manager.close();
	}
}
