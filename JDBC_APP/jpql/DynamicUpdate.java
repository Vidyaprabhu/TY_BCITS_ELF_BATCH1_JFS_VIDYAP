package com.bcits.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdate {
	public static void main(String[] args) {
		EntityManager manager=null;
		EntityTransaction transaction =null;
		try {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
		manager = factory.createEntityManager();
		transaction =manager.getTransaction();
		transaction.begin();
		String jpql="update EmployeePrimaryInfo set name=:nm where id=:id";
		Query query=manager.createQuery(jpql);
		query.setParameter("id", 222);
		query.setParameter("nm", "nayana");
		int count =query.executeUpdate();
		
		System.out.println("Number of rows affected-->"+count);
		transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			manager.close();
		}
	}

}
