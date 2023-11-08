package uniandes.edu.co.hoteles.business.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniandes.edu.co.hoteles.business.HabitacionService;
import uniandes.edu.co.hoteles.dto.HabitacionDTO;
import uniandes.edu.co.hoteles.modelo.Habitacion;
import uniandes.edu.co.hoteles.repository.HabitacionRepository;

@Service
public class HabitacionServiceImpl implements HabitacionService {

    @Autowired
    private HabitacionRepository repository;

    @Override
    public void create(HabitacionDTO habitacion) {
        Habitacion h = new Habitacion(null, habitacion.getCapacidad(), habitacion.getTelevision().equals(true) ? 1L : 0L, habitacion.getMinibar().equals(true) ? 1L : 0L, habitacion.getCafetera().equals(true) ? 1L : 0L, habitacion.getCostoNoche(), habitacion.getNumero(), habitacion.getTipoHabitacionId());
        repository.save(h);
    }

    @Override
    public HabitacionDTO update(HabitacionDTO habitacion) {
         Optional<Habitacion> sOptional = repository.findById(habitacion.getId());
        if (sOptional.isPresent()) {
            Habitacion h = new Habitacion(habitacion.getId(), habitacion.getCapacidad(), habitacion.getTelevision().equals(true) ? 1L : 0L, habitacion.getMinibar().equals(true) ? 1L : 0L, habitacion.getCafetera().equals(true) ? 1L : 0L, habitacion.getCostoNoche(), habitacion.getNumero(), habitacion.getTipoHabitacionId());
            repository.save(h);
            return habitacion;
        } else {
            return null;
        }
    }

    @Override
    public Long delete(Long idHabitacion) {
         Optional<Habitacion> sOptional = repository.findById(idHabitacion);
        if (sOptional.isPresent()) {
            repository.deleteById(idHabitacion);
            return idHabitacion;
        } else {
            return null;
        }
    }


    
}
