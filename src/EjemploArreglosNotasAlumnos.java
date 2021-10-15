import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas ,claseHistoria ,claseLenguaje;

        double sumNotasMat = 0.0,sumNotasHist = 0.0, sumNotasLeng = 0.0;

        claseMatematicas = new double[3];
        claseHistoria = new double[3];
        claseLenguaje = new double[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa las notas de matematicas");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = scanner.nextInt();
        }

        System.out.println("ingresa las notas de Historia");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = scanner.nextInt();
        }

        System.out.println("ingresa las notas de Lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++){
            sumNotasMat += claseMatematicas[i];
            sumNotasHist += claseHistoria[i];
            sumNotasLeng += claseLenguaje[i];
        }

        double promedioMatematicas = sumNotasMat/3;
        double promedioHistoria = sumNotasHist/3;
        double promedioLenguaje = sumNotasLeng/3;

        System.out.println("promedio Matematicas = " + Math.round(promedioMatematicas));
        System.out.println("promedio Historia = " + Math.round(promedioHistoria));
        System.out.println("promedio Lenguaje = " + Math.round(promedioLenguaje));

        double promedioTotal = (promedioMatematicas + promedioHistoria + promedioLenguaje)/3;

        System.out.println("Promedio Total del Curso:" + Math.round(promedioTotal));

        System.out.println("ingrese el identificador del alumno, (entre 0 y 6)");

        int id = scanner.nextInt();

        double promedioAlumno = (claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id])/3;

        System.out.println("Promedio del alumno con id: "+ id+ " es "+ Math.round(promedioAlumno));

    }
}
