package uniandes.edu.co.hoteles.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {

    private String tipoDoc;
    private String numeroDoc;
    private String nombre;
    private String correo;
    private String rol;

    public Usuario(String tipoDoc, String numeroDoc, String nombre, String correo, String rol) {
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Tipo de Documento: " + tipoDoc + ", Número de Documento: " + numeroDoc +
                ", Nombre: " + nombre + ", Correo: " + correo + ", Rol: " + rol;
    }

    public String obtenerInfo() {
        return "Tipo de Documento: " + tipoDoc + ", Número de Documento: " + numeroDoc +
                ", Nombre: " + nombre + ", Correo: " + correo + ", Rol: " + rol;
    }

    public void actualizarInfo(String tipoDoc, String numeroDoc, String nombre, String correo, String rol) {
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
    }
}
