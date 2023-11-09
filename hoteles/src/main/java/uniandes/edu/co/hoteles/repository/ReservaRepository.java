package uniandes.edu.co.hoteles.repository;

import org.springframework.data.repository.CrudRepository;

import uniandes.edu.co.hoteles.modelo.Reserva;

public interface ReservaRepository extends CrudRepository<Reserva, Long>{
    
}