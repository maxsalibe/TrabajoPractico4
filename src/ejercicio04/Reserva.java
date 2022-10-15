package ejercicio04;

public class Reserva {
    private String codigo;
    private Recorrido recorrido;
    private int cantPersonas;

    public Reserva(String codigo, Recorrido recorrido, int cantPersonas) {
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.cantPersonas = cantPersonas;
    }

    public double precio() {
        int estaciones = this.recorrido.estacionesRecorridas();
        double precio = estaciones != Estacion.values().length ?
                estaciones * EmpresaTrenes.PRECIO_ESTACION_RECORRIDA :
                estaciones * EmpresaTrenes.PRECIO_ESTACION_RECORRIDA * EmpresaTrenes.DESCUENTO_ENTRE_CABECERAS;
        return precio * cantPersonas;
    }

    public int personasQuePasanPorLaEstacion(int n) {
        return recorrido.pasaPorLaEstacionNro(n) ? cantPersonas : 0;
    }
}
