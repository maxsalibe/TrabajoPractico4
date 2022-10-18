package ejercicio05;

public class Camion {
    private static int PROXIMO_ID = 0;
    private int id;
    private double costoPorKm;

    public Camion(double costoPorKm) {
        this.id = PROXIMO_ID++;
        this.costoPorKm = costoPorKm;
    }

    public boolean esTuId(int id) {
        return this.id == id;
    }

    public double getCostoPorKm() {
        return costoPorKm;
    }
}
