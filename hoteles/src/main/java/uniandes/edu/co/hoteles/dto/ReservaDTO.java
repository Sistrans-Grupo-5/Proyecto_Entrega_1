package uniandes.edu.co.hoteles.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReservaDTO {


    private Long Id;
    private String checkin;
    private String checkout;
    private Long num_personas;
    private Long usuarioId;
    private Long planconsumoId;
    private Long habitacionId;

    
    
}
