package uniandes.edu.co.hoteles.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ServicioProductoDTO {

    private Long id;
    private Long idServicio;
    private Long idProducto;
    private Double valor;    
    
}
