package uniandes.edu.co.hoteles.business;

import java.util.List;

import uniandes.edu.co.hoteles.dto.ReservaServicioDTO;

public interface ReservaServicioService {

    public void create(ReservaServicioDTO reservaServicio);
    
    public ReservaServicioDTO update(ReservaServicioDTO reservaServicio);

    public Long delete(Long idReservaServicio);

    public List<ReservaServicioDTO> findAll();

    
}
