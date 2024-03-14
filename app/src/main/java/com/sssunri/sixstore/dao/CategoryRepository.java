package com.sssunri.sixstore.dao;

import com.sssunri.sixstore.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "category", path = "product-category")
public interface CategoryRepository extends JpaRepository<Category, Byte> {
}
