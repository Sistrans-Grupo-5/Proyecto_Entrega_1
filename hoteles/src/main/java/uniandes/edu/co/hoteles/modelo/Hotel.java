package uniandes.edu.co.hoteles.modelo;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="HOTEL")
public class Hotel {
    
    @Id
    @SequenceGenerator(name="HOTEL_ID_GENERATOR", sequenceName="SQ_HOTEL", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HOTEL_ID_GENERATOR")    
    private Integer hotelId;

    private String nombre;
    private String cadenaHotelera;
    private int numeroHabitaciones;
    private String ciudad;
    // private List<Habitacion> habitaciones;
    // private List<Reserva> reservas;
    // private List<Salon> salones;
    // private List<Supermercado> supermercados;
    // private List<Spa> spas;
    // private List<ServicioGastronomico> serviciosGastronomicos;
    // private List<Tienda> tiendas;
    // private List<ServiciosRecreativos> serviciosRecreativos;
    // private List<Internet> internetList;
    // private List<Usuario> usuarios;

    
}

    

