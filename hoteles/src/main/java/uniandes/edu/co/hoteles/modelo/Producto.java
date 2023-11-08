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
@Table(name="TBL_PRODUCTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {   

    @Id
    @SequenceGenerator(name="PRODUCTO_ID_GENERATOR", sequenceName="SQ_PRODUCTO", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCTO_ID_GENERATOR")    
    private Long id;

    private String descripcion;

    private Long estado;
}
