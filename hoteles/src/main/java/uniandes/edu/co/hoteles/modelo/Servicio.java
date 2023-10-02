package uniandes.edu.co.hoteles.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name="servicios")
public class Servicio {

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

    public Servicio(String habitacion, double costo, String descripcion, Date fecha) {
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
