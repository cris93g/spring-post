package com.idk.learn.Services.implementations;

import com.idk.learn.Models.Product;
import com.idk.learn.Services.ProductService;
import com.idk.learn.dao.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProducts() {
        List<Product> result = new ArrayList<Product>();
        result = (List<Product>) productRepository.findAll();
        return result;
    }

    @Override
    public void addProduct(Product product) {
        System.out.println(product);
       productRepository.save(product);
    }

    @Override
    public Product getItem(String name) {
        Product result = productRepository.findByName(name);
        return result;
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);

    }

    @Override
    public void deleteProductByName(String name) {
        productRepository.deleteByName(name);
    }
}
