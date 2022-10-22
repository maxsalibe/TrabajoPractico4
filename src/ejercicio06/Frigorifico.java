package ejercicio06;

import java.util.ArrayList;

public class Frigorifico {
    private static final int CANTIDAD_VENDEDORES = 20;
    private static int proximoIdVendedor = 0;
    private Vendedor[] vendedores;
    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Pedido> pedidos;

    public Frigorifico() {
        this.vendedores = new Vendedor[CANTIDAD_VENDEDORES];
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.pedidos = new ArrayList<>();

    }

    public void informarCantPedidos() {
        int[][] matriz = new int[CANTIDAD_VENDEDORES][Pais.values().length];
        for (Pedido p :
                this.pedidos) {
            int idVendedor = p.getIdVendedor();
            int numeroPais = obtenerNumeroDelPaisDelPedido(p.getCuitCliente());
            matriz[idVendedor][numeroPais]++;
        }
        System.out.println("A continuacion, se informa el numero de pedidos por vendedor y por pais:");
        System.out.print("Vendedor #");
        for (int i = 0; i < Pais.values().length; i++) {
            System.out.print("\t\t\t" + Pais.values()[i]);
        }
        System.out.println();
        for (int i = 0; i < CANTIDAD_VENDEDORES; i++) {
            System.out.print(i);
            for (int j = 0; j < Pais.values().length; j++) {
                System.out.print("\t\t\t\t\t" + matriz[i][j]);
            }
            System.out.println();
        }
    }

    private int obtenerNumeroDelPaisDelPedido(String cuit) {
        return buscarCliente(cuit).getNumeroPais();
    }

    private Cliente buscarCliente(String cuit) {
        Cliente c = null;
        int i = 0;
        while (i < this.clientes.size() && c == null) {
            if (this.clientes.get(i).esTuCuit(cuit)) {
                c = this.clientes.get(i);
            } else {
                i++;
            }
        }
        return c;
    }

    // Para test
    public void agregarVendedor(String nombre) {
        int i = 0;
        while (i < this.vendedores.length && this.vendedores[i] != null) {
            i++;
        }
        if (i < this.vendedores.length) {
            this.vendedores[i] = new Vendedor(proximoIdVendedor++, nombre);
        }
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    public void agregarCliente(String cuit, Pais pais) {
        this.clientes.add(new Cliente(cuit, pais));
    }

    public void generarPedido(int idVendedor, String cuitCliente, ArrayList<Producto> productosComprados) {
        this.pedidos.add(new Pedido(idVendedor, cuitCliente, productosComprados));
    }

    public int[] clientesPorPais() {
        int [] clientesAInformar = new int[Pais.values().length];
        for (Cliente c :
                this.clientes) {
            clientesAInformar[c.getNumeroPais()]++;
        }
        return clientesAInformar;
    }

    public String paisMasRentable() {
        int[] totalRecaudadoPorPais = new int[Pais.values().length];
        for (Pedido p :
                this.pedidos) {
            totalRecaudadoPorPais[(obtenerNumeroDelPaisDelPedido(p.getCuitCliente()))] += p.getPrecio();
        }
        Pais pais = null;
        double maximoRecaudadoPorElPais = 0;
        for (int i = 0; i < totalRecaudadoPorPais.length; i++) {
            if (totalRecaudadoPorPais[i] > maximoRecaudadoPorElPais) {
                pais = Pais.values()[i];
                maximoRecaudadoPorElPais = totalRecaudadoPorPais[i];
            }
        }
        return pais.toString();
    }
}
