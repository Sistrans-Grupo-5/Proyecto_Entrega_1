package uniandes.edu.co.hoteles.business;

import java.util.List;

import uniandes.edu.co.hoteles.dto.ServicioDTO;

public interface ServicioService {

    public void create(ServicioDTO servicio);
    
    public ServicioDTO update(ServicioDTO servicio);

    public Long delete(Long idServicio);

    public List<ServicioDTO> findAll();
    
}
