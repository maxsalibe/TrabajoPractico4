package ejercicio01.clases;

public class Robot {
    private String codigo;
    private double bateria;

    public Robot(String codigo, double bateria) {
        this.bateria = bateria;
        this.codigo = codigo;
    }

    public double getBateria() {
        return bateria;
    }

    public boolean esTuCodigo(String c) {
        return codigo.equals(c);
    }
}
