package uniandes.edu.co.hoteles.business;

import uniandes.edu.co.hoteles.dto.ProductoDTO;

public interface ProductoService {

    public void create(ProductoDTO servicio);
    
    public ProductoDTO update(ProductoDTO servicio);

    public Long delete(Long idProducto);
    
}
