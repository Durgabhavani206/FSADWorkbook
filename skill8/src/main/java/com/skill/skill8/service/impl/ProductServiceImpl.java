package com.skill.skill8.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skill.skill8.entity.Product;
import com.skill.skill8.repository.ProductRepository;
import com.skill.skill8.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public Product addProduct(Product product) {
        return repo.save(product);
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return repo.findByCategory(category);
    }

    @Override
    public List<Product> getProductsByPriceRange(double min, double max) {
        return repo.findByPriceBetween(min, max);
    }

    @Override
    public List<Product> getSortedProducts() {
        return repo.sortProductsByPrice();
    }

    @Override
    public List<Product> getExpensiveProducts(double price) {
        return repo.findProductsAbovePrice(price);
    }
}