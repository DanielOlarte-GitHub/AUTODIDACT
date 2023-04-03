package com.example.pruebaCiclo4.repository.crud;

import com.example.pruebaCiclo4.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoCrudRepository extends MongoRepository<Producto,Integer> {
}
