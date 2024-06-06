/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.parcial2;

/**
 *
 * @author gasto
 */
public class Consulta {
    private Vuelo vuelo;
//    private static int contadorConsultas = 0;
    private int numeroConsulta;

//    public Consulta() {
//        this.numeroConsulta = ++contadorConsultas;
//    }
//    
    
    public Consulta(int numeroConsulta, Vuelo vuelo) {
        this.numeroConsulta = numeroConsulta;
        this.vuelo = vuelo;
    }

    public Consulta(int numeroConsulta) {
        this.numeroConsulta = numeroConsulta;
    }

    public int getNumeroConsulta() {
        return numeroConsulta;
    }

    public void setNumeroConsulta(int numeroConsulta) {
        this.numeroConsulta = numeroConsulta;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    
    public String mostrarConsulta(){
        return   (" > Vuelo: " + vuelo.getNumeroVuelo() +
                "\n > Tarifa: " + vuelo.getTarifa() +
                "\n > Aeropuerto: " + vuelo.getAeropuertos() +
                "\n > Clase: " + vuelo.getAvion().getAsientos() +
                "\n > Fecha: " + vuelo.getFechaSalida() +
                "\n > Aerolinea: " + vuelo.getAerolinea() +
                "\n > Piloto: " + vuelo.getPiloto()); 
    }
}
