package uniandes.edu.co.hoteles.modelo;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="reservassalon")
public class ReservaSalon {

   @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    } 

   private String dia;
    private LocalTime horaInicio;
    private LocalTime duracion;
    private Salon salon;

    public ReservaSalon(String dia, LocalTime horaInicio, LocalTime duracion, Salon salon) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.salon = salon;
    }

    @Override
    public String toString() {
        return "Día: " + dia + ", Hora de inicio: " + horaInicio + ", Duración: " + duracion + ", Salon: " + salon.getId();
    }

    public String obtenerInfo() {
        return "Día: " + dia + ", Hora de inicio: " + horaInicio + ", Duración: " + duracion + ", Salon: " + salon.getId();
    }

    public void actualizarInfo(String dia, LocalTime horaInicio, LocalTime duracion, Salon salon) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.salon = salon;
    }
}
