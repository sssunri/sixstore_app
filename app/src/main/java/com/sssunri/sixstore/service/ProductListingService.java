package com.sssunri.sixstore.service;

import com.sssunri.sixstore.dao.ProductListingDAO;
import com.sssunri.sixstore.entity.Category;
import com.sssunri.sixstore.entity.ProductListing;

public class ProductListingService {
    public static void createProductListing(
            ProductListingDAO productListingDAO,
            String sku,
            String name,
            String description,
            float unitPrice,
            short unitsInStock,
            Category category,
            String imageUrl
    ) {
        try {
            // creating a new product listing object
            System.out.println("creating a new product listing...");
            ProductListing product = new ProductListing(
                    sku,
                    name,
                    description,
                    unitPrice,
                    unitsInStock,
                    category,
                    imageUrl
            );

            // saving the product listing object
            product.setSku(sku);
            product.setName(name);
            product.setDescription(description);
            product.setUnitPrice(unitPrice);
            product.setUnitsInStock(unitsInStock);
            product.setCategory(category);
            product.setImageUrl(imageUrl);

            System.out.println("saving the product listing...");
            productListingDAO.save(product);

            // displaying the id of the saved product listing
            System.out.println("saved product listing. generated id: " + product.getProductId());
        } catch (Exception e) {
            // handle exceptions appropriately (log or rethrow)
            System.err.println("error while creating and saving the category: " + e.getMessage());
        }
    }
}
