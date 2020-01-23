package com.bcits.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.bcits.springannotation.intefaces.Animal;

import lombok.Data;

@Data
public class Pet {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	@Autowired
	private Animal animal;
}//End of class
