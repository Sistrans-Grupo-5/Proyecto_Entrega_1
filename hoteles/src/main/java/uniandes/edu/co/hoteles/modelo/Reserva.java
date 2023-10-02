package uniandes.edu.co.hoteles.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name="reservass")
public class Reserva {

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
    private int numeroPersonas;
    private String planConsumo;

    public Reserva(Date fechaEntrada, Date fechaSalida, int numeroPersonas, String planConsumo) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numeroPersonas = numeroPersonas;
        this.planConsumo = planConsumo;
    }

    @Override
    public String toString() {
        return "Fecha de entrada: " + fechaEntrada + ", Fecha de salida: " + fechaSalida +
                ", Número de personas: " + numeroPersonas + ", Plan de consumo: " + planConsumo;
    }

    public String obtenerInfo() {
        return "Fecha de entrada: " + fechaEntrada + ", Fecha de salida: " + fechaSalida +
                ", Número de personas: " + numeroPersonas + ", Plan de consumo: " + planConsumo;
    }

    public void actualizarInfo(Date fechaEntrada, Date fechaSalida, int numeroPersonas, String planConsumo) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numeroPersonas = numeroPersonas;
        this.planConsumo = planConsumo;
    }
}
