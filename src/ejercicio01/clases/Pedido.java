package ejercicio01.clases;

public class Pedido {
    private String nombreCliente;
    private int idCajero;
    private String codigoRobot;
    private double monto;

    public Pedido(String nombreCliente, int idCajero, String codigoRobot, double monto) {
        this.nombreCliente = nombreCliente;
        this.idCajero = idCajero;
        this.codigoRobot = codigoRobot;
        this.monto = monto;
    }

    public int getIdCajero() {
        return idCajero;
    }

    public double getMonto() {
        return monto;
    }

    public String getCodigoRobot() {
        return codigoRobot;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", idCajero=" + idCajero +
                ", codigoRobot='" + codigoRobot + '\'' +
                ", monto=" + monto +
                '}';
    }
}
