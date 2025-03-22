package com.Product.Product_web_SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductorController {

    @Autowired
    ProductService service;

    // this for getting all products
    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return service.getAllProducts();
    }

    // this for getting one product like Dell Inspiron
    @GetMapping("/product/{name}")
    public Product getProduct(@PathVariable  String name)
    {
        return service.getProduct(name);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product p)
    {
        service.addProduct(p);

    }
}
