package com.sssunri.sixstore;

import com.sssunri.sixstore.dao.CategoryDAO;
import com.sssunri.sixstore.service.CategoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SixstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SixstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(CategoryDAO categoryDAO) {
		return runner -> {
			CategoryService.createCategory(categoryDAO, "plushie");
		};
	}
}
