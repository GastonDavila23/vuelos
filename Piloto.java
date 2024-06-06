/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.parcial2;

/**
 *
 * @author gasto
 */
public class Piloto extends Persona{
    private int numeroPiloto;

    public Piloto(int numeroPiloto, int dniPersona, String nombrePersona, String apellidoPersona) {
        super(dniPersona, nombrePersona, apellidoPersona);
        this.numeroPiloto = numeroPiloto;
    }

    public Piloto(int numeroPiloto, String nombrePersona, String apellidoPersona) {
        super(nombrePersona, apellidoPersona);
        this.numeroPiloto = numeroPiloto;
    }

    public Piloto() {
    }

    public int getNumeroPiloto() {
        return numeroPiloto;
    }

    public void setNumeroPiloto(int numeroPiloto) {
        this.numeroPiloto = numeroPiloto;
    }

    @Override
    public int getDniPersona() {
        return dniPersona;
    }

    @Override
    public void setDniPersona(int dniPersona) {
        this.dniPersona = dniPersona;
    }

    @Override
    public String getNombrePersona() {
        return nombrePersona;
    }

    @Override
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    @Override
    public String getApellidoPersona() {
        return apellidoPersona;
    }

    @Override
    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }
    
    @Override
    public String toString(){
        return  nombrePersona + " " + apellidoPersona +
               "(DNI: " + dniPersona + ", N° piloto: " + numeroPiloto + ")";
    }
}
