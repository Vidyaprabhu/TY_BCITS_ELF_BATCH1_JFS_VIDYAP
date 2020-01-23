package com.bcits.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bcits.springcoreannotation.bean.Pet;
import com.bcits.springcoreannotation.config.PetConfig;

public class PetTest {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(PetConfig.class);
		Pet myPet = context.getBean(Pet.class);
		
		System.out.println("Pet name: " + myPet.getName());
		myPet.getAnimal().speak();
		myPet.getAnimal().eat();
	}//End of main()
}//End of class
