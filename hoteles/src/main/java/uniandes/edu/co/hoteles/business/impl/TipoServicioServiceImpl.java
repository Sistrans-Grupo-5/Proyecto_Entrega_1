package uniandes.edu.co.hoteles.business.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniandes.edu.co.hoteles.business.TipoServicioService;
import uniandes.edu.co.hoteles.dto.TipoServicioDTO;
import uniandes.edu.co.hoteles.modelo.TipoServicio;
import uniandes.edu.co.hoteles.repository.TipoServicioRepository;

@Service
public class TipoServicioServiceImpl implements TipoServicioService {

    @Autowired
    private TipoServicioRepository repository;


    @Override
    public void create(TipoServicioDTO tipoServicio) {
        TipoServicio p = new TipoServicio(null, tipoServicio.getDescripcion(), 1L);
        repository.save(p);
    }

    @Override
    public TipoServicioDTO update(TipoServicioDTO tipoServicio) {
        
        Optional<TipoServicio> tsOptional = repository.findById(tipoServicio.getId());
        if (tsOptional.isPresent()) {
            TipoServicio p = new TipoServicio(tipoServicio.getId(), tipoServicio.getDescripcion(), 1L);
            repository.save(p);
            return tipoServicio;
        } else {
            return null;
        }

        
    }

    @Override
    public Long delete(Long idTipoServicio) {
        Optional<TipoServicio> tsOptional = repository.findById(idTipoServicio);
        if (tsOptional.isPresent()) {
            repository.deleteById(idTipoServicio);
            return idTipoServicio;
        } else {
            return null;
        }
    }
    
}
