package com.bcits.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bcits.jpawithhibernateapp1.bean.EmployeePrimaryInfo;

public class ReadEmployee {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
		EntityManager manager=factory.createEntityManager();
		String jpql="from EmployeePrimaryInfo";
		Query query=manager.createQuery(jpql);
		List<EmployeePrimaryInfo> list=query.getResultList();
		for (EmployeePrimaryInfo employeePrimaryInfo : list) {
			System.out.println("Employee id-->"+employeePrimaryInfo.getId());
			System.out.println("Employee name-->"+employeePrimaryInfo.getName());
			System.out.println("Employee Email-->"+employeePrimaryInfo.getEmail());
			System.out.println("Employee dept id-->"+employeePrimaryInfo.getDeptID());
			System.out.println("Employee mobile number-->"+employeePrimaryInfo.getMobileNo());
			System.out.println("Employee manager id-->"+employeePrimaryInfo.getManagerID());
			System.out.println("Employee date of birth-->"+employeePrimaryInfo.getDateOfBirth());
			System.out.println("Employee date of joining-->"+employeePrimaryInfo.getDateOfJoining());
			System.out.println("Employee designation-->"+employeePrimaryInfo.getDesignation());
			System.out.println("Employee blood group-->"+employeePrimaryInfo.getBloodGroup());
			System.out.println("Employee salary-->"+employeePrimaryInfo.getSalary());
			System.out.println("===================================");
			
		}
		manager.close();
	}

}
