package com.bcits.discomusecase.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;;

@Data 
@Entity
@Table(name = "consumer_info")
public class ConsumerInfo implements Serializable{

	@Id
	@Column(name="meter_number")
	private long meterNo;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="mobile_number")
	private long mobileNo;
	@Column
	private String email;
	@Column
	private String address;
	@Column
	private String region;
	@Column
	private String password;
	@Column(name="type_of_consumer")
	private String typeOfConsumer;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getMeterNo() {
		return meterNo;
	}
	public void setMeterNo(long meterNo) {
		this.meterNo = meterNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getTypeOfConsumer() {
		return typeOfConsumer;
	}
	public void setTypeOfConsumer(String typeOfConsumer) {
		this.typeOfConsumer = typeOfConsumer;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
