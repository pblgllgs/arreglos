import java.util.Scanner;

public class EjemploArregloNumeroMayor {
    public static void main(String[] args) {

        int[] a = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa 5 numeros enteros");
        int max = 0;
        for (int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++){
            //max = (a[max]>a[i])?max:i; adicional sumar 1 en el i
            if(a[i]>max){
                max = a[i];
            }
        }

        System.out.println("max = " + max);
    }
}
