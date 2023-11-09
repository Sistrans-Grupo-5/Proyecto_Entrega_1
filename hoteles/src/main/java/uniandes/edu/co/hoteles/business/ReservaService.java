package uniandes.edu.co.hoteles.business;

import java.util.List;

import uniandes.edu.co.hoteles.dto.ReservaDTO;

public interface ReservaService {

    public void create(ReservaDTO reserva);
    
    public ReservaDTO update(ReservaDTO reserva);

    public Long delete(Long idreserva);

    public List<ReservaDTO> findAll();
    
}
