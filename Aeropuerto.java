/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.parcial2;

/**
 *
 * @author gasto
 */
public class Aeropuerto {
    private String nombreAeropuerto;
    private Ciudad ciudad;

    public Aeropuerto(String nombreAeropuerto, Ciudad ciudad) {
        this.nombreAeropuerto = nombreAeropuerto;
        this.ciudad = ciudad;
    }

    public Aeropuerto() {
    }

    public String getNombreAeropuerto() {
        return nombreAeropuerto;
    }

    public void setNombreAeropuerto(String nombreAeropuerto) {
        this.nombreAeropuerto = nombreAeropuerto;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public String toString() {
        return nombreAeropuerto + "(" + ciudad + ")";
    }
}
