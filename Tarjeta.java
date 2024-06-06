/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.parcial2;

/**
 *
 * @author gasto
 */
public class Tarjeta extends Pago{
    private int numeroTarjeta;
    private TipoTarjeta tipoTarjeta;

    public Tarjeta(int numeroTarjeta, TipoTarjeta tipoTarjeta, int numeroPago, int cantidadPago) {
        super(numeroPago, cantidadPago);
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta = tipoTarjeta;
    }

    public Tarjeta() {
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public TipoTarjeta getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(TipoTarjeta tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    @Override
    public int getNumeroPago() {
        return numeroPago;
    }

    @Override
    public void setNumeroPago(int numeroPago) {
        this.numeroPago = numeroPago;
    }

    @Override
    public int getCantidadPago() {
        return cantidadPago;
    }

    @Override
    public void setCantidadPago(int cantidadPago) {
        this.cantidadPago = cantidadPago;
    }
    
    @Override
    public String toString(){
        return "Tarjeta de " + tipoTarjeta +
               ", N°: " + numeroTarjeta + 
               ", cantidad: $" + cantidadPago +
               ", N° pago: " + numeroPago;
    }
}
