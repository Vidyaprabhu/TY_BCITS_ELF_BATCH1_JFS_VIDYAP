package com.bcits.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bcits.springcoreannotation.bean.Engine;

@Configuration
public class Enigneconfig {
	@Bean
	public Engine getEngine() {
		Engine engine = new Engine();
		engine.setCc(2300);
		engine.setType("Diesel");
		return engine;
	}

}
