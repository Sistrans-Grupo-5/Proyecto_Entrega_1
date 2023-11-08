package uniandes.edu.co.hoteles.business;

import uniandes.edu.co.hoteles.dto.HabitacionDTO;

public interface HabitacionService {

    public void create(HabitacionDTO habitacion);
    
    public HabitacionDTO update(HabitacionDTO habitacion);

    public Long delete(Long idhabitacion);
    
}
