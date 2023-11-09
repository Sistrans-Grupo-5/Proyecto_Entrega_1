package uniandes.edu.co.hoteles.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import uniandes.edu.co.hoteles.modelo.Reserva;

public interface ReservaRepository extends CrudRepository<Reserva, Long>{

    @Query(nativeQuery = true, value = "SELECT R.* FROM TBL_RESERVAS R, TBL_USUARIO U " + 
            " WHERE U.NUMERO_DOCUMENTO = :userDocument" + 
            " AND R.USUARIO_ID = U.ID")
    public List<Reserva> findBookingByUserDocument(String userDocument);
    
}