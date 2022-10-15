package ejercicio04;

import java.util.ArrayList;

public class EmpresaTrenes {
    public static final double PRECIO_ESTACION_RECORRIDA = 50;
    public static final double DESCUENTO_ENTRE_CABECERAS = 0.8;
    private ArrayList<Reserva> reservas;

    public EmpresaTrenes() {
        this.reservas = new ArrayList<>();
    }

    public double recaudacionTotal() {
        double monto = 0;
        for (Reserva r :
                reservas) {
            monto += r.precio();
        }
        return monto;
    }

    public int cantVecesRecorrida(Estacion e) {
        int pos = e.ordinal();
        int contador = 0;
        for (Reserva r :
                reservas) {
            contador += r.personasQuePasanPorLaEstacion(pos);
        }
        return contador;
    }

    // Para testear
    public void agregarReserva(Reserva r) {
        reservas.add(r);
    }
}
