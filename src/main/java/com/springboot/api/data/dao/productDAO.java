package com.springboot.api.data.dao;

import com.springboot.api.data.entity.Product;

public interface productDAO {
    Product insertProduct(Product product);

    Product selectProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(Long number) throws Exception;
}
