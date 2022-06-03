package com.volha.searchrestapi.service.impl;

import com.volha.searchrestapi.entity.Product;
import com.volha.searchrestapi.repository.ProductRepository;
import com.volha.searchrestapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *Created on 03.06.2022
 */
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;


    @Override
    public List<Product> searchProducts(String query) {
        return productRepository.searchProduct(query);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
