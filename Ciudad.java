/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.parcial2;

/**
 *
 * @author gasto
 */
public class Ciudad {
    private String nombreCiudad;

    public Ciudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public Ciudad() {
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }    
    
    //Cuando imprimimos la ciudad, devuelve el valor creado 
    //y no la referencia del lugar donde esta guardado
    @Override
    public String toString(){
        return nombreCiudad;
    }
}
 