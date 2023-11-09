package uniandes.edu.co.hoteles.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TipoPlanConsumoDTO {

    private Long id;
    private String descripcion;
    private Long estado;
    
}
