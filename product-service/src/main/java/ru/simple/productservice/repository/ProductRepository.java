package ru.simple.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.simple.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
