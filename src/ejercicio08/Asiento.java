package ejercicio08;

public class Asiento {
    private int numero;
    private EstadoAsiento estado;

    public Asiento(int numero) {
        this.numero = numero;
        this.estado = EstadoAsiento.LIBRE;
    }

    public void reservar() {
        this.estado = EstadoAsiento.RESERVADO;
    }

    @Override
    public String toString() {
        return "Asiento # " + (this.numero) + " " + this.estado;
    }

    public boolean estaJuntoAVentanilla() {
        return this.numero % Avion.COLUMNAS == 1 || this.numero % Avion.COLUMNAS == 0;
    }

    public boolean estaLibre() {
        return this.estado == EstadoAsiento.LIBRE;
    }
}
