package uniandes.edu.co.hoteles.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="serviciosgastronomicos")
public class ServicioGastronomico {

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
    private String estilo;
    private String nombre;

    public ServicioGastronomico(int capacidad, String estilo, String nombre) {
        this.capacidad = capacidad;
        this.estilo = estilo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Capacidad: " + capacidad + ", Estilo: " + estilo + ", Nombre: " + nombre;
    }

    public void actualizarInfo(int capacidad, String estilo, String nombre) {
        this.capacidad = capacidad;
        this.estilo = estilo;
        this.nombre = nombre;
    }

    public String obtenerInfo() {
        return "Capacidad: " + capacidad + ", Estilo: " + estilo + ", Nombre: " + nombre;
    }
}
