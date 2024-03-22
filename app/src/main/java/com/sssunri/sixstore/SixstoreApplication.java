package com.sssunri.sixstore;

import com.sssunri.sixstore.dao.CategoryDAO;
import com.sssunri.sixstore.dao.ProductListingDAO;
import com.sssunri.sixstore.entity.Category;
import com.sssunri.sixstore.service.CategoryService;
import com.sssunri.sixstore.service.ProductListingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class}
)
public class SixstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SixstoreApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(CategoryDAO categoryDAO, ProductListingDAO productListingDAO) {
//		return runner -> {
//			Category category = CategoryService.createOrRetrieveCategory(categoryDAO, "plushie");
//
//			ProductListingService.createProductListing(
//					productListingDAO,
//					"P1403242020",
//					"pal-sized pocha dog",
//					"adorable palm-sized pocha dog featuring a cute and cuddly design. " +
//							"perfect for your furry friend's playtime and companionship",
//					5.90f,
//					(short) 50,
//                    category,
//					"https://i.postimg.cc/DZxbG4kC/photo-2024-03-11-20-02-37.jpg"
//			);
//		};
//	}
}
