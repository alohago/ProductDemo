CREATE DATABASE casestudy;

USE casestudy;

CREATE TABLE products (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    category CHAR(20) NOT NULL
);