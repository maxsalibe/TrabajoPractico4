package ejercicio01.clases;

public class Informe {
    private double monto;
    private String apellidoCajero;
    private double bateriaRobot;

    public Informe(double monto, String apellidoCajero, double bateriaRobot) {
        this.monto = monto;
        this.apellidoCajero = apellidoCajero;
        this.bateriaRobot = bateriaRobot;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "monto=" + monto +
                ", apellidoCajero='" + apellidoCajero + '\'' +
                ", bateriaRobot=" + bateriaRobot +
                '}';
    }
}
