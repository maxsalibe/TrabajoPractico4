package ejercicio05;

public class Chofer {
    private String id;
    private String nombre;
    private double pagoPorViaje;

    public Chofer(String id, double pagoPorViaje) {
        this.id = id;
        this.pagoPorViaje = pagoPorViaje;
    }

    public boolean esTuId(String id) {
        return this.id.equals(id);
    }

    public double getPagoPorViaje() {
        return this.pagoPorViaje;
    }
}
