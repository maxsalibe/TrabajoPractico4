package ejercicio07.pruebas;

import ejercicio07.Alumno;
import ejercicio07.Comision;

// Testeado con exito en 2022-10-22. Funciona, pero se puede
// optimizar la logica de algunos metodos: principalmente,
// el de dejaronLaCursada()

public class Principal {
    public static void main(String[] args) {

        Comision c = new Comision(4, 4);

        c.agregarAlumno(new Alumno("Lopez"));
        c.agregarAlumno(new Alumno("Gomez"));
        c.agregarAlumno(new Alumno("Gonzalez"));
        c.agregarAlumno(new Alumno("Perez"));

        c.cargarAsistenciaDelAlumno(0, 0, 'A');
        c.cargarAsistenciaDelAlumno(1, 0, 'A');
        c.cargarAsistenciaDelAlumno(2, 0, 'A');
        c.cargarAsistenciaDelAlumno(3, 0, 'A');

        c.cargarAsistenciaDelAlumno(0, 1, 'A');
        c.cargarAsistenciaDelAlumno(1, 1, 'A');
        c.cargarAsistenciaDelAlumno(2, 1, 'A');
        c.cargarAsistenciaDelAlumno(3, 1, 'A');

        c.cargarAsistenciaDelAlumno(0, 2, 'A');
        c.cargarAsistenciaDelAlumno(1, 2, 'A');
        c.cargarAsistenciaDelAlumno(2, 2, 'A');
        c.cargarAsistenciaDelAlumno(3, 2, 'A');

        c.cargarAsistenciaDelAlumno(0, 3, 'A');
        c.cargarAsistenciaDelAlumno(1, 3, 'A');
        c.cargarAsistenciaDelAlumno(2, 3, 'P');
        c.cargarAsistenciaDelAlumno(3, 3, 'A');

        c.aptosParaRendir();
        System.out.println("Recuento de llegadas tarde: " + c.llegadasTarde());
        System.out.println("Clases con asistencia perfecta: " + c.clasesConAsistenciaPerfecta());
        System.out.println("El presentismo por clase es: ");
        for (double d :
                c.presentismoPorClase()) {
            System.out.printf("%.2f\t", d);
        }
        System.out.println();
        c.dejaronLaCursada();
    }
}
