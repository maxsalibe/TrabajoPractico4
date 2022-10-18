package ejercicio05;

public class Viaje {
    private int idCamion;
    private String idChofer;
    private double kms;

    public Viaje(int idCamion, String idChofer, double kms) {
        this.idCamion = idCamion;
        this.idChofer = idChofer;
        this.kms = kms;
    }

    public String getIdChofer() {
        return this.idChofer;
    }

    public int getIdCamion() {
        return idCamion;
    }

    public double getKms() {
        return this.kms;
    }
}
