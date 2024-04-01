package com.sssunri.sixstore.rest;

import com.sssunri.sixstore.dao.ProductRepository;
import com.sssunri.sixstore.entity.ProductListing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/get-products")
    public ResponseEntity<List<ProductListing>> getProductsEntity(@RequestParam(required = false) String title) {
        try {
            List<ProductListing> products = new ArrayList<ProductListing>();

            if (title == null) {
                productRepository.findAll().forEach(products::add);
            }

            if (products.isEmpty()) {
                System.out.println("no content");
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            System.out.println("success");
            return new ResponseEntity<>(null, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("internal server error");
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
