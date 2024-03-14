package com.sssunri.sixstore.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private byte categoryId;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    // constructors, getters and setters
    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public byte getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString() method

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                '}';
    }
}