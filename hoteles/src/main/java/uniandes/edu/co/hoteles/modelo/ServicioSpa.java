package uniandes.edu.co.hoteles.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="serviciosspa")
public class ServicioSpa {

   @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    } 

    private String nombre;
    private String duracion;
    private double costo;

    public ServicioSpa(String nombre, String duracion, double costo) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Duración: " + duracion + ", Costo: " + costo;
    }

    public String obtenerInfo() {
        return "Nombre: " + nombre + ", Duración: " + duracion + ", Costo: " + costo;
    }

    public void actualizarInfo(String nombre, String duracion, double costo) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.costo = costo;
    }
}
