package uniandes.edu.co.hoteles.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ServicioDTO {

    private Long id;
    private String nombre;  
    private Long capacidad;
    private Double profundidad;
    private String horarioApertura;
    private String horarioCierre;
    private Boolean incluido;
    private Long maquinas;
    private String estilo;
    private Double duracion;
    private Double costo;
    private Long tipoServicio;
    
    
}
