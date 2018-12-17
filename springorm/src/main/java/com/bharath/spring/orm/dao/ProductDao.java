package com.bharath.spring.orm.dao;

import com.bharath.spring.orm.model.Product;

import java.util.List;

public interface ProductDao {
    int create(Product product);
    void update(Product product);
    void delete(Product product);
    Product find(int id);
    List<Product> findAll();
}
