package com.bcits.jpawithhibernateapp.onetoonetest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateapp.onetoone.EmployeeSecondaryInfo;
import com.bcits.jpawithhibernateapp1.bean.EmployeePrimaryInfo;

public class Test1 {
public static void main(String[] args) {
	EntityManager manager = null;
	EntityTransaction transaction = null;
	EmployeePrimaryInfo test = new EmployeePrimaryInfo();
	test.setEmpid(147);
	test.setName("shruthi");
	test.setEmail("shruthi@gmail.com");
	test.setDateOfBirth(java.sql.Date.valueOf("1992-02-11"));
	test.setBloodGroup("a+");
	test.setDesignation("software developer");
	test.setDeptID(10);
	test.setManagerID(123);
	test.setSalary(25000);
	test.setMobileNo(9144154);
	test.setDateOfJoining(java.sql.Date.valueOf("2019-12-01"));
	
	
	EmployeeSecondaryInfo info=new EmployeeSecondaryInfo();
	info.setAge(23);
	info.setGender("female");
	info.setGovtID("pan");
	info.setGuardianName("bavana");
	info.setGuardianPhoneNo(7845126);
	info.setIsMarried("no");
	info.setJobLocation("mysore");
	info.setManagerID(134);
	info.setNationality("indian");
	info.setPersonalEmailID("shruthiun@gmail.com");
	info.setPrimary(test);
	test.setSecondaryInfo(info);
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		manager = entityManagerFactory.createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		//manager.persist(info);
		EmployeeSecondaryInfo secInfo= manager.find(EmployeeSecondaryInfo.class, 147);
		System.out.println(secInfo.getEmpid());
		System.out.println(secInfo.getPrimary().getSalary());
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
