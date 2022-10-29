package ejercicio08;

import java.util.ArrayList;

public class Aerolinea {
    private ArrayList<Reserva> reservas;
    private Avion avion;

    public Aerolinea() {
        this.reservas = new ArrayList<>();
        this.avion = new Avion();
    }

    public void asignar() {
        for (Reserva r :
                this.reservas) {
            this.avion.reservarAsiento(r.getAsiento());
        }
    }

    public int asientosLibresConVentanilla() {
        return this.avion.calcularAsientosLibresConVentanilla();
    }

    // Para testear
    public void tomarReserva(int asiento) {
        this.reservas.add(new Reserva(asiento));
    }

    public void mostrarAsientos() {
        this.avion.mostrarAsientos();
    }
}
