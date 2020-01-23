package com.bcits.springcoreannotation.bean;

import com.bcits.springannotation.intefaces.Animal;

public class Elephant implements Animal{

	@Override
	public void eat() {
		System.out.println("esting sugarcane...");
	}

	@Override
	public void speak() {
		System.out.println("trumpating..");
	}
	

}
