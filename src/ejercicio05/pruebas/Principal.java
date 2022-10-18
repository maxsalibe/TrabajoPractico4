package ejercicio05.pruebas;

import ejercicio05.Camion;
import ejercicio05.Chofer;
import ejercicio05.EmpresaCamiones;

public class Principal {
    public static void main(String[] args) {
        // Genero la empresa
        EmpresaCamiones e = new EmpresaCamiones();

        // Agrego camiones
        e.agregarCamion(new Camion(350));
        e.agregarCamion(new Camion(250));
        e.agregarCamion(new Camion(300));
        e.agregarCamion(new Camion(350));
        e.agregarCamion(new Camion(400));
        e.agregarCamion(new Camion(10));
        e.agregarCamion(new Camion(30));
        e.agregarCamion(new Camion(50));
        e.agregarCamion(new Camion(1350));
        e.agregarCamion(new Camion(2050));

        // Agrego choferes
        e.agregarChofer(new Chofer("abc123", 5000));
        e.agregarChofer(new Chofer("abc124", 4000));
        e.agregarChofer(new Chofer("abc125", 5600));
        e.agregarChofer(new Chofer("abc126", 7800));
        e.agregarChofer(new Chofer("abc127", 1200));
        e.agregarChofer(new Chofer("abc128", 4600));
        e.agregarChofer(new Chofer("abc129", 5900));
        e.agregarChofer(new Chofer("abc130", 3900));
        e.agregarChofer(new Chofer("abc131", 1100));
        e.agregarChofer(new Chofer("abc132", 1200));
        e.agregarChofer(new Chofer("abc133", 4300));
        e.agregarChofer(new Chofer("abc134", 5400));
        e.agregarChofer(new Chofer("abc135", 6300));
        e.agregarChofer(new Chofer("abc136", 6500));
        e.agregarChofer(new Chofer("abc137", 2300));
        e.agregarChofer(new Chofer("abc138", 5600));
        e.agregarChofer(new Chofer("abc139", 7600));
        e.agregarChofer(new Chofer("abc140", 8700));
        e.agregarChofer(new Chofer("abc141", 9000));
        e.agregarChofer(new Chofer("abc142", 500));

        // Genero los viajes
        e.generarViaje(0, "abc142", 3600);
        e.generarViaje(0, "abc142", 4000);
        e.generarViaje(3, "abc139", 300);
        e.generarViaje(2, "abc142", 600);
        e.generarViaje(9, "abc136", 700);
        e.generarViaje(9, "abc136", 1100);
        e.generarViaje(8, "abc127", 3500);
        e.generarViaje(8, "abc123", 3800);
        e.generarViaje(7, "abc124", 3000);



        // Llamo a los metodos principales
        System.out.println(e.obtenerCostosDeViajes());
    }
}
