package com.bcits.springcoreannotation.bean;

import com.bcits.springannotation.intefaces.Animal;

public class Goat implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating grass...");
	}

	@Override
	public void speak() {
		System.out.println("mehh mehh....");
	}
	

}
