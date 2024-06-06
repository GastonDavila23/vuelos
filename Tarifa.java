/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.parcial2;

/**
 *
 * @author gasto
 */
public class Tarifa {
    private int numeroTarifa;
    private int impuestoTarifa;
    private int precioTarifa;
    private Clase claseTarifa;

    public Tarifa(int numeroTarifa, int impuestoTarifa, int precioTarifa, Clase claseTarifa) {
        this.numeroTarifa = numeroTarifa;
        this.impuestoTarifa = impuestoTarifa;
        this.precioTarifa = precioTarifa;
        this.claseTarifa = claseTarifa;
    }

    public Tarifa() {
    }

    public int getNumeroTarifa() {
        return numeroTarifa;
    }

    public void setNumeroTarifa(int numeroTarifa) {
        this.numeroTarifa = numeroTarifa;
    }

    public int getImpuestoTarifa() {
        return impuestoTarifa;
    }

    public void setImpuestoTarifa(int impuestoTarifa) {
        this.impuestoTarifa = impuestoTarifa;
    }

    public int getPrecioTarifa() {
        return precioTarifa;
    }

    public void setPrecioTarifa(int precioTarifa) {
        this.precioTarifa = precioTarifa;
    }

    public Clase getClaseTarifa() {
        return claseTarifa;
    }

    public void setClaseTarifa(Clase claseTarifa) {
        this.claseTarifa = claseTarifa;
    }

    @Override
    public String toString() {
        return "N°" + numeroTarifa + " ,impuesto: $" + impuestoTarifa 
                + " ,precio: $" + precioTarifa + " ,clase: " + claseTarifa;
    } 
}
