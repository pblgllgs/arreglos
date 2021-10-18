import java.util.Scanner;

public class EjemploArregloBuscarNumero {
    public static void main(String[] args) {

        int []a = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <a.length; i++) {
            System.out.print("ingresa un numero");
            a[i] = scanner.nextInt();
        }

        System.out.println("\r\nIngresa el numero a buscar");
        int numBuscar = scanner.nextInt();

        int i = 0;

        while ( i < a.length && a[i] != numBuscar){
            i++;
        }

        if ( i == a.length){
            System.out.println("No se encontro el numero");
        }else if(a[i] ==numBuscar  ){
            System.out.println("EL numero: "+ numBuscar+ "en la posicion "+ i);
        }

    }

}
