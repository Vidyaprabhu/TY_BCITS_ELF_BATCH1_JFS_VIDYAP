package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchEmployeeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String empIdVal= req.getParameter("empId");
		
		PrintWriter out =resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Emp ID ="+ empIdVal +"</h1>");
		out.print("Emp name= Devraj<br>");
		out.print("Emp Age =60<br>");
		out.print("Salary =100000/-<br>");
		out.print("Designation= SD");
		out.print("</body>");
		out.print("</html>");
	}

}
