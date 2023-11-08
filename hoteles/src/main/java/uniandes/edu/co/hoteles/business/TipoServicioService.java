package uniandes.edu.co.hoteles.business;

import uniandes.edu.co.hoteles.dto.TipoServicioDTO;

public interface TipoServicioService {

    public void create(TipoServicioDTO servicio);
    
    public TipoServicioDTO update(TipoServicioDTO servicio);

    public Long delete(Long idTipoServicio);
    
}
