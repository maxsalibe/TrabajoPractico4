package ejercicio04;

public class Recorrido {
    private Estacion estacionPartida;
    private Estacion estacionDestino;

    public Recorrido(Estacion estacionPartida, Estacion estacionDestino) {
        this.estacionPartida = estacionPartida;
        this.estacionDestino = estacionDestino;
    }

    public int estacionesRecorridas() {
        return Math.abs(estacionDestino.ordinal() - estacionPartida.ordinal()) + 1;
    }

    public boolean pasaPorLaEstacionNro(int n) {
        return (estacionPartida.ordinal() <= n && estacionDestino.ordinal() >= n) ||
                (estacionPartida.ordinal() >= n && estacionDestino.ordinal() <= n);
    }
}
