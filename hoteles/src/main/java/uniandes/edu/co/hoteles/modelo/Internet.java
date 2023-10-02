package uniandes.edu.co.hoteles.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="internets")
public class Internet {

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
    private boolean costoIncluido;
    private double costoDiario;

    public Internet(int capacidad, boolean costoIncluido, double costoDiario) {
        this.capacidad = capacidad;
        this.costoIncluido = costoIncluido;
        this.costoDiario = costoDiario;
    }

    @Override
    public String toString() {
        return "Capacidad: " + capacidad + ", Costo incluido: " + costoIncluido + ", Costo diario: " + costoDiario;
    }

    public String obtenerInfo() {
        return "Capacidad: " + capacidad + ", Costo incluido: " + costoIncluido + ", Costo diario: " + costoDiario;
    }

    public void actualizarInfo(int capacidad, boolean costoIncluido, double costoDiario) {
        this.capacidad = capacidad;
        this.costoIncluido = costoIncluido;
        this.costoDiario = costoDiario;
    }
}
