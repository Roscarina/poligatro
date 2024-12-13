package com.poligatro.poligatro.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poligatro.poligatro.models.Product;
import com.poligatro.poligatro.repository.ProductRepository;

@RestController
@RequestMapping("api")
public class ProductController {

    private final ProductRepository productRepository;
    ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @GetMapping("/productos")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

}
