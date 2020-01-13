package com.bcits.jpawithhibernateapp.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class EmployeeAddressPK implements Serializable {
	private int empid;
	private String addressType;

}
