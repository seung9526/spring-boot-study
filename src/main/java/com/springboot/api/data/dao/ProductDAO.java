package com.springboot.api.data.dao;

import com.springboot.api.data.entity.Product;

public interface ProductDAO {
    Product insertProduct(Product product);

    Product selectProduct(Product product);

    Product updateProduct(Product product);

    Product updateProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;
}
