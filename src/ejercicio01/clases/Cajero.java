package ejercicio01.clases;

public class Cajero {
    private int id;
    private String apellido;
    private int antiguedad;

    public boolean esTuId(int id) {
        return this.id == id;
    }
}
