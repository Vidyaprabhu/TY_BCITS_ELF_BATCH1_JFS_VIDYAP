package com.bcits.discomusecase.servlets;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcits.discomusecase.bean.ConsumerInfo;

@WebServlet("/signup")
public class SignUpConsumer extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String firstNameVal = req.getParameter("firstName");
		String lastNameVal = req.getParameter("lastName");
		String meterNoVal = req.getParameter("meterNo");
		String mobileNoVal = req.getParameter("mobileNo");
		String emailVal = req.getParameter("email");
		String addressVal = req.getParameter("address");
		String regionVal = req.getParameter("region");
		String typeOfConsumerVal = req.getParameter("typeOfConsumer");
		String passwordVal= req.getParameter("password");

		ConsumerInfo info = new ConsumerInfo();
		info.setFirstName(firstNameVal);
		info.setLastName(lastNameVal);
		info.setMeterNo(Long.parseLong(meterNoVal));
		info.setMobileNo(Long.parseLong(mobileNoVal));
		info.setEmail(emailVal);
		info.setAddress(addressVal);
		info.setRegion(regionVal);
		info.setTypeOfConsumer(typeOfConsumerVal);
		info.setPassword(passwordVal);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction trc = manager.getTransaction();
		boolean isAdded = false;
		try {
			trc.begin();
			manager.persist(info);
			trc.commit();
			isAdded = true;
		} catch (Exception e1) {
			e1.printStackTrace();
			trc.rollback();
		} finally {
			manager.close();
			emf.close();
		}
	}
}
