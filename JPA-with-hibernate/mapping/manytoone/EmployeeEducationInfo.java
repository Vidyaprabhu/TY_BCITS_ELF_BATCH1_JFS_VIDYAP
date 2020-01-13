package com.bcits.jpawithhibernateapp.manytoone;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.bcits.jpawithhibernateapp1.bean.EmployeePrimaryInfo;

import lombok.Data;

public class EmployeeEducationInfo implements Serializable {
	private int empid;
	private String educationType;
	private String collegeName;
	private Date yearOfPassedout;
	private String stream;
	private double percentage;
	
	
}
