package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Get the form data
		String empIdVal = req.getParameter("empid");
		String nameVal = req.getParameter("empName");
		String designationVal = req.getParameter("designation");
		String SalaryVal = req.getParameter("salary");
		String mobileVal = req.getParameter("mobileNo");
		String bloodGroupVal = req.getParameter("bloodGroup");
		String mailVal = req.getParameter("email");
		String joiningDateVal = req.getParameter("dateOfJoining");
		String dateOfBirthVal = req.getParameter("dateOfBirth");
		String passwordVal = req.getParameter("password");

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		Date joiningDate = null;
		try {
			joiningDate = dateFormat.parse(joiningDateVal);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date dateOfBirth = null;
		try {
			dateOfBirth = dateFormat.parse(dateOfBirthVal);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		EmployeePrimaryInfo info = new EmployeePrimaryInfo();
		info.setEmpid(Integer.parseInt(empIdVal));
		info.setName(nameVal);
		info.setDesignation(designationVal);
		info.setSalary(Double.parseDouble(SalaryVal));
		info.setMobileNo(Long.parseLong(mobileVal));
		info.setBloodGroup(bloodGroupVal);
		info.setPassword(passwordVal);
		info.setEmail(mailVal);
		info.setDateOfJoining(joiningDate);
		info.setDateOfBirth(dateOfBirth);

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
		}
		manager.close();
		emf.close();
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");
		if (isAdded) {
			out.println("<h1 style='color:green'> Employee Id " + empIdVal + " added successfully</h1>");
		} else {
			out.println("<h1 style='color:red'> Employee Id " + empIdVal + " not added</h1>");
		}
		out.println("</html>");
		out.println("</body>");
	}

}
