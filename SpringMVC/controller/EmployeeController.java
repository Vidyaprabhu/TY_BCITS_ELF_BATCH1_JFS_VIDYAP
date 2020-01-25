package com.bcits.springmvc1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.bcits.springmvc.bean.EmployeeInfoBean;
import com.bcits.springmvc.employeedao.EmployeeDAO;
import com.bcits.springmvc.employeedao.EmployeeDAOImplementation;
import com.bcits.springmvc.service.EmployeeService;
import com.bcits.springmvc.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	//@Autowired
	private EmployeeService service=new EmployeeServiceImpl();
	//private EmployeeDAO service= new EmployeeDAOImplementation();
	
	@GetMapping("/login")
	public String displayLoginForm() {
		return "empLoginForm";
	}

	@PostMapping("/login")
	public String authenticate(int empId, String password, HttpServletRequest req, ModelMap modelMap) {
		
		EmployeeInfoBean employeeInfoBean = service.authenticate(empId, password);

		if (employeeInfoBean != null) {
			// valid credentials
			HttpSession session = req.getSession(true);
			session.setAttribute("loggedInEmpInfo", employeeInfoBean);
			return "employeeHome";
		} else {
			// invalid credentials
			modelMap.addAttribute("errMsg", "Invalid Credentials");
			return "empLoginForm";
		}
	}

	@GetMapping("/searchEmp")
	public String displaySearchEmployeeForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// user not logged in
			session.invalidate();

			modelMap.addAttribute("errMsg", "please login First");
			return "empLoginForm";
		} else {
			return "searchEmp";
		}
	}

	@GetMapping("/search")
	public String searchEmployee(int empId, HttpSession session, ModelMap modelMap) {

		if (session.getAttribute("loggedInEmpInfo") != null) {
			// valid session
			
			EmployeeInfoBean employeeInfoBean = service.getEmployee(empId);

			if (employeeInfoBean != null) {
				modelMap.addAttribute("employeeInfoBean", employeeInfoBean);
			} else {
				modelMap.addAttribute("errMsg", "Employee Id not found");
			}
			return "searchEmp";
		} else {
			// Invalid session
			modelMap.addAttribute("errMsg", "please login first");
			return "empLoginForm";
		}
	}

	@GetMapping("/deleteEmpForm")
	public String displayDeleteEmployeeForm(
			@SessionAttribute(name="loggedInEmpInfo", required = false ) EmployeeInfoBean employeeInfoBean, ModelMap modelMap) {
		if(employeeInfoBean != null){
			return "deleteEmpForm";
		}else {
			modelMap.addAttribute("errMsg","please login first");
			return "empLoginForm";
		}
		}
	
	@GetMapping("/delete")
	public String deleteEmployee(int empId,
			@SessionAttribute(name = "loggedInEmpInfo", required = false) EmployeeInfoBean employeeInfoBean,
			ModelMap modelMap) {
		
		if(employeeInfoBean != null) {
			if(service.deleteEmployee(empId)) {
				modelMap.addAttribute("msg","Employee Record Deleted Successfully");
				}else {
					modelMap.addAttribute("errMsg","Employee Id not found");
				}
			return "deleteEmpForm";
			
		}else {
			modelMap.addAttribute("errMsg","Please login first");
			return "empLoginForm";
		}
		
	}
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap) {
		session.invalidate();
		modelMap.addAttribute("errMsg","You  are successfully logged out");
		return "empLoginForm";
	}

}
