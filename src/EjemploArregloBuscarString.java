import java.util.Scanner;

public class EjemploArregloBuscarString {
    public static void main(String[] args) {

        String []a = new String[4];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <a.length; i++) {
            System.out.print("ingresa un numero: ");
            a[i] = scanner.next();
        }

        System.out.println("\r\nIngresa el numero a buscar");
        String palabra = scanner.next();

        int i = 0;

        while ( i < a.length && !a[i].equals(palabra)){
            i++;
        }

        if ( i == a.length){
            System.out.println("No se encontro el numero");
        }else if(a[i].equals(palabra) ){
            System.out.println("la palabra: "+ palabra+ " ,en la posicion "+ i);
        }

    }

}
