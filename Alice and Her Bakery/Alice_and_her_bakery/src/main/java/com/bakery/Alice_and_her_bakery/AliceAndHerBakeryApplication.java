package com.bakery.Alice_and_her_bakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceAndHerBakeryApplication implements CommandLineRunner{

	@Autowired
	BakeCake baker;

	public static void main(String[] args) {
		SpringApplication.run(AliceAndHerBakeryApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		baker.bakeCake();


	}
}
