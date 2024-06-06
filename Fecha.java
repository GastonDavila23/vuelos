/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.parcial2;

import java.time.LocalDate;

/**
 *
 * @author gasto
 */
public class Fecha {
    private LocalDate fecha;

    public Fecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Fecha() {
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "" + fecha;
    }  
}
