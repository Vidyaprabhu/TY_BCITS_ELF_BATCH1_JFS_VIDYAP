package com.bcits.jpawithhibernateapp.onetoone;

import java.io.Serializable;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bcits.jpawithhibernateapp1.bean.EmployeePrimaryInfo;
@Data
@Entity
@Table(name="employee_secondary_info")
public class EmployeeSecondaryInfo implements Serializable {
	@Id
	private int empid;
	@Column
	private String gender;
	@Column
	private String personalEmailID;
	@Column
	private int age;
	@Column
	private String nationality;
	@Column
	private String isMarried;
	@Column
	private String govtID;
	@Column
	private String guardianName;
	@Column
	private long guardianPhoneNo;
	@Column
	private int managerID;
	@Column
	private String jobLocation;
	
	@MapsId
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="empid")
	
	private EmployeePrimaryInfo primary;
	
	
	

}
