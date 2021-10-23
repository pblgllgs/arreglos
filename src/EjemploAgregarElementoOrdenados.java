import java.util.Scanner;

public class EjemploAgregarElementoOrdenados {
    public static void main(String[] args) {

        int []a = new int[7];

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa un numero");
        for (int i = 0; i <a.length; i++){
            if (i<6){
                a[i]= scanner.nextInt();
            }else{
                a[i] = 0;
            }
        }
        System.out.println("arreglo de numeros");
        for (int i = 0; i < a.length; i++){
            System.out.println("a[i] = " + a[i]);
        }

        System.out.println("ingresa el numero que deseas agregar");
        int numero = scanner.nextInt();

        for (int i = a.length-1; i > 0; i--){
            if(a[i-1] < numero){
                a[i]=numero;
                break;
            }else{
                a[i]= a[i-1];
            }
        }
        for (int i = 0;i< a.length; i++){
            System.out.println("i = " + a[i]);
        }
    }
}
