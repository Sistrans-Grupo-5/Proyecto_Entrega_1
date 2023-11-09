package uniandes.edu.co.hoteles.modelo;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TBL_RESERVAS")
public class Reserva {

    @Id
    @SequenceGenerator(name="RESERVA_ID_GENERATOR", sequenceName="SQ_RESERVA", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RESERVA_ID_GENERATOR")    
    private Long Id;
    private Date checkin;
    private Date checkout;
    private Long num_personas;
    private Long usuarioId;
    private Long planconsumoId;
    private Long habitacionId;
    
    
}
