package uniandes.edu.co.hoteles.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {

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
    private double costo;

    public Producto(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Costo: " + costo;
    }

    public String obtenerInfo() {
        return "Nombre: " + nombre + ", Costo: " + costo;
    }

    public void actualizarInfo(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    
}
