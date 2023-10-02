package uniandes.edu.co.hoteles.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalTime;

@Entity
@Table(name="reservasspa")
public class ReservaSpa {

   @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    } 

    private String dia;
    private LocalTime hora;
    private Spa spa;

    public ReservaSpa(String dia, LocalTime hora, Spa spa) {
        this.dia = dia;
        this.hora = hora;
        this.spa = spa;
    }

    @Override
    public String toString() {
        return "Día: " + dia + ", Hora: " + hora + ", Spa: " + spa.getId();
    }

    public String obtenerInfo() {
        return "Día: " + dia + ", Hora: " + hora + ", Spa: " + spa.getId();
    }

    public void actualizarInfo(String dia, LocalTime hora, Spa spa) {
        this.dia = dia;
        this.hora = hora;
        this.spa = spa;
    }


}
