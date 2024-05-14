package io.sheetal.instanciodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InstancioDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstancioDemoApplication.class, args);
		performMainFunctionality();
	}

	public static void performMainFunctionality() {

		System.out.println("Performing main functionality...");

	}

}
