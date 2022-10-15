package ejercicio03.test;

import ejercicio03.Jugador;
import ejercicio03.Posicion;
import ejercicio03.Seleccion;

// Testeado con exito en 2022-10-15

public class Principal {
    public static void main(String[] args) {
        Seleccion s = new Seleccion();
        Jugador j1 = new Jugador(Posicion.ARQUERO, "Goncalvez", 1);
        Jugador j2 = new Jugador(Posicion.DEFENSOR, "Gutierrez", 4);
        Jugador j3 = new Jugador(Posicion.DEFENSOR, "Lopez", 10);
        Jugador j4 = new Jugador(Posicion.DELANTERO, "Gonzalez", 8);
        Jugador j5 = new Jugador(Posicion.DELANTERO, "Fernandez", 9);
        Jugador j6 = new Jugador(Posicion.MEDIOCAMPISTA, "Perez", 11);
        Jugador j7 = new Jugador(Posicion.MEDIOCAMPISTA, "Hernandez", 16);
        Jugador j8 = new Jugador(Posicion.MEDIOCAMPISTA, "Miguez", 20);
        Jugador j9 = new Jugador(Posicion.DELANTERO, "Alvez", 21);
        Jugador j10 = new Jugador(Posicion.DEFENSOR, "Luchetti", 19);
        Jugador j11 = new Jugador(Posicion.DELANTERO, "Comas", 18);
        Jugador j12 = new Jugador(Posicion.ARQUERO, "Alvarez", 2);
        Jugador j13 = new Jugador(Posicion.DELANTERO, "Spela", 3);
        Jugador j14 = new Jugador(Posicion.DELANTERO, "Manfredi", 5);
        Jugador j15 = new Jugador(Posicion.DEFENSOR, "Barboza", 6);
        Jugador j16 = new Jugador(Posicion.DEFENSOR, "Leyes", 7);
        Jugador j17 = new Jugador(Posicion.MEDIOCAMPISTA, "Marquez", 12);
        Jugador j18 = new Jugador(Posicion.MEDIOCAMPISTA, "Gomez", 13);
        Jugador j19 = new Jugador(Posicion.ARQUERO, "Fajri", 14);
        Jugador j20 = new Jugador(Posicion.DELANTERO, "Suleiman", 15);
        Jugador j21 = new Jugador(Posicion.DEFENSOR, "Carbonero", 17);
        Jugador j22 = new Jugador(Posicion.DELANTERO, "Icardi", 23);
        Jugador j23 = new Jugador(Posicion.MEDIOCAMPISTA, "Di Maria", 22);
        s.agregarJugador(j1);
        s.agregarJugador(j2);
        s.agregarJugador(j3);
        s.agregarJugador(j4);
        s.agregarJugador(j5);
        s.agregarJugador(j6);
        s.agregarJugador(j7);
        s.agregarJugador(j8);
        s.agregarJugador(j9);
        s.agregarJugador(j10);
        s.agregarJugador(j11);
        s.agregarJugador(j12);
        s.agregarJugador(j13);
        s.agregarJugador(j14);
        s.agregarJugador(j15);
        s.agregarJugador(j16);
        s.agregarJugador(j17);
        s.agregarJugador(j18);
        s.agregarJugador(j19);
        s.agregarJugador(j20);
        s.agregarJugador(j21);
        s.agregarJugador(j22);
        s.agregarJugador(j23);
        System.out.println("\nAntes del cambio, el plantel es:");
        s.mostrarPlantel();
        System.out.println("\nAhora cambio el 8 por el 3:");
        s.cambio(8, 3);
        s.mostrarPlantel();
        System.out.println("\nAhora se lesiona el camiseta 10 (lopez) y lo reemplaza el camiseta 6 (Barboza)");
        s.cambioPorLesion(10, "Barboza");
        s.mostrarPlantel();
        System.out.println("\nEstas son las reservas:");
        s.mostrarReservas();
        System.out.println("\nPor posicion, se tiene la siguiente cantidad: ");
        s.mostrarCantPorPosicion();

    }


}
