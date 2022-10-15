package ejercicio01.clases;

public class Cajero {

    private int id;
    private String apellido;
    private int antiguedad;

    public Cajero(String apellido, int antiguedad) {
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        id = ++Sistema.ultimoIdCajero;
    }

    public int getId() {
        return id;
    }

    public boolean esTuId(int id) {
        return this.id == id;
    }

    public String getApellido() {
        return apellido;
    }
}
