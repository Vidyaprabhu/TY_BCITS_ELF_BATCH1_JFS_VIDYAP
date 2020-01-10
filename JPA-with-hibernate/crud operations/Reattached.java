package com.bcits.jpawithhibernateapp.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.bcits.jpawithhibernateapp1.bean.EmployeePrimaryInfo;

public class Reattached {
	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			EmployeePrimaryInfo info = manager.find(EmployeePrimaryInfo.class, 104);
			System.out.println(manager.contains(info));
			manager.detach(info);
			EmployeePrimaryInfo reattached= manager.merge(info);
			
			System.out.println(manager.contains(info));
			System.out.println("executed");
			reattached.setDesignation("hr");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
}
