package com.citi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private Integer productId;
    private String name;
    private Double price;
    private String category;
}
