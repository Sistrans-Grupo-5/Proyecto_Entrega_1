package uniandes.edu.co.hoteles.business.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import uniandes.edu.co.hoteles.business.TipoUsuarioService;
import uniandes.edu.co.hoteles.dto.TipoUsuarioDTO;
import uniandes.edu.co.hoteles.modelo.TipoUsuario;
import uniandes.edu.co.hoteles.repository.TipoUsuarioRepository;

@Service
public class TipoUsuarioServiceImpl implements TipoUsuarioService {

    @Autowired
    private TipoUsuarioRepository repository;


    @Override
    public void createTipoUsuario(TipoUsuarioDTO tipoUsuario) {
        TipoUsuario tu = new TipoUsuario(null, tipoUsuario.getDescripcion(), 1L);
        repository.save(tu);
    }

    @Override
    public TipoUsuarioDTO updateTipoUsuario(TipoUsuarioDTO tipoUsuario) throws HttpStatusCodeException{
        
        Optional<TipoUsuario> tuOptional = repository.findById(tipoUsuario.getId());
        if (tuOptional.isPresent()) {
            TipoUsuario tu = new TipoUsuario(tipoUsuario.getId(), tipoUsuario.getDescripcion(), tipoUsuario.getEstado());
            repository.save(tu);
            return tipoUsuario;
        } else {
            return null;
        }

        
    }

    @Override
    public Long deleteTipoUsuario(Long idTipoUsuario) {
        Optional<TipoUsuario> tuOptional = repository.findById(idTipoUsuario);
        if (tuOptional.isPresent()) {
            repository.deleteById(idTipoUsuario);
            return idTipoUsuario;
        } else {
            return null;
        }
    }
    
}
