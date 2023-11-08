package uniandes.edu.co.hoteles.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="RESERVA")
public class Reserva {

   @Id
    @SequenceGenerator(name="RESERVA_ID_GENERATOR", sequenceName="SQ_RESERVA", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RESERVA_ID_GENERATOR")    
    private Integer reservaId;
    
}
