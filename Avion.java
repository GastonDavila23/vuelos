/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.parcial2;

import java.util.ArrayList;

/**
 *
 * @author gasto
 */
public class Avion implements Especificacion{
    private int numeroAvion;
    private ArrayList<Asiento> asientos;

    public Avion(int numeroAvion) {
        this.numeroAvion = numeroAvion;
        this.asientos = new ArrayList<>();
    }

    public Avion() {
    }

    public int getNumeroAvion() {
        return numeroAvion;
    }

    public void setNumeroAvion(int numeroAvion) {
        this.numeroAvion = numeroAvion;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }
    
    public void agregarAsiento(Asiento asiento){
        this.asientos.add(asiento);
    }
    
    public void eliminarAsiento(Asiento asiento){
        this.asientos.remove(asiento);
    }
    
    @Override
    public String toString() {
        return  "N° " + numeroAvion + ", asiento: " + asientos;
    }

    @Override
    public String tipoTurbina(){
        return "turbina tipo A";
    }   
    
    @Override
    public String tipoAvion(){
        return "avion tipo B";
    }
}
