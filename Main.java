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
public class Main {
    public static void main(String[] args) { 
        
        //usuario 1
        Usuario usuario1 = new Usuario(123, "pass123",
                "juan@example.com", 40560098, "Juan", "Perez");
        //vuelo 1 y piloto 1
        Avion avion1 = new Avion(323);
        Asiento asiento1 = new Asiento(23,'G',Clase.ECONOMY);
        avion1.agregarAsiento(asiento1);
        Piloto p1 = new Piloto(45, 40560098,"Gastón","Dávila");
        Vuelo v1 = new Vuelo(32,avion1,new Fecha(LocalDate.of(2024, 8, 25)),new Fecha(LocalDate.of(2024, 9, 26)),p1,new Aerolinea("Aerolineas Argentinas"),new Tarifa(2,2340,240000,Clase.ECONOMY));
        v1.agregarAeropuerto(new Aeropuerto("Ezeiza",new Ciudad("Buenos Aires")));
        v1.agregarAeropuerto(new Aeropuerto("Plumerillo",new Ciudad("Mendoza")));
        //consulta 1
        Consulta consulta1 = new Consulta(1,v1);
        //reserva 1
        Reserva reserva1 = new Reserva(1,v1,new Tarjeta(340340,TipoTarjeta.CREDITO,23923,12323));
        
        
        
        //usuario 2
        Usuario usuario2 = new Usuario(234,"123pass","renzo@gmail.com",44560890,"Renzo","Ramirez");
        //vuelo 2 y piloto 2
        Avion avion2 = new Avion(456);
        Asiento asiento2 = new Asiento(45,'B',Clase.TOURIST);
        avion2.agregarAsiento(asiento2);
        Piloto p2 = new Piloto(43, 43321123,"Enzo","Messi");
        Vuelo v2 = new Vuelo(33,avion2,new Fecha(LocalDate.of(2024, 7, 2)),new Fecha(LocalDate.of(2024, 10, 6)),p2,new Aerolinea("FlyBondi"),new Tarifa(3,6340,540000,Clase.TOURIST));
        v2.agregarAeropuerto(new Aeropuerto("Sao Pablo",new Ciudad("Sao Pablo")));
        v2.agregarAeropuerto(new Aeropuerto("Avionetas",new Ciudad("New York")));
        //consulta 2
        Consulta consulta2 = new Consulta(2,v2);
        //reserva 2
        Reserva reserva2 = new Reserva(2,v2,new Tarjeta(4023340,TipoTarjeta.CREDITO,239243,122323));
        

        // Realizar consultas
        usuario1.realizarConsulta(consulta1);

        // Realizar reservas
        usuario2.realizarReserva(reserva1);

    }
}
