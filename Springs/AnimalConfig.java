package com.bcits.springcoreannotation.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bcits.springcoreannotation.bean.Elephant;
import com.bcits.springcoreannotation.bean.Goat;

@Configuration
public class AnimalConfig {
	@Bean
	public Goat getAnimal() {
		return new Goat();
	}
	@Bean
	@Primary
	public Elephant getElephant() {
		return new Elephant();
	}

}
