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
public class Vuelo {
    private int numeroVuelo;
    private Avion avion;
    private Fecha fechaSalida;
    private Fecha fechaLlegada;
    private Piloto piloto;
    private Aerolinea aerolinea;
    private Tarifa tarifa;
    private ArrayList<Aeropuerto> aeropuertos;
    
    public Vuelo(int numeroVuelo, Avion avion, Fecha fechaSalida, Fecha fechaLlegada, Piloto piloto, Aerolinea aerolinea, Tarifa tarifa) {
        this.numeroVuelo = numeroVuelo;
        this.avion = avion;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.piloto = piloto;
        this.aerolinea = aerolinea;
        this.tarifa = tarifa;
        this.aeropuertos = new ArrayList<>();
    }

    public Vuelo() {
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Fecha getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Fecha fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Fecha getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Fecha fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public ArrayList<Aeropuerto> getAeropuertos() {
        return aeropuertos;
    }

    public void setAeropuertos(ArrayList<Aeropuerto> aeropuertos) {
        this.aeropuertos = aeropuertos;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }
    
    public void agregarAeropuerto(Aeropuerto aeropuerto){
        this.aeropuertos.add(aeropuerto);
    }
    
    public void eliminarAeropuerto(Aeropuerto aeropuerto){
        this.aeropuertos.remove(aeropuerto);
    }
    
    public String mostrarVuelo(){
        return ("N°" + numeroVuelo + 
               "\n > Fecha Salida: " + fechaSalida + 
               "\n > Fecha Llegada: " + fechaLlegada + 
               "\n > Avion: " + avion +
               "\n > Tarifa: " + tarifa +
               "\n > Aerolinea: " + aerolinea +
               "\n > Aeropuertos: " + aeropuertos +
               "\n > Piloto: " + piloto 
        ); 
    }  
}
