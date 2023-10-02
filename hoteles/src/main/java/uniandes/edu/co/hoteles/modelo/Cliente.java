package uniandes.edu.co.hoteles.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Date fechaEntrada;
    private Date fechaSalida;
    private String numeroHabitacion;

    public Cliente(Date fechaEntrada, Date fechaSalida, String numeroHabitacion) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numeroHabitacion = numeroHabitacion;
    }

    @Override
    public String toString() {
        return "Fecha de entrada: " + fechaEntrada + ", Fecha de salida: " + fechaSalida + ", Número de habitación: " + numeroHabitacion;
    }

    public String obtenerInfo() {
        return "Fecha de entrada: " + fechaEntrada + ", Fecha de salida: " + fechaSalida + ", Número de habitación: " + numeroHabitacion;
    }

    public void actualizarInfo(Date fechaEntrada, Date fechaSalida, String numeroHabitacion) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numeroHabitacion = numeroHabitacion;
    }
}
