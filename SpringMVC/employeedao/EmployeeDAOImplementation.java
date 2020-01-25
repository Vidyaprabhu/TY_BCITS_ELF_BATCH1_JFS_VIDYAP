package com.bcits.springmvc.employeedao;

import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bcits.springmvc.bean.EmployeeInfoBean;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {
	
//	@PersistenceUnit
//	private EntityManagerFactory emf;
	private EntityManagerFactory emf= Persistence.createEntityManagerFactory("emsPersistenceUnit");
	
	EntityManager manager = null;

	@Override
	public boolean addEmployee(EmployeeInfoBean bean) {
		manager = emf.createEntityManager();
		if (bean != null) {
			EntityTransaction trc = manager.getTransaction();
			try {
				trc.begin();
				manager.persist(bean);
				trc.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		manager.close();
		emf.close();
		return false;
	}

	@Override
	
	public boolean deleteEmployee(int empId) {
		boolean isDeleted = false;
		manager = emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);
		if (employeeInfoBean != null) {
			EntityTransaction trc =manager.getTransaction();
			trc.begin();
			manager.remove(employeeInfoBean);
			trc.commit();
			return true;
		}
		manager.close();
		emf.close();
		return false;
	}

	@Override
	
	public boolean updateEmployee(EmployeeInfoBean bean) {

		return false;
	}

	@Override

	public EmployeeInfoBean getEmployee(int empId) {
		manager = emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);
		if (employeeInfoBean != null) {
			return employeeInfoBean;
		}
		manager.close();
		emf.close();
		return null;
	}

	@Override
	
	public List<EmployeeInfoBean> getAllEmployees() {
		manager = emf.createEntityManager();
		String jpql = "from EmployeeInfoBean";
		Query query = manager.createQuery(jpql);
		// @SuppressWarnings("unchecked")
		List<EmployeeInfoBean> list = query.getResultList();

		manager.close();
		emf.close();
		return list;
	}

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		manager = emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);
		if (employeeInfoBean != null && employeeInfoBean.getPassword().equals(password)) {
			return employeeInfoBean;
		} else {
			return null;
		}
	}
}
