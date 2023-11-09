package uniandes.edu.co.hoteles.business.impl;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import uniandes.edu.co.hoteles.business.ReservaService;
import uniandes.edu.co.hoteles.dto.ReservaDTO;
import uniandes.edu.co.hoteles.modelo.Reserva;
import uniandes.edu.co.hoteles.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository repository;

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    @Override
    public void create(ReservaDTO reserva) {



        Reserva re = new Reserva(null, java.sql.Date.valueOf(LocalDateTime.parse(reserva.getCheckin(), dateTimeFormatter).toLocalDate()), java.sql.Date.valueOf(LocalDateTime.parse(reserva.getCheckout(), dateTimeFormatter).toLocalDate()), reserva.getNum_personas(), reserva.getUsuarioId(), reserva.getPlanconsumoId(), reserva.getHabitacionId());
        repository.save(re);
    }

    @Override
    public ReservaDTO update(ReservaDTO reserva) {
         Optional<Reserva> sOptional = repository.findById(reserva.getId());
        if (sOptional.isPresent()) {
            Reserva re = new Reserva(reserva.getId(), java.sql.Date.valueOf(LocalDateTime.parse(reserva.getCheckin(), dateTimeFormatter).toLocalDate()), java.sql.Date.valueOf(LocalDateTime.parse(reserva.getCheckout(), dateTimeFormatter).toLocalDate()), reserva.getNum_personas(), reserva.getUsuarioId(), reserva.getPlanconsumoId(), reserva.getHabitacionId());
            repository.save(re);
            return reserva;
        } else {
            return null;
        }
    }

    @Override
    public Long delete(Long idReserva) {
         Optional<Reserva> sOptional = repository.findById(idReserva);
        if (sOptional.isPresent()) {
            repository.deleteById(idReserva);
            return idReserva;
        } else {
            return null;
        }
    }

    @Override
    public List<ReservaDTO> findAll() {
        List<ReservaDTO> reservaDTOs = new ArrayList<>();
        repository.findAll().forEach(s -> reservaDTOs.add(entityToDTO(s)));
        return reservaDTOs;
    }

    
    private ReservaDTO entityToDTO(Reserva reserva) {
        SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy HH:mm");
        ReservaDTO dto = new ReservaDTO(reserva.getId(), sdf.format(reserva.getCheckin()), sdf.format(reserva.getCheckout()),  reserva.getNum_personas(), reserva.getUsuarioId(), reserva.getPlanconsumoId(), reserva.getHabitacionId());
        return dto;
    }


    
}
