package com.idk.learn.dao;

import com.idk.learn.Models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {

    Product findByName(String name);

    void deleteByName(String name);
}
