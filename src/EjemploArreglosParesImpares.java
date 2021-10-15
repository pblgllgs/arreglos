import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        int [] pares , impares, a;

        a = new int[10];
        System.out.println("Ingresa 10 numeros enteros");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <a.length; i++) {
            a[i]= scanner.nextInt();
        }

        int totalPares = 0;
        int totalImpares = 0;

        for(int i = 0; i <a.length; i++){
            if(a[i]% 2== 0){
                totalPares++;
            }else{
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        int auxPar= 0;
        int auxImpar = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i]% 2== 0){
                pares[auxPar++] = a[i];
            }else{
                impares[auxImpar++] = a[i];
            }
        }

        System.out.println("PARES");
        for(int i = 0; i <pares.length; i++){
            System.out.println("pares = " + pares[i]);
        }
        System.out.println("IMPARES");
        for (int i = 0; i <impares.length; i++) {
            System.out.println("impares = " + impares[i]);
        }
    }
}
