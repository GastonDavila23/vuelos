/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.parcial2;

/**
 *
 * @author gasto
 */
public class Reserva {
    private int numeroReserva;
    private Vuelo vuelo;
    private Pago pago;
    private Tarjeta tarjeta;

    public Reserva(int numeroReserva, Vuelo vuelo, Tarjeta tarjeta) {
        this.numeroReserva = numeroReserva;
        this.vuelo = vuelo;
        this.tarjeta = tarjeta;
    }

    public Reserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public Reserva() {
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    
    public String mostrarReserva(){
        return   (" > Vuelo: " + vuelo.getNumeroVuelo() +
                "\n > Tarifa: " + vuelo.getTarifa() +
                "\n > Aeropuerto: " + vuelo.getAeropuertos() +
                "\n > Clase: " + vuelo.getAvion().getAsientos() +
                "\n > Avión: " + vuelo.getAvion().getNumeroAvion() +
                "\n > Tipo de turbina: " + vuelo.getAvion().tipoTurbina() +
                "\n > Fecha: " + vuelo.getFechaSalida() +
                "\n > Aerolinea: " + vuelo.getAerolinea() +
                "\n > N° de pago: " + tarjeta.getNumeroPago() +
                "\n > N° de tarjeta del usuario: " + tarjeta.getNumeroTarjeta() + "(" + tarjeta.getTipoTarjeta() + ")"); 
    }    
}
