/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.parcial2;

/**
 *
 * @author gasto
 */
public class Asiento {
    private int filaAsiento;
    private char letraAsiento;
    private Clase claseAsiento;

    public Asiento(int filaAsiento, char letraAsiento, Clase clase) {
        this.filaAsiento = filaAsiento;
        this.letraAsiento = letraAsiento;
        this.claseAsiento = clase;
    }

    public Asiento() {
    }

    public int getFilaAsiento() {
        return filaAsiento;
    }

    public void setFilaAsiento(int filaAsiento) {
        this.filaAsiento = filaAsiento;
    }

    public char getLetraAsiento() {
        return letraAsiento;
    }

    public void setLetraAsiento(char letraAsiento) {
        this.letraAsiento = letraAsiento;
    }

    public Clase getClase() {
        return claseAsiento;
    }

    public void setClase(Clase clase) {
        this.claseAsiento = clase;
    }

    @Override
    public String toString() {
        return "("+filaAsiento + letraAsiento + " - " + claseAsiento + ")";
    }  
}
