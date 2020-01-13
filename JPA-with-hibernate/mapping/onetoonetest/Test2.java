package com.bcits.jpawithhibernateapp.onetoonetest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateapp.onetoone.EmployeeBankInfo;
import com.bcits.jpawithhibernateapp1.bean.EmployeePrimaryInfo;

public class Test2 {
	public static void main(String[] args) {
		EntityManager manager=null;
		EntityTransaction transaction =null;
		EmployeePrimaryInfo test=new EmployeePrimaryInfo();
		EmployeeBankInfo info= new EmployeeBankInfo();
		test.setEmpid(142);
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
		info.setAccountNo(475683123);
		info.setBankName("ICICI");
		info.setBranchName("Srinagar");
		info.setIfscCode("icici123");
		info.setPrimary1(test);
		test.setBankInfo(info);
		try {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
		manager= factory.createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		//manager.persist(info);
		EmployeeBankInfo priInfo=manager.find(EmployeeBankInfo.class, 142);
		System.out.println(priInfo.getAccountNo());
		System.out.println(priInfo.getPrimary1().getDesignation());
		
		System.out.println("Record saved");
		transaction.commit();
	}catch(Exception e) {
		e.printStackTrace();
		transaction.rollback();
	} finally {
		manager.close();
	}

	}
	}

