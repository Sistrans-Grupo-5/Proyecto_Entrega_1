package uniandes.edu.co.hoteles.modelo;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="consumos")
public class Consumo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    } 

    private String habitacion;
    private double costo;
    private String descripcion;
    private Date fecha;

    public Consumo(String habitacion, double costo, String descripcion, Date fecha) {
        this.habitacion = habitacion;
        this.costo = costo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Habitación: " + habitacion + ", Costo: " + costo + ", Descripción: " + descripcion + ", Fecha: " + fecha;
    }

    public String obtenerInfo() {
        return "Habitación: " + habitacion + ", Costo: " + costo + ", Descripción: " + descripcion + ", Fecha: " + fecha;
    }

    public void actualizarInfo(String habitacion, double costo, String descripcion, Date fecha) {
        this.habitacion = habitacion;
        this.costo = costo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
}
