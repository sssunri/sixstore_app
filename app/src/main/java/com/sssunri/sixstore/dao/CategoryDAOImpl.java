package com.sssunri.sixstore.dao;

import com.sssunri.sixstore.entity.Category;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
    // field for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor injection
    @Autowired
    public CategoryDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional
    public void save(Category category) {
        entityManager.persist(category);
    }
}
