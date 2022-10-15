package ejercicio03;

public class Jugador {
    private Posicion posicion;
    private String apellido;
    private int camiseta;

    public Jugador(Posicion posicion, String apellido, int camiseta) {
        this.posicion = posicion;
        this.apellido = apellido;
        this.camiseta = camiseta;
    }

    public boolean esTuCamiseta(int cam) {
        return this.camiseta == cam;
    }

    public boolean esTuApellido(String ape) {
        return this.apellido.equals(ape);
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public int getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(int camiseta) {
        this.camiseta = camiseta;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "posicion=" + posicion +
                ", apellido='" + apellido + '\'' +
                ", camiseta=" + camiseta +
                '}';
    }
}
