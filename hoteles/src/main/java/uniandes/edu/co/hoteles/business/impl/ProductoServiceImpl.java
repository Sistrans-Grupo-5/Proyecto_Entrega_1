package uniandes.edu.co.hoteles.business.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniandes.edu.co.hoteles.business.ProductoService;
import uniandes.edu.co.hoteles.dto.ProductoDTO;
import uniandes.edu.co.hoteles.modelo.Producto;
import uniandes.edu.co.hoteles.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository repository;


    @Override
    public void create(ProductoDTO producto) {
        Producto p = new Producto(null, producto.getDescripcion(), 1L);
        repository.save(p);
    }

    @Override
    public ProductoDTO update(ProductoDTO producto) {
        
        Optional<Producto> tuOptional = repository.findById(producto.getId());
        if (tuOptional.isPresent()) {
            Producto p = new Producto(producto.getId(), producto.getDescripcion(), 1L);
            repository.save(p);
            return producto;
        } else {
            return null;
        }

        
    }

    @Override
    public Long delete(Long idProducto) {
        Optional<Producto> thOptional = repository.findById(idProducto);
        if (thOptional.isPresent()) {
            repository.deleteById(idProducto);
            return idProducto;
        } else {
            return null;
        }
    }
    
}
