package uniandes.edu.co.hoteles.business;

import uniandes.edu.co.hoteles.dto.TipoHabitacionDTO;

public interface TipoHabitacionService {

    public void createTipoHabitacion(TipoHabitacionDTO tipoHabitacion);
    
    public TipoHabitacionDTO updateTipoHabitacion(TipoHabitacionDTO tipoHabitacion);

    public Long deleteTipoHabitacion(Long idTipoHAbitacion);
    
}
