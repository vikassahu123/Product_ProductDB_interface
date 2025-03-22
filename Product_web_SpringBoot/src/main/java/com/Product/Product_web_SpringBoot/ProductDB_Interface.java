package com.Product.Product_web_SpringBoot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDB_Interface extends JpaRepository<Product,Integer> {

     Product findByName(String name);
}
