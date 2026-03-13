package com.skill.skill8.service;

import java.util.List;

import com.skill.skill8.entity.Product;

public interface ProductService {

    Product addProduct(Product product);

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsByPriceRange(double min, double max);

    List<Product> getSortedProducts();

    List<Product> getExpensiveProducts(double price);
}