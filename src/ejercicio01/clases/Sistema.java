package ejercicio01.clases;

import java.util.ArrayList;

public class Sistema {
    private static final int CANTIDAD_CAJEROS = 5;
    private static final int CANTIDAD_ROBOTS = 8;
    public static int ultimoIdCajero = 0;
    private Cajero[] cajeros;
    private Robot[] robots;
    private ArrayList<Pedido> pedidos;

    public Sistema() {
        cajeros = new Cajero[CANTIDAD_CAJEROS];
        robots = new Robot[CANTIDAD_ROBOTS];
        pedidos = new ArrayList<>();
    }

    public double[] montosPorCajero() {
        double[] montos = new double[CANTIDAD_CAJEROS];
        for (Pedido p :
                pedidos) {
        int posicion = p.getIdCajero();
        montos[posicion - 1] += p.getMonto();
        }
        return montos;
    }

    // Para testear
    public void agregarCajero(String apellido, int antiguedad) {
        Cajero c = new Cajero(apellido, antiguedad);
        cajeros[ultimoIdCajero - 1] = c;
    }

    public void agregarRobot(String codigo, double bateria) {
        int pos = 0;
        boolean agregado = false;
        while (!agregado & pos < robots.length) {
            if (robots[pos] == null) {
                robots[pos] = new Robot(codigo, bateria);
                agregado = true;
            } else {
                pos++;
            }
        }
    }

    public void tomarPedido(String nombreCliente, int idCajero, String codigoRobot, double monto) {
        this.pedidos.add(new Pedido(nombreCliente, idCajero, codigoRobot, monto));
    }

    public Informe[] informeDePedidos() {
        Informe[] vector = new Informe[pedidos.size()];
        for (int i = 0; i < pedidos.size(); i++) {
            double monto = pedidos.get(i).getMonto();
            String apellidoCajero = buscarApellidoCajero(pedidos.get(i).getIdCajero());
            double bateriaRobot = buscarBateriaRobot(pedidos.get(i).getCodigoRobot());
            vector[i] = new Informe(monto, apellidoCajero, bateriaRobot);
        }
        return vector;
    }

    private double buscarBateriaRobot(String codigoRobot) {
        int i = 0;
        double  bateria = -1;
        while (i < CANTIDAD_ROBOTS && bateria < 0) {
            if (robots[i].esTuCodigo(codigoRobot)) {
                bateria = robots[i].getBateria();
            } else {
                i++;
            }
        }
        return bateria;
    }

    private String buscarApellidoCajero(int idCajero) {
        int i = 0;
        String apellido = null;
        while (i < CANTIDAD_CAJEROS && apellido == null) {
            if (cajeros[i].esTuId(idCajero)) {
                apellido = cajeros[i].getApellido();
            } else {
                i++;
            }
        }
        return apellido;
    }

    public void mostrarPedidosConMasRiesgo(double limiteInferior) {
        System.out.println("Pedidos con mas riesgo por tener bateria menor a " + limiteInferior + ":");
        for (Pedido p :
                pedidos) {
            if (buscarBateriaRobot(p.getCodigoRobot()) < limiteInferior) {
                System.out.println(p);
            }
        }
    }

    // Para testear
    public void mostrarInformes() {
        for (Informe i :
                informeDePedidos()) {
            System.out.println(i);
        }
    }
}
