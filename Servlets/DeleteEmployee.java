package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcits.empwebapp.bean.EmployeePrimaryInfo;
@WebServlet("/deleteEmployee")
public class DeleteEmployee extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Get the form data
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		EmployeePrimaryInfo employeePrimaryInfo = manager.find(EmployeePrimaryInfo.class, empId);
		manager.remove(employeePrimaryInfo);
		transaction.commit();
		
		//Generate Dynamic Response
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
			//display empId not found
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'>Employee ID "+ empId +" deleted-<h1>");
			out.println("</body>");
			out.println("</html>");
			
		
		manager.close();
		emf.close();
	}
}
