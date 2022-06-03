package com.volha.searchrestapi.repository;

import com.volha.searchrestapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/*
 *Created on 02.06.2022
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE" +
            "p.name LIKE CONCAT ('%', :query, '%')" +
            "OR p.description LIKE CONCAT ('%', :query, '%')")
    List<Product> searchProduct(String query);
}
