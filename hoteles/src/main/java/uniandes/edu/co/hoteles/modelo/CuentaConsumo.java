package uniandes.edu.co.hoteles.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuentasConsumo")
public class CuentaConsumo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    private double total;
    private boolean pazYSalvo;
    private String numeroHabitacion;

    public CuentaConsumo(double total, boolean pazYSalvo, String numeroHabitacion) {
        this.total = total;
        this.pazYSalvo = pazYSalvo;
        this.numeroHabitacion = numeroHabitacion;
    }

    @Override
    public String toString() {
        return "Total: " + total + ", Paz y Salvo: " + pazYSalvo + ", Número de habitación: " + numeroHabitacion;
    }

    public String obtenerInfo() {
        return "Total: " + total + ", Paz y Salvo: " + pazYSalvo + ", Número de habitación: " + numeroHabitacion;
    }

    public void actualizarInfo(double total, boolean pazYSalvo, String numeroHabitacion) {
        this.total = total;
        this.pazYSalvo = pazYSalvo;
        this.numeroHabitacion = numeroHabitacion;
    }
}
