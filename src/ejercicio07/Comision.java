package ejercicio07;

public class Comision {
    private static final double PRESENTISMO_MINIMO_PARA_RENDIR = 0.75;
    private static final int AUSENCIAS_CONSECUTIVAS_ABANDONO = 2; // Modifique el numero para testear facilmente.
    private String codigo;
    private int cantidadAlumnos;
    private char[][] asistencia;
    private Alumno[] alumnos;

    public Comision(int cantidadAlumnos, int cantidadClases) {
        this.cantidadAlumnos = cantidadAlumnos;
        this.asistencia = new char[cantidadAlumnos][cantidadClases];
        this.alumnos = new Alumno[cantidadAlumnos];
    }

    public void aptosParaRendir() {
        System.out.println("Alumnos aptos para rendir:");
        for (int i = 0; i < this.asistencia.length; i++) {
            double suAsistencia = obtenerPresentismoDelAlumnoNro(i);
            if (suAsistencia >= Comision.PRESENTISMO_MINIMO_PARA_RENDIR) {
                System.out.format("%30s %5.1f %%%n", this.alumnos[i],suAsistencia*100);
            }
        }
    }

    public int llegadasTarde() {
        int tardes = 0;
        for (int i = 0; i < this.asistencia.length; i++) {
            for (int j = 0; j < this.asistencia[i].length; j++) {
                if (this.asistencia[i][j] == 'T') {
                    tardes++;
                }
            }
        }
        return tardes;
    }

    public int clasesConAsistenciaPerfecta() {
        int cont = 0;
        for (int j = 0; j < this.asistencia[0].length; j++) {
            boolean esPerfecta = true;
            int i = 0;
            while (esPerfecta && i < this.asistencia.length) {
                if (this.asistencia[i][j] == 'A') {
                    esPerfecta = false;
                } else {
                    i++;
                }
            }
            if (esPerfecta) {
                cont++;
            }
        }
        return cont;
    }

    public double[] presentismoPorClase() {
        double[] presentismo = new double[this.asistencia[0].length];
        for (int j = 0; j < this.asistencia[0].length; j++) {
            double presDelDia = 0;
            for (int i = 0; i < this.asistencia.length; i++) {
                switch (this.asistencia[i][j]) {
                    case 'P':
                        presDelDia++;
                        break;
                    case 'T':
                        presDelDia += 0.5;
                        break;
                }
            }
            presentismo[j] = presDelDia / this.asistencia.length;
        }
        return presentismo;
    }

    public void dejaronLaCursada() {
        System.out.println("Dejaron la cursada:");
        for (int i = 0; i < this.asistencia.length; i++) {
            int idxUltimaInasistencia = -2;
            int inasistenciasConsecutivas = 1;
            boolean dejo = false;
            int j = 0;
            while (!dejo && j < this.asistencia[i].length) {
                boolean seAusento = this.asistencia[i][j] == 'A';
                boolean sonConsecutivas = seAusento && j - idxUltimaInasistencia == 1;
                boolean superoLimiteDeConsecutivas = inasistenciasConsecutivas == Comision.AUSENCIAS_CONSECUTIVAS_ABANDONO;
                if (seAusento && sonConsecutivas && superoLimiteDeConsecutivas) {
                    dejo = true;
                } else if (seAusento && sonConsecutivas) {
                    idxUltimaInasistencia = j;
                    inasistenciasConsecutivas++;
                    j++;
                } else if (seAusento) {
                    idxUltimaInasistencia = j;
                    inasistenciasConsecutivas = 1;
                    j++;
                } else {
                    j++;
                }
            }
            if (dejo) {
                System.out.println(this.alumnos[i]);
            }
        }
    }

    private double obtenerPresentismoDelAlumnoNro(int n) {
        double totalClases = this.asistencia[0].length;
        double tardesYAusentes = 0;
        for (int i = 0; i < totalClases; i++) {
            if (asistencia[n][i] == 'T') {
                tardesYAusentes += 0.5;
            } else if (asistencia[n][i] == 'A') {
                tardesYAusentes += 1;
            }
        }
        return totalClases != 0 ? (1 - tardesYAusentes / totalClases) : -1;
    }

    // Para testear
    public void agregarAlumno(Alumno a) {
        int i = 0;
        while (this.alumnos[i] != null && i < this.alumnos.length) {
            i++;
        }
        if (i < this.alumnos.length) {
            this.alumnos[i] = a;
        }
    }

    public void cargarAsistenciaDelAlumno(int nroAlumno, int nroClase, char asistencia) {
        this.asistencia[nroAlumno][nroClase] = asistencia;
    }
}
