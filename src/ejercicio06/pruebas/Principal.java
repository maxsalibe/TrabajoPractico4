package ejercicio06.pruebas;

import ejercicio06.Frigorifico;
import ejercicio06.Pais;
import ejercicio06.Pedido;
import ejercicio06.Producto;

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {

        Frigorifico f = new Frigorifico();

        f.agregarVendedor("A");
        f.agregarVendedor("B");
        f.agregarVendedor("C");
        f.agregarVendedor("D");
        f.agregarVendedor("E");
        f.agregarVendedor("F");
        f.agregarVendedor("G");
        f.agregarVendedor("H");
        f.agregarVendedor("I");
        f.agregarVendedor("J");
        f.agregarVendedor("K");
        f.agregarVendedor("L");
        f.agregarVendedor("M");
        f.agregarVendedor("N");
        f.agregarVendedor("O");
        f.agregarVendedor("P");
        f.agregarVendedor("Q");
        f.agregarVendedor("R");
        f.agregarVendedor("S");
        f.agregarVendedor("T");

        Producto prod1 = new Producto("ab", "unaCosa", 10);
        Producto prod2 = new Producto ("ac", "algo", 20);
        Producto prod3 = new Producto ("ad", "smthg", 30);
        Producto prod4 = new Producto ("ae", "alguito", 40);
        Producto prod5 = new Producto ("af", "otraCosa", 50);

        f.agregarProducto(prod1);
        f.agregarProducto(prod2);
        f.agregarProducto(prod3);
        f.agregarProducto(prod4);
        f.agregarProducto(prod5);

        f.agregarCliente("12", Pais.ARGENTINA);
        f.agregarCliente("13", Pais.CHILE);
        f.agregarCliente("14", Pais.ARGENTINA);
        f.agregarCliente("15", Pais.URUGUAY);
        f.agregarCliente("16", Pais.URUGUAY);
        f.agregarCliente("17", Pais.BRASIL);
        f.agregarCliente("18", Pais.ARGENTINA);
        f.agregarCliente("19", Pais.BRASIL);
        f.agregarCliente("20", Pais.CHILE);
        f.agregarCliente("21", Pais.CHILE);

        ArrayList<Producto> p1 = new ArrayList<>();
        p1.add(prod1);
        p1.add(prod2);
        ArrayList<Producto> p2 = new ArrayList<>();
        p2.add(prod1);
        p2.add(prod3);
        p2.add(prod5);
        ArrayList<Producto> p3 = new ArrayList<>();
        p3.add(prod5);
        ArrayList<Producto> p4 = new ArrayList<>();
        p4.add(prod4);
        p4.add(prod3);
        p4.add(prod3);
        ArrayList<Producto> p5 = new ArrayList<>();
        p5.add(prod1);
        p5.add(prod5);
        p5.add(prod3);

        f.generarPedido(1,"12", p1);
        f.generarPedido(1,"13", p2);
        f.generarPedido(3,"14", p3);
        f.generarPedido(19,"15", p4);
        f.generarPedido(19,"16", p5);

        f.informarCantPedidos();
    }
}
