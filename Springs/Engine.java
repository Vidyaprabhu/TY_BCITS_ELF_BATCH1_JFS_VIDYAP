package com.bcits.springcoreannotation.bean;

import lombok.Data;

@Data
public class Engine {
	
	private double cc;
	private String type;
	public double getCc() {
		return cc;
	}
	public void setCc(double cc) {
		this.cc = cc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
