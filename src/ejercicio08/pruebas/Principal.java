package ejercicio08.pruebas;

import ejercicio08.Aerolinea;

// Testeado con exito en 2022-10-29.

public class Principal {
    public static void main(String[] args) {
        Aerolinea a = new Aerolinea();

        a.tomarReserva(1);
        a.tomarReserva(7);
        a.tomarReserva(19);
        a.tomarReserva(40);
        a.tomarReserva(57);
        a.tomarReserva(95);
        a.tomarReserva(96);

        a.mostrarAsientos();

        a.asignar();

        System.out.println("Se toman reservas");
        a.mostrarAsientos();

        System.out.println("\nQuedan " + a.asientosLibresConVentanilla() + " asientos libres con ventanilla.");

    }
}
