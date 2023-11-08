package uniandes.edu.co.hoteles.repository;

import org.springframework.data.repository.CrudRepository;

import uniandes.edu.co.hoteles.modelo.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{
    
}
