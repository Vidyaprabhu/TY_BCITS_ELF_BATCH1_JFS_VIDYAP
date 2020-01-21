package com.bcits.discomusecase.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data 
@Entity
@Table(name = "employee_info")
public class EmployeeInfo implements Serializable{
	@Id
	@Column(name="emp_id")
	private int empId;
	@Column
	private String name;
	@Column
	private String designation;
	@Column
	private String region;
	@Column(name="no_of_consumer")
	private int noOfConsumer;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getNoOfConsumer() {
		return noOfConsumer;
	}
	public void setNoOfConsumer(int noOfConsumer) {
		this.noOfConsumer = noOfConsumer;
	}

}
