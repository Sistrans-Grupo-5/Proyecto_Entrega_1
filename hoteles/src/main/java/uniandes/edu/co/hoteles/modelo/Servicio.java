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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TBL_SERVICIO")
public class Servicio {

    @Id
    @SequenceGenerator(name="SERVICIO_ID_GENERATOR", sequenceName="SQ_SERVICIO", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SERVICIO_ID_GENERATOR")    
    
    private Long id;
    private String nombre;
    private Long capacidad;
    private Double profundidad;
    private String horarioApertura;
    private String horarioCierre;
    private Long incluido;
    private Long maquinas;
    private String estilo;
    private Double duracion;
    private Double costo;
    private Long tipoServicioId;

  
}
