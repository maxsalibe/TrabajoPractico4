package ejercicio08;

public class Reserva {
    private String id;
    private String dniCliente;
    private int asiento;

    public Reserva(int asiento) {
        this.asiento = asiento;
    }
    public int getAsiento() {
        return this.asiento;
    }
}
