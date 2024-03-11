package com.sssunri.sixstore.service;

import com.sssunri.sixstore.dao.CategoryDAO;
import com.sssunri.sixstore.entity.Category;

public class CategoryService {
    public static Category createOrRetrieveCategory(CategoryDAO categoryDAO, String name) {
        // try to retrieve the category by name
        Category category = categoryDAO.findByName(name);

        // if the category does not exist, create a new one
        if (category == null) {
            createAndSaveCategory(categoryDAO, name);
        }

        return category;
    }

    private static void createAndSaveCategory(CategoryDAO categoryDAO, String name) {
        try {
            // creating a new category object
            System.out.println("creating a new category object...");
            Category category = new Category(name);

            // saving the category object
            System.out.println("saving the category...");
            categoryDAO.save(category);

            // displaying the id of the saved category
            System.out.println("saved category. generated id: " + category.getCategoryId());
        } catch (Exception e) {
            // handle exceptions appropriately (log or rethrow)
            System.err.println("error while creating and saving the category: " + e.getMessage());
        }
    }
}
