package com.sssunri.sixstore.service;

import com.sssunri.sixstore.dao.CategoryDAO;
import com.sssunri.sixstore.entity.Category;

public class CategoryService {
    public static void createCategory(CategoryDAO categoryDAO, String name) {
        try {
            // creating a new category object
            System.out.println("creating a new category object...");
            Category tempCategory = new Category(name);

            // saving the category object
            System.out.println("saving the category...");
            categoryDAO.save(tempCategory);

            // displaying the id of the saved category
            System.out.println("saved category. generated id: " + tempCategory.getCategoryId());
        } catch (Exception e) {
            // handle exceptions appropriately (log or rethrow)
            System.err.println("error while creating and saving the category: " + e.getMessage());
        }
    }
}
