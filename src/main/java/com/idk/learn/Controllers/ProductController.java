package com.idk.learn.Controllers;

import com.idk.learn.Models.Product;
import com.idk.learn.Services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts(){
        List<Product>result = productService.getProducts();
        return result;
    }

    @GetMapping(path = "/{name}")
    public Product getItem(@PathVariable String name){
        Product result = productService.getItem(name);
        return result;
    }

    @PostMapping
    public void addProduct(@RequestBody Product product){
        System.out.println(product);
        productService.addProduct(product);
    }
    @DeleteMapping(path="/{id}")
    public void deleteProduct(@PathVariable int id){
     productService.deleteProduct(id);

    }
}
