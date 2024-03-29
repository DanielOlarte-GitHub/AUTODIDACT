package com.example.pruebaCiclo4.repository;

import com.example.pruebaCiclo4.model.Producto;
import com.example.pruebaCiclo4.repository.crud.ProductoCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {

    @Autowired
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return productoCrudRepository.findAll();
    }

    public Optional<Producto> getProducto(int id){
        return productoCrudRepository.findById(id);
    }

    public Producto save(Producto p){
        return productoCrudRepository.save(p);
    }

    public void delete(Producto p){
        productoCrudRepository.delete(p);
    }

}
