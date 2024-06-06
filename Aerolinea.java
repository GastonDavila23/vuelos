/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.parcial2;

/**
 *
 * @author gasto
 */
public class Aerolinea {
    private String nombreAerolinea;

    public Aerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }

    public Aerolinea() {
    }

    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }
    
    @Override
    public String toString(){
        return nombreAerolinea;
    }
}
