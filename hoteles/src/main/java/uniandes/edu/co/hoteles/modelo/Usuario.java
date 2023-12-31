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
@Table(name="TBL_USUARIO")
public class Usuario {


    @Id
    @SequenceGenerator(name="USUARIO_ID_GENERATOR", sequenceName="SQ_USUARIO", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USUARIO_ID_GENERATOR")    
    private Long id;

    private Long tipoUsuarioId;

    private String tipoDocumento;

    private String numeroDocumento;
    
    private String nombre;

    private String correo;  

    
}
