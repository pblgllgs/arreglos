import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {


    public static void corre(int [] a){
        int aux = a[a.length-1];
        for (int i = 0; i <a.length-1; i++){
            a[a.length-i-1] = a[a.length-i-2];
            if(i==8){
                a[0]=aux;
            }
        }

    }

    public static void main(String[] args) {
        int []a = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 10 numeros");
        for (int i = 0; i <a.length; i++){
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i <a.length;i++){
            System.out.print("[ " + a[i] +" ]");
        }

        corre(a);

        System.out.println("\n");

        for (int i = 0; i <a.length;i++){
            System.out.print("[ " + a[i] +" ]");
        }


    }
}
