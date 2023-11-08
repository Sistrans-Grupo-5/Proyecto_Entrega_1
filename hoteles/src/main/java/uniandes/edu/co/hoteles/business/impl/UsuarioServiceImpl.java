package uniandes.edu.co.hoteles.business.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import uniandes.edu.co.hoteles.business.UsuarioService;
import uniandes.edu.co.hoteles.dto.UsuarioDTO;
import uniandes.edu.co.hoteles.modelo.Usuario;
import uniandes.edu.co.hoteles.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;


    @Override
    public void createUsuario(UsuarioDTO usuario) {
        Usuario u = new Usuario(null, usuario.getRol(), usuario.getTipoDocumento(), usuario.getNumeroDocumento(), usuario.getNombre(), usuario.getCorreo());
        repository.save(u);
    }

    @Override
    public UsuarioDTO updateUsuario(UsuarioDTO usuario) throws HttpStatusCodeException{
        
        Optional<Usuario> uOptional = repository.findById(usuario.getId());
        if (uOptional.isPresent()) {
            Usuario u = new Usuario(usuario.getId(), usuario.getRol(), usuario.getTipoDocumento(), usuario.getNumeroDocumento(), usuario.getNombre(), usuario.getCorreo());
            repository.save(u);
            return usuario;
        } else {
            return null;
        }

        
    }

    @Override
    public Long deleteUsuario(Long idUsuario) {
        Optional<Usuario> uOptional = repository.findById(idUsuario);
        if (uOptional.isPresent()) {
            repository.deleteById(idUsuario);
            return idUsuario;
        } else {
            return null;
        }
    }
    
}
