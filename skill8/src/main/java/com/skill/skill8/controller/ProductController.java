package com.skill.skill8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.skill.skill8.entity.Product;
import com.skill.skill8.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    @GetMapping("/category/{category}")
    public List<Product> getByCategory(@PathVariable String category) {
        return service.getProductsByCategory(category);
    }

    @GetMapping("/filter")
    public List<Product> filterProducts(@RequestParam double min,
                                        @RequestParam double max) {
        return service.getProductsByPriceRange(min, max);
    }

    @GetMapping("/sorted")
    public List<Product> sortedProducts() {
        return service.getSortedProducts();
    }

    @GetMapping("/expensive/{price}")
    public List<Product> expensiveProducts(@PathVariable double price) {
        return service.getExpensiveProducts(price);
    }
}