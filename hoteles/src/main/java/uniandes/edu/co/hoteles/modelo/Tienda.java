package uniandes.edu.co.hoteles.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tiendas")
public class Tienda {
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
    private List<Producto> productos;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }

    public String obtenerInfo() {
        return "Nombre: " + nombre;
    }

    public void actualizarInfo(String nombre) {
        this.nombre = nombre;
    }

}