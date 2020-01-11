package com.bcits.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bcits.jpawithhibernateapp1.bean.EmployeePrimaryInfo;

public class FindingName {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		String jpql = "select name from EmployeePrimaryInfo";
		Query query = manager.createQuery(jpql);
		List<String> list = query.getResultList();
		for (String employeePrimaryInfo : list) {
			System.out.println(employeePrimaryInfo);
		}
		manager.close();
	}
}
