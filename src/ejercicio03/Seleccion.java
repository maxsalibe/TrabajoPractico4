package ejercicio03;

public class Seleccion {
    private static final int TITULARES = 11;
    private static final int SUPLENTES = 7;
    private static final int RESERVA = 5;
    private Jugador[] jugadores;

    public Seleccion() {
        this.jugadores = new Jugador[TITULARES + SUPLENTES + RESERVA];
    }

    public void cambio(int cam1, int cam2) {
        if (cam1 != cam2) {
            int pos1 = obtenerPosicion(cam1);
            int pos2 = obtenerPosicion(cam2);
            Jugador j1 = jugadores[pos1];
            jugadores[pos1] = jugadores[pos2];
            jugadores[pos2] = j1;
        }
    }

    private int obtenerPosicion(int cam) {
        int pos = -1;
        int i = 0;
        while (pos < 0 && i < TITULARES + SUPLENTES + RESERVA) {
            if (jugadores[i].esTuCamiseta(cam)) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }

    private int obtenerPosicion(String apellido) {
        int pos = -1;
        int i = 0;
        while (pos < 0 && i < TITULARES + SUPLENTES + RESERVA) {
            if (jugadores[i].esTuApellido(apellido)) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }

    public void cambioPorLesion(int cam, String apellido) {
        int posSaliente = obtenerPosicion(cam);
        int posEntrante = obtenerPosicion(apellido);
        jugadores[posEntrante].setCamiseta(jugadores[posSaliente].getCamiseta());
        jugadores[posEntrante].setPosicion(jugadores[posSaliente].getPosicion());
        Jugador jSal = jugadores[posSaliente];
        jugadores[posSaliente] = jugadores[posEntrante];
        jugadores[posEntrante] = jSal;
    }

    public Jugador[] obtenerReservas() {
        Jugador[] reservas = new Jugador[RESERVA];
        System.arraycopy(jugadores, jugadores.length - RESERVA, reservas, 0, RESERVA);
        return reservas;
    }

    public double[] cantJugadoresPorPosicion() {
        double[] cantidades = new double[Posicion.values().length];
        for (Jugador j :
                this.jugadores) {
            cantidades[j.getPosicion().ordinal()]++;
        }
        return cantidades;
    }

    // para testear
    public void agregarJugador(Jugador j) {
        int i = 0;
        while (jugadores[i] != null && i < jugadores.length) {
            i++;
        }
        if (i < jugadores.length) {
            jugadores[i] = j;
        }
    }

    public void mostrarPlantel() {
        System.out.println();
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println((i + 1) + ". " + jugadores[i]);
        }

    }

    public void mostrarReservas() {
        for (Jugador j :
                obtenerReservas()) {
            System.out.println(j);
        }
    }

    public void mostrarCantPorPosicion() {
        System.out.println("Arqueros: " + cantJugadoresPorPosicion()[0]);
        System.out.println("Defensores: " + cantJugadoresPorPosicion()[1]);
        System.out.println("Mediocampistas: " + cantJugadoresPorPosicion()[2]);
        System.out.println("Delanteros: " + cantJugadoresPorPosicion()[3]);
    }

}
