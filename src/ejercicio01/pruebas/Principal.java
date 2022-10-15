package ejercicio01.pruebas;

import ejercicio01.clases.Sistema;

public class Principal {
    public static void main(String[] args) {
        Sistema s = new Sistema();
        s.agregarCajero("Gomez", 13);
        s.agregarCajero("Perez", 1);
        s.agregarCajero("Gonzalez", 10);
        s.agregarCajero("Gutierrez", 8);
        s.agregarCajero("Lopez", 20);

        s.agregarRobot("ABC124", 3);
        s.agregarRobot("ADC123", 4);
        s.agregarRobot("ABR123", 3.5);
        s.agregarRobot("AZZ123", 0.3);
        s.agregarRobot("ABC155", 2.5);
        s.agregarRobot("ABC343", 4.7);
        s.agregarRobot("ZXC123", 8.5);
        s.agregarRobot("AGC123", 10);

        s.tomarPedido("Raul", 1, "ABC124", 500);
        s.tomarPedido("Mario", 1, "ADC123", 1500);
        s.tomarPedido("Juana", 2, "AGC123", 50);
        s.tomarPedido("Isabel", 5, "ZXC123", 300);



        for (int i = 0; i < 5; i++) {
            System.out.println(s.montosPorCajero()[i]);
        }

        s.mostrarInformes();

        s.mostrarPedidosConMasRiesgo(5);



    }
}
