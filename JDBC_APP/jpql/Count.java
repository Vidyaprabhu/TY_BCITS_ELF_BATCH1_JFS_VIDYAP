package com.bcits.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Count {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
		EntityManager manager=factory.createEntityManager();
		String jpql="select count(*) from EmployeePrimaryInfo";
		Query query=manager.createQuery(jpql);
		Object count=query.getSingleResult();
		System.out.println(count);
	}

}
