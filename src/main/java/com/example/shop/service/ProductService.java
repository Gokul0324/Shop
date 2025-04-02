package com.example.shop.service;

import com.example.shop.model.Product;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getAllProducts() {
        return Arrays.asList(
            new Product(1, "Laptop", 75000, "High-performance laptop"),
            new Product(2, "Smartphone", 30000, "Latest model smartphone"),
            new Product(3, "Headphones", 5000, "Noise-canceling headphones"),
            new Product(4, "Smartwatch", 12000, "Feature-packed smartwatch")
        );
    }
}
