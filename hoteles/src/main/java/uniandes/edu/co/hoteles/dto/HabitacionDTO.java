package uniandes.edu.co.hoteles.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HabitacionDTO {

    private Long id;
    private Long capacidad;
    private Boolean television;
    private Boolean minibar;
    private Boolean cafetera;
    private Double costoNoche;
    private String numero;
    private Long tipoHabitacionId;

    
}
