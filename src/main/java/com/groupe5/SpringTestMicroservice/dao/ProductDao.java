package com.groupe5.SpringTestMicroservice.dao;

import com.groupe5.SpringTestMicroservice.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findAll();
    Product findBy(int id);
    Product save(Product product);
}
