package uniandes.edu.co.hoteles.business.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniandes.edu.co.hoteles.business.TipoPlanConsumoService;
import uniandes.edu.co.hoteles.dto.TipoPlanConsumoDTO;
import uniandes.edu.co.hoteles.modelo.TipoPlanConsumo;
import uniandes.edu.co.hoteles.repository.TipoPlanConsumoRepository;

@Service
public class TipoPlanConsumoServiceImpl implements TipoPlanConsumoService {

    @Autowired
    private TipoPlanConsumoRepository repository;


    @Override
    public void createTipoPlanConsumo(TipoPlanConsumoDTO tipoPlanConsumo) {
        TipoPlanConsumo pc = new TipoPlanConsumo(null, tipoPlanConsumo.getDescripcion(), 1L);
        repository.save(pc);
    }

    @Override
    public TipoPlanConsumoDTO updateTipoPlanConsumo(TipoPlanConsumoDTO tipoPlanConsumo) {
        
        Optional<TipoPlanConsumo> tuOptional = repository.findById(tipoPlanConsumo.getId());
        if (tuOptional.isPresent()) {
            TipoPlanConsumo pc = new TipoPlanConsumo(tipoPlanConsumo.getId(), tipoPlanConsumo.getDescripcion(),tipoPlanConsumo.getEstado());
            repository.save(pc);
            return tipoPlanConsumo;
        } else {
            return null;
        }

        
    }

    @Override
    public Long deleteTipoPlanConsumo(Long idTipoPlanConsumo) {
        Optional<TipoPlanConsumo> thOptional = repository.findById(idTipoPlanConsumo);
        if (thOptional.isPresent()) {
            repository.deleteById(idTipoPlanConsumo);
            return idTipoPlanConsumo;
        } else {
            return null;
        }
    }
    
}
