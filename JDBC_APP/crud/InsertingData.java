package com.bcits.jpawithhibernateapp.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateapp1.bean.EmployeePrimaryInfo;

public class InsertingData {
	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		EmployeePrimaryInfo test = new EmployeePrimaryInfo();
		test.setId(124);
		test.setName("shruthi");
		test.setEmail("shruthi@gmail.com");
		test.setDateOfBirth(java.sql.Date.valueOf("1992-02-11"));
		test.setBloodGroup("a+");
		test.setDesignation("software developer");
		test.setDeptID(10);
		test.setManagerID(123);
		test.setSalary(25000);
		test.setMobileNo(614415421);
		test.setDateOfJoining(java.sql.Date.valueOf("2019-12-01"));

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(test);
			System.out.println("Record Saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}
	}
}
