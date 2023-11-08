package uniandes.edu.co.hoteles.business;

import uniandes.edu.co.hoteles.dto.TipoUsuarioDTO;

public interface TipoUsuarioService {

    public void createTipoUsuario(TipoUsuarioDTO tipoUsuario);
    
    public TipoUsuarioDTO updateTipoUsuario(TipoUsuarioDTO tipoUsuario);

    public Long deleteTipoUsuario(Long idTipoUsuario);
    
}
