package com.product.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.product.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
