package com.springboot.api.data.dao;

import com.springboot.api.data.entity.Product;

import java.util.Optional;

public interface ProductDAO {
    Product insertProduct(Product product);

    Optional<Product> selectProduct(Long number);

    Product updateProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;
}
