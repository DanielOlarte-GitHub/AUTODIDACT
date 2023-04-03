package com.example.pruebaCiclo4.controller;

import com.example.pruebaCiclo4.model.Producto;
import com.example.pruebaCiclo4.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/all")
    public List<Producto> getAll(){
        return productoService.getAll();
    }


    @GetMapping("/{id}")
    public Optional<Producto> getProducto(@PathVariable("id") int id){
        return productoService.getProducto(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save")
    public Producto save(@RequestBody Producto p){
        return productoService.save(p);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/update")
    public Producto update(@RequestBody Producto p){
        return productoService.update(p);
    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") int id){
        productoService.delete(id);
    }


}
