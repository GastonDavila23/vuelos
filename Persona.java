/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.parcial2;

/**
 *
 * @author gasto
 */
public class Persona {
    protected int dniPersona;
    protected String nombrePersona;
    protected String apellidoPersona;

    public Persona(int dniPersona, String nombrePersona, String apellidoPersona) {
        this.dniPersona = dniPersona;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
    }

    public Persona(String nombrePersona, String apellidoPersona) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
    }

    public Persona() {
    }

    public int getDniPersona() {
        return dniPersona;
    }

    public void setDniPersona(int dniPersona) {
        this.dniPersona = dniPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }
    
    @Override
    public String toString(){
        return "Persona: " + nombrePersona + " " + apellidoPersona + 
               " , DNI: " + dniPersona;
    }
}
