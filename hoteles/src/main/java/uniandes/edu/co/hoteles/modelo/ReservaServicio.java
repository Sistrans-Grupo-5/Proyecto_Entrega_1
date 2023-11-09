package uniandes.edu.co.hoteles.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TBL_RESERVA_SERVICIO")
public class ReservaServicio {


    @Id
    @SequenceGenerator(name="RESERVA_SERVICIO_ID_GENERATOR", sequenceName="SQ_RESERVA_SERVICIO", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RESERVA_SERVICIO_ID_GENERATOR")    
    private Long id;

    private Long idReserva;

    private Long idServicio;

    private Date Fecha;
    

    
}
