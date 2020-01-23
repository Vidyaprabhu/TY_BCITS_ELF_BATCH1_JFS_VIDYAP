package com.bcits.springcoreannotation.bean;

import lombok.Data;

@Data
public class Car {
	private String company;
	private Engine Engine;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Engine getEngine() {
		return Engine;
	}
	public void setEngine(Engine engine) {
		Engine = engine;
	}

}
