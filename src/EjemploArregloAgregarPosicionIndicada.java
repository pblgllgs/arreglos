import java.util.Scanner;

public class EjemploArregloAgregarPosicionIndicada {
    public static void main(String[] args) {

        int []a = new int[10];

        int []b =  new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa los numeros");
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
            b[i] = a[i];
        }

        System.out.println("que numero deseas ingresar al arreglo");
        int numero = scanner.nextInt();
        System.out.println("selecciona la posicion donde quiere agregar el numero, entre 1 y 10");
        int posicion = scanner.nextInt();
        for (int i = 0; i < a.length - posicion-2; i++){
            a[a.length-i-1] = a[a.length-i-2];
        }

        a[posicion-1] = numero;

        for(int i= 0;i<a.length; i++){
            System.out.print("[ "+a[i]+" ]");
        }

    }
}
