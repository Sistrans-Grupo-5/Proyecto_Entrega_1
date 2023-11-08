package uniandes.edu.co.hoteles.business.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniandes.edu.co.hoteles.business.ServicioService;
import uniandes.edu.co.hoteles.dto.ServicioDTO;
import uniandes.edu.co.hoteles.modelo.Servicio;
import uniandes.edu.co.hoteles.repository.ServicioRepository;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioRepository repository;

    @Override
    public void create(ServicioDTO servicio) {
        Servicio sp = new Servicio(null, servicio.getNombre(), servicio.getCapacidad(), servicio.getProfundidad(), servicio.getHorarioApertura(), servicio.getHorarioCierre(), servicio.getIncluido().equals(true) ? 1L : 0L, servicio.getMaquinas(), servicio.getEstilo(), servicio.getDuracion(), servicio.getCosto(), servicio.getTipoServicio());
        repository.save(sp);
    }

    @Override
    public ServicioDTO update(ServicioDTO servicio) {
         Optional<Servicio> sOptional = repository.findById(servicio.getId());
        if (sOptional.isPresent()) {
            Servicio sp = new Servicio(servicio.getId(), servicio.getNombre(), servicio.getCapacidad(), servicio.getProfundidad(), servicio.getHorarioApertura(), servicio.getHorarioCierre(), servicio.getIncluido().equals(true) ? 1L : 0L, servicio.getMaquinas(), servicio.getEstilo(), servicio.getDuracion(), servicio.getCosto(), servicio.getTipoServicio());
            repository.save(sp);
            return servicio;
        } else {
            return null;
        }
    }

    @Override
    public Long delete(Long idServicio) {
         Optional<Servicio> sOptional = repository.findById(idServicio);
        if (sOptional.isPresent()) {
            repository.deleteById(idServicio);
            return idServicio;
        } else {
            return null;
        }
    }


    
}
