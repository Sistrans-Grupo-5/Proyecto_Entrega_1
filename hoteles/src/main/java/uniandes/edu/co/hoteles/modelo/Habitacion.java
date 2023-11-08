package uniandes.edu.co.hoteles.modelo;
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
@Table(name="TBL_HABITACION")
public class Habitacion {

    @Id
    @SequenceGenerator(name="HABITACION_ID_GENERATOR", sequenceName="SQ_HABITACION", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HABITACION_ID_GENERATOR")

    private Long id;
    private Long capacidad;
    private Long television;
    private Long minibar;
    private Long cafetera;
    private Double costoNoche;
    private String numero;
    private Long tipoHabitacionId;

}    