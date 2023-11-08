package uniandes.edu.co.hoteles.business;

import uniandes.edu.co.hoteles.dto.UsuarioDTO;

public interface UsuarioService {

    public void createUsuario(UsuarioDTO usuario);
    
    public UsuarioDTO updateUsuario(UsuarioDTO usuario);

    public Long deleteUsuario(Long idUsuario);
    
}
