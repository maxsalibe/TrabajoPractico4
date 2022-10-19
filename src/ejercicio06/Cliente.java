package ejercicio06;

public class Cliente {
    private String razonSocial;
    private String cuit;
    private String telefono;
    private Pais pais;

    public Cliente(String cuit, Pais pais) {
        this.cuit = cuit;
        this.pais = pais;
    }

    public boolean esTuCuit(String cuit) {
        return this.cuit.equals(cuit);
    }

    public int getNumeroPais() {
        return this.pais.ordinal();
    }

}
