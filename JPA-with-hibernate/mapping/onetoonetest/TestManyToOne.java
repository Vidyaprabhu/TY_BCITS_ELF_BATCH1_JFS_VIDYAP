package com.bcits.jpawithhibernateapp.onetoonetest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateapp.manytoone.EmployeeAddressInfo;
import com.bcits.jpawithhibernateapp.manytoone.EmployeeAddressPK;
import com.bcits.jpawithhibernateapp.onetoone.EmployeeSecondaryInfo;
import com.bcits.jpawithhibernateapp1.bean.EmployeePrimaryInfo;

public class TestManyToOne {
	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		EmployeePrimaryInfo test = new EmployeePrimaryInfo();
		test.setEmpid(150);
		test.setName("suresh");
		test.setEmail("suresh@gmail.com");
		test.setDateOfBirth(java.sql.Date.valueOf("1994-07-21"));
		test.setBloodGroup("b+");
		test.setDesignation("tester");
		test.setDeptID(20);
		test.setManagerID(123);
		test.setSalary(20000);
		test.setMobileNo(894144154);
		test.setDateOfJoining(java.sql.Date.valueOf("2018-10-28"));

		EmployeeAddressPK pk = new EmployeeAddressPK();
		pk.setAddressType("present");
		EmployeeAddressInfo info = new EmployeeAddressInfo();
		info.setAddressPk(pk);
		info.setHouseNO("#20");
		info.setAddress2("shivajinagar");
		info.setAddress1("2nd main");
		info.setCity("bangalore");
		info.setPincode(571104);
		info.setLandMark("vijaya bank");
		info.setPrimaryInfo(test);

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			EmployeePrimaryInfo pr=manager.find(EmployeePrimaryInfo.class, 150);
			System.out.println(pr.getAddress().get(0).getAddress1());
			System.out.println(pr.getAddress().get(0).getAddress2());
			
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}

	}
}
