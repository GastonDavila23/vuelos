/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.parcial2;

/**
 *
 * @author gasto
 */
public class Pago {
    protected int numeroPago;
    protected int cantidadPago;

    public Pago(int numeroPago, int cantidadPago) {
        this.numeroPago = numeroPago;
        this.cantidadPago = cantidadPago;
    }

    public Pago(int numeroPago) {
        this.numeroPago = numeroPago;
    }
    
    public Pago() {
    }

    public int getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(int numeroPago) {
        this.numeroPago = numeroPago;
    }

    public int getCantidadPago() {
        return cantidadPago;
    }

    public void setCantidadPago(int cantidadPago) {
        this.cantidadPago = cantidadPago;
    }
    
    @Override
    public String toString(){
       return "Pago: N°" + numeroPago +
              " ,cantidad: $" + cantidadPago;
    }
}
