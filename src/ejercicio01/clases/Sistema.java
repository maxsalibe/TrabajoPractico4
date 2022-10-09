package ejercicio01.clases;

import java.util.ArrayList;

public class Sistema {
    private static final int CANTIDAD_CAJEROS = 5;
    private static final int CANTIDAD_ROBOTS = 8;
    private Cajero[] cajeros;
    private Robot[] robots;
    private ArrayList<Pedido> pedidos;

    public Sistema() {
        cajeros = new Cajero[CANTIDAD_CAJEROS];
        robots = new Robot[CANTIDAD_ROBOTS];
        pedidos = new ArrayList<>();
    }

    public double[] montosPorCajero() {
        int pos1 = 1;
        double[] montos = new double[CANTIDAD_CAJEROS];
        for (Pedido p :
                pedidos) {

        }
        return montos;
    }
}
