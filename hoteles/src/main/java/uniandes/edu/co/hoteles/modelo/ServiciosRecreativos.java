package uniandes.edu.co.hoteles.modelo;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="serviciosrecreativos")
public class ServiciosRecreativos {

   @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    } 

    private int capacidad;
    private Time horaApertura;
    private Time horaCierre;
    private boolean costoIncluido;

    public ServiciosRecreativos(int capacidad, Time horaApertura, Time horaCierre, boolean costoIncluido) {
        this.capacidad = capacidad;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.costoIncluido = costoIncluido;
    }

    @Override
    public String toString() {
        return "Capacidad: " + capacidad + ", Hora de apertura: " + horaApertura +
                ", Hora de cierre: " + horaCierre + ", Costo incluido: " + costoIncluido;
    }

    public String obtenerInfo() {
        return "Capacidad: " + capacidad + ", Hora de apertura: " + horaApertura +
                ", Hora de cierre: " + horaCierre + ", Costo incluido: " + costoIncluido;
    }

    public void actualizarInfo(int capacidad, Time horaApertura, Time horaCierre, boolean costoIncluido) {
        this.capacidad = capacidad;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.costoIncluido = costoIncluido;
    }
}
