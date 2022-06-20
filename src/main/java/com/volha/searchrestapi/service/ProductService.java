package com.volha.searchrestapi.service;

import com.volha.searchrestapi.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/*
 *Created on 03.06.2022
 */
public interface ProductService{
    List<Product> searchProducts (String query);
    Product createProduct(Product product);
}
