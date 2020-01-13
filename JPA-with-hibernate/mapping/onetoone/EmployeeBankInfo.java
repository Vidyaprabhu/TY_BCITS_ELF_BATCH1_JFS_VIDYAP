package com.bcits.jpawithhibernateapp.onetoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bcits.jpawithhibernateapp1.bean.EmployeePrimaryInfo;

@Entity
@Table(name="employee_bank_info")
public class EmployeeBankInfo implements Serializable{
	@Id	
	private int empid;
	@Column
	private long accountNo;
	@Column
	private String bankName;
	@Column
	private String branchName;
	
	@MapsId
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="empid")
private EmployeePrimaryInfo primary1;
	
	public EmployeePrimaryInfo getPrimary1() {
		return primary1;
	}
	public void setPrimary1(EmployeePrimaryInfo primary1) {
		this.primary1 = primary1;
		}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	private String ifscCode;
	

}
