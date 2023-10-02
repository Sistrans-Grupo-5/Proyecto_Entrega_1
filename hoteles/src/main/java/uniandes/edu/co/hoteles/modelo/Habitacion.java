package uniandes.edu.co.hoteles.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="habitaciones")
public class Habitacion {

   @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    } 

    private String tipo;
    private int capacidad;
    private boolean television;
    private boolean minibar;
    private boolean cafeteria;
    private double costoNoche;
    private String numero;

    public Habitacion(String tipo, int capacidad, boolean television, boolean minibar,
                      boolean cafeteria, double costoNoche, String numero) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.television = television;
        this.minibar = minibar;
        this.cafeteria = cafeteria;
        this.costoNoche = costoNoche;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Capacidad: " + capacidad +
                ", Tiene televisión: " + television + ", Tiene minibar: " + minibar +
                ", Tiene cafetería: " + cafeteria + ", Costo por noche: " + costoNoche +
                ", Número de habitación: " + numero;
    }

    public String obtenerInfo() {
        return "Tipo: " + tipo + ", Capacidad: " + capacidad +
                ", Tiene televisión: " + television + ", Tiene minibar: " + minibar +
                ", Tiene cafetería: " + cafeteria + ", Costo por noche: " + costoNoche +
                ", Número de habitación: " + numero;
    }

    public void actualizarInfo(String tipo, int capacidad, boolean television, boolean minibar,
                                boolean cafeteria, double costoNoche, String numero) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.television = television;
        this.minibar = minibar;
        this.cafeteria = cafeteria;
        this.costoNoche = costoNoche;
        this.numero = numero;
    }
}
