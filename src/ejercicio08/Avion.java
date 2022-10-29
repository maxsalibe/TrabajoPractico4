package ejercicio08;

public class Avion {
    public static final int FILAS = 16;
    public static final int COLUMNAS = 6;
    private String marca;
    private Asiento[][] asientos;

    public Avion() {
        this.asientos = new Asiento[FILAS][COLUMNAS];
        inicializarMatrizDeAsientos();
    }

    private void inicializarMatrizDeAsientos() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                this.asientos[i][j] = new Asiento(i * COLUMNAS + j + 1);
            }
        }
    }

    public void reservarAsiento(int n) {
        int fila = calcularFila(n);
        int columna = calcularColumna(n);
        this.asientos[fila][columna].reservar();
    }

    private int calcularFila(int n) {
        return Math.ceilDiv(n, COLUMNAS) - 1;
    }

    private int calcularColumna(int n) {
        int p = n % COLUMNAS;
        return p == 0 ? COLUMNAS - 1 : p - 1;
    }

    public int calcularAsientosLibresConVentanilla() {
        int asientosLibresVentanilla = 0;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (this.asientos[i][j].estaJuntoAVentanilla() &&
                        this.asientos[i][j].estaLibre()) {
                    asientosLibresVentanilla++;
                }
            }
        }
        return asientosLibresVentanilla;
    }

    // Para testear
    public void mostrarAsientos() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.println(this.asientos[i][j]);
            }
        }
    }

}