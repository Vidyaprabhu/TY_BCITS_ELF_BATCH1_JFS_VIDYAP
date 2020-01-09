package com.bcits.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bcits.jpawithhibernateapp.bean.Test;

public class App {
	public static void main(String[] args) {
		Test test = new Test();
		test.setMid(3);
		test.setMovieName("Ra One");
		test.setMovieRating("Best");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(test);
		System.out.println("Record Saved");
		transaction.commit();
		manager.close();
	}// end of main
}// end of class
