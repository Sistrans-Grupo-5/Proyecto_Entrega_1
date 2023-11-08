package uniandes.edu.co.hoteles.business.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniandes.edu.co.hoteles.business.ServicioProductoService;
import uniandes.edu.co.hoteles.dto.ServicioProductoDTO;
import uniandes.edu.co.hoteles.modelo.ServicioProducto;
import uniandes.edu.co.hoteles.repository.ServicioProductoRepository;

@Service
public class ServicioProductoServiceImpl implements ServicioProductoService {

    @Autowired
    private ServicioProductoRepository repository;

    @Override
    public void create(ServicioProductoDTO servicioProducto) {
        ServicioProducto sp = new ServicioProducto(null, servicioProducto.getIdServicio(), servicioProducto.getIdProducto(), servicioProducto.getValor());
        repository.save(sp);
    }

    @Override
    public ServicioProductoDTO update(ServicioProductoDTO servicioProducto) {
         Optional<ServicioProducto> tuOptional = repository.findById(servicioProducto.getId());
        if (tuOptional.isPresent()) {
            ServicioProducto sp = new ServicioProducto(servicioProducto.getId(), servicioProducto.getIdServicio(), servicioProducto.getIdProducto(), servicioProducto.getValor());
            repository.save(sp);
            return servicioProducto;
        } else {
            return null;
        }
    }

    @Override
    public Long delete(Long idServicioProducto) {
         Optional<ServicioProducto> uOptional = repository.findById(idServicioProducto);
        if (uOptional.isPresent()) {
            repository.deleteById(idServicioProducto);
            return idServicioProducto;
        } else {
            return null;
        }
    }


    
}
