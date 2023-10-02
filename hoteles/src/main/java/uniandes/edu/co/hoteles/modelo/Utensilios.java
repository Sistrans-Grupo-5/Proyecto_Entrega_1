package uniandes.edu.co.hoteles.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="utensilios")
public class Utensilios {

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
    private String estado;
    private double costo;

    public Utensilios(String tipo, String estado, double costo) {
        this.tipo = tipo;
        this.estado = estado;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Estado: " + estado + ", Costo: " + costo;
    }

    public String obtenerInfo() {
        return "Tipo: " + tipo + ", Estado: " + estado + ", Costo: " + costo;
    }

    public void actualizarInfo(String tipo, String estado, double costo) {
        this.tipo = tipo;
        this.estado = estado;
        this.costo = costo;
    }
}
