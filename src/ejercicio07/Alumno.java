package ejercicio07;

public class Alumno {
    private String legajo;
    private String apellido;
    private int edad;

    public Alumno(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return this.apellido;
    }
}
