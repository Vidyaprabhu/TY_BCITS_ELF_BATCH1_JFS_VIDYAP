package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bcits.empwebapp.bean.EmployeePrimaryInfo;

@WebServlet("/getEmployee")
public class GetEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// validate the session
		HttpSession session = req.getSession(false);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		if (session != null) {
			// valid session
			// get the form data
			String empIdVal = req.getParameter("empId");
			int empId = Integer.parseInt(empIdVal);

			// search record in DB
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("emsPersistenceUnit");
			EntityManager manager = emf.createEntityManager();

			EmployeePrimaryInfo employeePrimaryInfo = manager.find(EmployeePrimaryInfo.class, empId);
			if (employeePrimaryInfo != null) {
				// display employee record
				EmployeePrimaryInfo loggedInfoEmpInfo = (EmployeePrimaryInfo)session.getAttribute("employeePrimaryInfo");
				
				out.println("<html>");
				out.println("<body>");
				out.println("<h1>Hello "+loggedInfoEmpInfo.getName()+ "!</h1>");
				out.println("<a href='./employeehome.html'>HOME</a><br>");
				out.println("<h1 style='color: green'>Employee ID " + empId + " Found </h1>");
				out.println("Name=" + employeePrimaryInfo.getName());
				out.println("<br>Designation=" + employeePrimaryInfo.getDesignation());
				out.println("<br>Salary=" + employeePrimaryInfo.getSalary());
				out.println("<br>Mobile=" + employeePrimaryInfo.getMobileNo());
				out.println("</body>");
				out.println("</html>");
			}else {
				//display empId not found
				out.println("<html>");
				out.println("<body>");
				out.println("<h2 style='color:red'>Employee ID "+ empId +" Not Found <h2>");
				out.println("</body>");
				out.println("</html>");
				
			}
			manager.close();
			emf.close();

		} else {

			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'>please login first</h1>");
			out.println("</body>");
			out.println("</html>");

			RequestDispatcher dispatcher = req.getRequestDispatcher("./LoginForm.html");
			dispatcher.include(req, resp);
		}

	}// End of doGet
}// End of class
