package uniandes.edu.co.hoteles.repository;

import org.springframework.data.repository.CrudRepository;

import uniandes.edu.co.hoteles.modelo.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    
}
