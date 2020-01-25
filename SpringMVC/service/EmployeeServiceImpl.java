package com.bcits.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcits.springmvc.bean.EmployeeInfoBean;
import com.bcits.springmvc.employeedao.EmployeeDAO;
import com.bcits.springmvc.employeedao.EmployeeDAOImplementation;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDAO dao=new EmployeeDAOImplementation();

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		return dao.authenticate(empId, password);
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean bean) {
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		if(empId<1) {
			return false;
		}
		return dao.deleteEmployee(empId);
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean bean) {
		return false;
	}

	@Override
	public EmployeeInfoBean getEmployee(int empId) {
		return dao.getEmployee(empId);
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		return null;
	}
	

}
