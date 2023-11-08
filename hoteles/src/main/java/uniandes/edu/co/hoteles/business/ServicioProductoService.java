package uniandes.edu.co.hoteles.business;

import uniandes.edu.co.hoteles.dto.ServicioProductoDTO;

public interface ServicioProductoService {

    public void create(ServicioProductoDTO servicioProducto);
    
    public ServicioProductoDTO update(ServicioProductoDTO servicioProducto);

    public Long delete(Long idServicioProducto);
    
}
