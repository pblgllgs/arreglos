import java.util.Scanner;

public class EjemploEliminarUnElemento {
    public static void main(String[] args) {

        int []a = {1,2,3,4,5,6,7,8,9,10};

        Scanner scanner = new Scanner(System.in);

        System.out.print("valores:    ");
        for (int i = 0; i < a.length; i++){
            System.out.print("[" + a[i]+"]");
        }
        System.out.println();
        System.out.print("posiciones: ");
        for(int i = 0; i < a.length; i++){
            System.out.print("[" +i+"]");
        }
        System.out.println();

        System.out.println("ingresa la posicion del elemento que quieres borrar");
        int posicion = scanner.nextInt();

        for(int i = posicion;i<a.length-1;i++){
            a[i] = a[i+1];
            if(i==a.length-2){
                a[a.length-1]=0;
            }
        }

        for (int j : a) {
            System.out.print("[" + j + "]");
        }
        System.out.println();

        int []b = new int[a.length-1];

        System.arraycopy(a,0,b,0,b.length);

        for(int i = 0; i < b.length; i++){
            System.out.print("["+ b[i]+"]");
        }

    }
}
