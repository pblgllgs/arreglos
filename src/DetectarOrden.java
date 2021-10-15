import java.util.Scanner;

public class DetectarOrden {
    public static void main(String[] args) {

        int []a = new int[7];
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese 7 numeros");
        for(int i = 0; i <a.length; i++) {
            a[i] = scanner.nextInt();
        }

        boolean asc = false;
        boolean desc = false;

        for(int i = 0; i < a.length -1; i++) {
            if(a[i]>a[i+1]){
                desc = true;
            }
            if(a[i]<a[i+1]){
                asc = true;
            }
        }
        if(asc == true && desc == true){
            System.out.println("arreglo desordenado");
        }
        if(asc == false && desc == false){
            System.out.println("todos son iguales");
        }
        if(asc == true && desc == false){
            System.out.println("arreglo ascendentes");
        }
        if(asc == false && desc == true){
            System.out.println("arreglo descendente");
        }


    }
}

