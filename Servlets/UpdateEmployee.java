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

@WebServlet("/updateEmployee")
public class UpdateEmployee extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Get the form data
		String empIdVal = req.getParameter("empid");
		int empId = Integer.parseInt(empIdVal);
		String nameVal = req.getParameter("empName");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction trc = manager.getTransaction();
		trc.begin();
		EmployeePrimaryInfo employeePrimaryInfo = manager.find(EmployeePrimaryInfo.class, empId);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		if (employeePrimaryInfo != null) {
			employeePrimaryInfo.setName(nameVal);
			
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color: green'>Employee ID " + empId + " Found and updated<h1>");
			out.println("</body>");
			out.println("</html>");
		} else {
			// display empId not found
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'>Employee ID " + empId + " Not Found -<h1>");
			out.println("</body>");
			out.println("</html>");
		}
		trc.commit();
		manager.close();
		emf.close();
	}// End of doGet
}// End of class
