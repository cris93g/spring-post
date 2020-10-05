package com.idk.learn.Services;

import com.idk.learn.Models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();

    void addProduct(Product product);

    Product getItem(String name);


    void deleteProduct(int id);

    void deleteProductByName(String name);
}
