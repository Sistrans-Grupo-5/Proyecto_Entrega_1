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
@Table(name="TBL_SERVICIO_PRODUCTO")
public class ServicioProducto {


    @Id
    @SequenceGenerator(name="SERVICIO_PRODUCTO_ID_GENERATOR", sequenceName="SQ_SERVICIO_PRODUCTO", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SERVICIO_PRODUCTO_ID_GENERATOR")    
    private Long id;

    private Long idServicio;

    private Long idProducto;

    private Double valor;
    

    
}
