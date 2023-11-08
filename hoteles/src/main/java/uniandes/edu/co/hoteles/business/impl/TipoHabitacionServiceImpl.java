package uniandes.edu.co.hoteles.business.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniandes.edu.co.hoteles.business.TipoHabitacionService;
import uniandes.edu.co.hoteles.dto.TipoHabitacionDTO;
import uniandes.edu.co.hoteles.modelo.TipoHabitacion;
import uniandes.edu.co.hoteles.repository.TipoHabitacionRepository;

@Service
public class TipoHabitacionServiceImpl implements TipoHabitacionService {

    @Autowired
    private TipoHabitacionRepository repository;


    @Override
    public void createTipoHabitacion(TipoHabitacionDTO tipoHabitacion) {
        TipoHabitacion ta = new TipoHabitacion(null, tipoHabitacion.getDescripcion(), 1L);
        repository.save(ta);
    }

    @Override
    public TipoHabitacionDTO updateTipoHabitacion(TipoHabitacionDTO tipoHabitacion) {
        
        Optional<TipoHabitacion> tuOptional = repository.findById(tipoHabitacion.getId());
        if (tuOptional.isPresent()) {
            TipoHabitacion th = new TipoHabitacion(tipoHabitacion.getId(), tipoHabitacion.getDescripcion(), tipoHabitacion.getEstado());
            repository.save(th);
            return tipoHabitacion;
        } else {
            return null;
        }

        
    }

    @Override
    public Long deleteTipoHabitacion(Long idTipoHabitacion) {
        Optional<TipoHabitacion> thOptional = repository.findById(idTipoHabitacion);
        if (thOptional.isPresent()) {
            repository.deleteById(idTipoHabitacion);
            return idTipoHabitacion;
        } else {
            return null;
        }
    }
    
}
