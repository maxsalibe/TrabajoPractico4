package ejercicio06;

import java.util.ArrayList;

public class Pedido {
    private int idVendedor;
    private String cuitCliente;
    private ArrayList<Producto> productosComprados;

    public Pedido(int idVendedor, String cuitCliente, ArrayList<Producto> productosComprados) {
        this.idVendedor = idVendedor;
        this.cuitCliente = cuitCliente;
        this.productosComprados = productosComprados;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public String getCuitCliente() {
        return cuitCliente;
    }
}
