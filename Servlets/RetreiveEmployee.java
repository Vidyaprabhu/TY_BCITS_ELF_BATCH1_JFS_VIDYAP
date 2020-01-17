package com.bcits.empwebapp.servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcits.empwebapp.bean.EmployeePrimaryInfo;
@WebServlet("/retrieveEmployee")
public class RetreiveEmployee extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
EntityManagerFactory factory=Persistence.createEntityManagerFactory("emsPersistenceUnit");
	EntityManager manager=factory.createEntityManager();
	String jpql="from EmployeePrimaryInfo";
	Query query=manager.createQuery(jpql);
	List<EmployeePrimaryInfo> list=query.getResultList();
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	out.println("<html>");
	out.println("<body>");	
	for (EmployeePrimaryInfo employeePrimaryInfo : list) {
		out.println("<br>Employee id-->"+employeePrimaryInfo.getEmpid());
		out.println("<br>Employee name-->"+employeePrimaryInfo.getName());
		out.println("<br>Employee Email-->"+employeePrimaryInfo.getEmail());
		out.println("<br>Employee dept id-->"+employeePrimaryInfo.getDeptID());
		out.println("<br>Employee mobile number-->"+employeePrimaryInfo.getMobileNo());
		out.println("<br>Employee date of birth-->"+employeePrimaryInfo.getDateOfBirth());
		out.println("<br>Employee date of joining-->"+employeePrimaryInfo.getDateOfJoining());
		out.println("<br>Employee designation-->"+employeePrimaryInfo.getDesignation());
		out.println("<br>Employee blood group-->"+employeePrimaryInfo.getBloodGroup());
		out.println("<br>Employee salary-->"+employeePrimaryInfo.getSalary());
		out.println("<br>Employee password-->"+employeePrimaryInfo.getPassword());
		out.println("<br>===================================");
	
	}
	out.println("</body>");
	out.println("</html>");
	manager.close();
	factory.close();

}
}
