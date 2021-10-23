import java.util.Scanner;

public class EjemploAgregarUnElementoArrExtenderArr {
    public static void main(String[] args) {

        int []a = {1,2,3,4,5,6,7,8,9,10};

        Scanner scanner = new Scanner(System.in);

        System.out.print("valores:    ");
        for (int i = 0; i < a.length; i++){
            System.out.print("[" + a[i]+"]");
        }
        System.out.println();

        System.out.println("ingresa el numero");
        int numero = scanner.nextInt();

        System.out.println("ingresa la posicion");
        int posicion = scanner.nextInt();

        int []b = new int[a.length +1];

        int aux= 0;
        for (int i = 0; i <b.length;i++){
            if(i == posicion){
                b[i]=numero;
                aux =1;
            }else{
                b[i]=a[i-aux];
            }
        }

        for(int i = 0; i < b.length; i++){
            System.out.print("["+ b[i]+"]");
        }
    }
}
