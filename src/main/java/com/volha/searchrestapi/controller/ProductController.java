package com.volha.searchrestapi.controller;

import com.volha.searchrestapi.entity.Product;
import com.volha.searchrestapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 *Created on 03.06.2022
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query) {
        return ResponseEntity.ok(productService.searchProducts(query));
    }

    @PostMapping("/new")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }
}
