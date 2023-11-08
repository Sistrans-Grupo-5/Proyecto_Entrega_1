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
@Table(name="TBL_TIPO_SERVICIO")
public class TipoServicio {


    @Id
    @SequenceGenerator(name="TIPO_SERVICIO_ID_GENERATOR", sequenceName="SQ_TIPO_SERVICIO", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPO_SERVICIO_ID_GENERATOR")    
    private Long id;

    private String descripcion;

    private Long estado;
    

    
}
