package uniandes.edu.co.hoteles.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="salones")
public class Salon {

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
    private double costo;

    public Salon(int capacidad, double costo) {
        this.capacidad = capacidad;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Capacidad: " + capacidad + ", Costo por hora: " + costo;
    }

    public String obtenerInfo() {
        return "Capacidad: " + capacidad + ", Costo por hora: " + costo;
    }

    public void actualizarInfo(int capacidad, double costo) {
        this.capacidad = capacidad;
        this.costo = costo;
    }
}
