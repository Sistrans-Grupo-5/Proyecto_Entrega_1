package uniandes.edu.co.hoteles.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="HABITACION")
public class Habitacion {

    @Id
    @SequenceGenerator(name="HABITACION_ID_GENERATOR", sequenceName="SQ_HABITACION", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HABITACION_ID_GENERATOR")
    private Integer habitacionId;

    // private String tipo;
    // private int capacidad;
    // private boolean television;
    // private boolean minibar;
    // private boolean cafeteria;
    // private double costoNoche;
    // private String numero;

}    