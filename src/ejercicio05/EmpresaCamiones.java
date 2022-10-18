package ejercicio05;

import java.util.ArrayList;

public class EmpresaCamiones {
    private static final int TAMANIO_FLOTA = 10;
    private static final int CANT_CHOFERES = 20;
    private Camion[] flota;
    private Chofer[] choferes;
    private ArrayList<Viaje> viajes;

    public EmpresaCamiones() {
        this.flota = new Camion[TAMANIO_FLOTA];
        this.choferes = new Chofer[CANT_CHOFERES];
        this.viajes = new ArrayList<>();
    }

    public ArrayList<Double> obtenerCostosDeViajes() {
        ArrayList<Double> costos = new ArrayList<>();
        for (int i = 0; i < viajes.size(); i++) {
            Viaje v = this.viajes.get(i);
            double honorarios = obtenerHonorarios(v.getIdChofer());
            double costoPorKm = obtenerCostoPorKm(v.getIdCamion());
            double kms = v.getKms();

            costos.add(honorarios + costoPorKm * kms);
        }
        return costos;
    }

    private double obtenerHonorarios(String idChofer) {
        double honorarios = -1;
        int i = 0;
        while (honorarios < 0 && i < CANT_CHOFERES) {
            if (choferes[i].esTuId(idChofer)) {
                honorarios = choferes[i].getPagoPorViaje();
            } else {
                i++;
            }
        }
        return honorarios;
    }

    private double obtenerCostoPorKm(int idCamion) {
        double costoPorKm = -1;
        int i = 0;
        while (costoPorKm < 0 && i < TAMANIO_FLOTA) {
            if (flota[i].esTuId(idCamion)) {
                costoPorKm = flota[i].getCostoPorKm();
            } else {
                i++;
            }
        }
        return costoPorKm;
    }

    public int[][] obtenerViajesPorChoferCamion() {
        int[][] matriz = new int[TAMANIO_FLOTA][CANT_CHOFERES];
        for (int i = 0; i < this.viajes.size(); i++) {
            Viaje v = this.viajes.get(i);
            matriz[v.getIdCamion()][procesarColumnaChofer(v.getIdChofer())]++;
        }
        return matriz;
    }

    private int procesarColumnaChofer(String id) {
        int i = 0;
        Chofer ch = null;
        while (ch == null && i < CANT_CHOFERES) {
            if (this.choferes[i].esTuId(id)) {
                ch = this.choferes[i];
            } else {
                i++;
            }
        }
        return i;
    }

    // Para pruebas
    public void agregarCamion(Camion c) {
        int i = 0;
        boolean primeraPosicionLibreEncontrada = false;
        while (i < TAMANIO_FLOTA && !primeraPosicionLibreEncontrada) {
            if (this.flota[i] == null) {
                this.flota[i] = c;
                primeraPosicionLibreEncontrada = true;
            } else {
                i++;
            }
        }
    }

    public void agregarChofer(Chofer ch) {
        int i = 0;
        boolean primeraPosicionLibreEncontrada = false;
        while (i < CANT_CHOFERES && !primeraPosicionLibreEncontrada) {
            if (this.choferes[i] == null) {
                this.choferes[i] = ch;
                primeraPosicionLibreEncontrada = true;
            } else {
                i++;
            }
        }
    }

    public void generarViaje(int idCamion, String idChofer, double kms) {
        this.viajes.add(new Viaje(idCamion, idChofer, kms));
    }

}
