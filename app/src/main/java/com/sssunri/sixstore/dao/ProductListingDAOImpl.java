package com.sssunri.sixstore.dao;

import com.sssunri.sixstore.entity.ProductListing;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProductListingDAOImpl implements ProductListingDAO {
    // field for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor injection
    @Autowired
    public ProductListingDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional
    public void save(ProductListing productListing) {
        entityManager.persist(productListing);
    }
}
