import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {

    public static void main(String[] args) {
        int []a = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Imgresa 10 numeros");
        for (int i = 0; i <a.length; i++){
            System.out.print("ingresa un numero");
            a[i] = scanner.nextInt();
        }

        int ultimo = a[a.length-1];

        for (int i = a.length-2; i >=0;i--){
            a[i+1]= a[i];
        }

        a[0]= ultimo;

        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
