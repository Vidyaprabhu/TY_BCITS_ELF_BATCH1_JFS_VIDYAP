package com.bcits.jpawithhibernateapp.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateapp1.bean.EmployeePrimaryInfo;

public class DeleteEmployee {
	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			EmployeePrimaryInfo info = manager.find(EmployeePrimaryInfo.class, 232);
			manager.remove(info);
			transaction.commit();
			System.out.println("Record Deleted");
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
}
