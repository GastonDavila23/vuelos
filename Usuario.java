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
public class Usuario extends Persona{
    private int numeroUsuario; 
    private String contraseniaUsuario;
    private String correoUsuario;
    private ArrayList<Consulta> consultas;
    private ArrayList<Reserva> reservas;

    public Usuario(int numeroUsuario, String contraseniaUsuario, String correoUsuario, int dniPersona, String nombrePersona, String apellidoPersona) {
        super(dniPersona, nombrePersona, apellidoPersona);
        this.numeroUsuario = numeroUsuario;
        this.contraseniaUsuario = contraseniaUsuario;
        this.correoUsuario = correoUsuario;
        this.consultas = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public Usuario() {
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public String getContraseniaUsuario() {
        return contraseniaUsuario;
    }

    public void setContraseniaUsuario(String contraseniaUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
    
    public void realizarConsulta(Consulta consulta){

        System.out.println("Consulta N°" + consulta.getNumeroConsulta() + " realizada por " + getNombrePersona() + " " + getApellidoPersona());
        System.out.println(" > DNI: " + getDniPersona());
        System.out.println(consulta.mostrarConsulta());
        System.out.println("------------------------------------------------");

    }
    
    public void realizarReserva(Reserva reserva){

        System.out.println("Reserva N°" + reserva.getNumeroReserva() + " realizada por " + getNombrePersona() + " " + getApellidoPersona());
        System.out.println(" > DNI: " + getDniPersona());
        System.out.println(reserva.mostrarReserva());
        System.out.println("------------------------------------------------");

    }
}
