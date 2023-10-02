package uniandes.edu.co.hoteles.modelo;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hoteles")
public class Hotel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nombre;
    private String cadenaHotelera;
    private int numeroHabitaciones;
    private String ciudad;
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;
    private List<Salon> salones;
    private List<Supermercado> supermercados;
    private List<Spa> spas;
    private List<ServicioGastronomico> serviciosGastronomicos;
    private List<Tienda> tiendas;
    private List<ServiciosRecreativos> serviciosRecreativos;
    private List<Internet> internetList;
    private List<Usuario> usuarios;

    public Hotel(String nombre, String cadenaHotelera, int numeroHabitaciones, String ciudad) {
        this.nombre = nombre;
        this.cadenaHotelera = cadenaHotelera;
        this.numeroHabitaciones = numeroHabitaciones;
        this.ciudad = ciudad;
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.salones = new ArrayList<>();
        this.supermercados = new ArrayList<>();
        this.spas = new ArrayList<>();
        this.serviciosGastronomicos = new ArrayList<>();
        this.tiendas = new ArrayList<>();
        this.serviciosRecreativos = new ArrayList<>();
        this.internetList = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    // Métodos para agregar habitaciones, reservas, salones, supermercados, spas, servicios gastronómicos, tiendas, 
    // servicios recreativos, internet y usuarios

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cadena Hotelera: " + cadenaHotelera +
                ", Número de Habitaciones: " + numeroHabitaciones + ", Ciudad: " + ciudad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String obtenerInfo() {
        return "Nombre: " + nombre + ", Cadena Hotelera: " + cadenaHotelera +
                ", Número de Habitaciones: " + numeroHabitaciones + ", Ciudad: " + ciudad;
    }

    public void actualizarInfo(String nombre, String cadenaHotelera, int numeroHabitaciones, String ciudad) {
        this.nombre = nombre;
        this.cadenaHotelera = cadenaHotelera;
        this.numeroHabitaciones = numeroHabitaciones;
        this.ciudad = ciudad;
    }
    //No se necesita metodo borra ya que si no se hace referencia el objeto sera recogido por la basura. 
}

    

