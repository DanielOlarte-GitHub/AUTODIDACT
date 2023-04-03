package com.example.pruebaCiclo4.service;

import com.example.pruebaCiclo4.model.Producto;
import com.example.pruebaCiclo4.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getAll(){
        return productoRepository.getAll();
    }

    public Optional<Producto> getProducto(int id){
        return productoRepository.getProducto(id);
    }

    public Producto save(Producto p){
        if(p.getId()==null){
            return productoRepository.save(p);
        }else{
            Optional<Producto> pAux = productoRepository.getProducto(p.getId());
            if(!pAux.isPresent()){
                return productoRepository.save(p);
            }else{
                return p;
            }
        }
    }


    public Producto update(Producto p){
        if(p.getId()!=null){
            Optional<Producto> q = productoRepository.getProducto(p.getId());
            if(q.isPresent()){
                if(p.getNombre()!=null){
                    q.get().setNombre(p.getNombre());
                }

                if(p.getCategoria()!=null){
                    q.get().setCategoria(p.getCategoria());
                }
                if(p.getCantidadStock()!=null){
                    q.get().setCantidadStock(p.getCantidadStock());
                }
                if(p.getDescripcion()!=null){
                    q.get().setDescripcion(p.getDescripcion());
                }
                if(p.getDisponibilidad()!=null){
                    q.get().setDisponibilidad(p.getDisponibilidad());
                }
                if(p.getPrecio()!=null){
                    q.get().setPrecio(p.getPrecio());
                }
                productoRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }

    public boolean delete(int id){
        Boolean flag = false;

        Optional<Producto> q = productoRepository.getProducto(id);
        if(q.isPresent()){
            productoRepository.delete(q.get());
            flag = true;
        }

        return flag;
    }
}
