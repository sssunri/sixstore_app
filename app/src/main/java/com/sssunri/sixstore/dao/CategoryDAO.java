package com.sssunri.sixstore.dao;

import com.sssunri.sixstore.entity.Category;

public interface CategoryDAO {
    void save(Category category);
    Category findByName(String name);
}
