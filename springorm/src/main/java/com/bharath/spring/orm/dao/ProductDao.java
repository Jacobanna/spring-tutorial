package com.bharath.spring.orm.dao;

import com.bharath.spring.orm.model.Product;

public interface ProductDao {
    int create(Product product);
    void update(Product product);
    void delete(Product product);
}
