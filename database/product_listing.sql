CREATE DATABASE IF NOT EXISTS sixstore;
USE sixstore;

CREATE TABLE IF NOT EXISTS category (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS product_listing (
    id INT AUTO_INCREMENT PRIMARY KEY,
    sku VARCHAR(15) NOT NULL UNIQUE,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    unit_price DECIMAL(5, 2) NOT NULL,
    units_in_stock INT NOT NULL,
    active BOOLEAN DEFAULT TRUE,
    category_id INT,
    image_url VARCHAR(255),
    rating INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (category_id)
        REFERENCES category (id)
);