package com.sssunri.sixstore.dao;

import com.sssunri.sixstore.entity.ProductListing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products", path = "product-listings")
public interface ProductRepository extends JpaRepository<ProductListing, Short> {
}
