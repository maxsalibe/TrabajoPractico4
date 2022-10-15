package ejercicio04.pruebas;

import ejercicio04.EmpresaTrenes;
import ejercicio04.Estacion;
import ejercicio04.Recorrido;
import ejercicio04.Reserva;

// Testeado con exito en 2022-10-15

public class Principal {
    public static void main(String[] args) {
        EmpresaTrenes e = new EmpresaTrenes();
        e.agregarReserva(new Reserva("A3", new Recorrido(Estacion.BUENOS_AIRES, Estacion.MERCEDES), 5));
        e.agregarReserva(new Reserva("B3", new Recorrido(Estacion.ALBERTI, Estacion.BUENOS_AIRES), 1));
        e.agregarReserva(new Reserva("B4", new Recorrido(Estacion.BUENOS_AIRES, Estacion.BRAGADO), 7));
        e.agregarReserva(new Reserva("C3", new Recorrido(Estacion.SUIPACHA, Estacion.ALBERTI), 2));
        e.agregarReserva(new Reserva("D3", new Recorrido(Estacion.BRAGADO, Estacion.LUJAN), 3));
        e.agregarReserva(new Reserva("E3", new Recorrido(Estacion.SUIPACHA, Estacion.BRAGADO), 4));
        System.out.println("\nLa recaudacion total es: $ " + e.recaudacionTotal());
        System.out.println("\nPasan por Chivilcoy " + e.cantVecesRecorrida(Estacion.CHIVILCOY) + " personas.");

    }
}
