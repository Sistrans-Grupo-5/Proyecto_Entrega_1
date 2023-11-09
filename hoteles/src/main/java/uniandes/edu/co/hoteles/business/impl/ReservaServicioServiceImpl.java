package uniandes.edu.co.hoteles.business.impl;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniandes.edu.co.hoteles.business.ReservaServicioService;
import uniandes.edu.co.hoteles.dto.ReservaServicioDTO;
import uniandes.edu.co.hoteles.modelo.ReservaServicio;
import uniandes.edu.co.hoteles.repository.ReservaServicioRepository;

@Service
public class ReservaServicioServiceImpl implements ReservaServicioService {

    @Autowired
    private ReservaServicioRepository repository;

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    @Override
    public void create(ReservaServicioDTO reservaServicio) {
        ReservaServicio rs = new ReservaServicio(null, reservaServicio.getIdReserva(), reservaServicio.getIdServicio(), java.sql.Date.valueOf(LocalDateTime.parse(reservaServicio.getFecha(), dateTimeFormatter).toLocalDate()));
        repository.save(rs);
    }

    @Override
    public ReservaServicioDTO update(ReservaServicioDTO reservaServicio) {
         Optional<ReservaServicio> tuOptional = repository.findById(reservaServicio.getId());
        if (tuOptional.isPresent()) {
            ReservaServicio sp = new ReservaServicio(reservaServicio.getId(), reservaServicio.getIdReserva(), reservaServicio.getIdServicio(), java.sql.Date.valueOf(LocalDateTime.parse(reservaServicio.getFecha(), dateTimeFormatter).toLocalDate()));
            repository.save(sp);
            return reservaServicio;
        } else {
            return null;
        }
    }

    @Override
    public Long delete(Long idReservaServicio) {
         Optional<ReservaServicio> uOptional = repository.findById(idReservaServicio);
        if (uOptional.isPresent()) {
            repository.deleteById(idReservaServicio);
            return idReservaServicio;
        } else {
            return null;
        }
    }




    @Override
    public List<ReservaServicioDTO> findAll() {
        List<ReservaServicioDTO> reservaServicioDTOs = new ArrayList<>();
        repository.findAll().forEach(s -> reservaServicioDTOs.add(entityToDTO(s)));
        return reservaServicioDTOs;

    }
    


    private ReservaServicioDTO entityToDTO(ReservaServicio reservaServicio) {
        SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy HH:mm");
        ReservaServicioDTO dto = new ReservaServicioDTO(reservaServicio.getId(), reservaServicio.getIdReserva(), reservaServicio.getIdServicio(), sdf.format(reservaServicio.getFecha()));
        return dto;
    }



    
}
