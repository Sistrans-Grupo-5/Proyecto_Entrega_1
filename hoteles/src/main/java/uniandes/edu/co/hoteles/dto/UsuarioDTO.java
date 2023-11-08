package uniandes.edu.co.hoteles.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioDTO {

    private Long id;
    private Long rol;
    private String tipoDocumento;
    private String numeroDocumento;
    private String correo;
    private String nombre;  
    
}
