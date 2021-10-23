package tareas;

import java.util.Scanner;

public class MasAlto {
    public static void main(String[] args) {
         int []a = new int[7];
         int mayor = a[0];
         int aux = 0;
         int contador = 0;

         Scanner scanner = new Scanner(System.in);
         for (int i = 0; i < a.length; i++){
                System.out.println("ingresa el numero: " +(contador+1));
                aux = scanner.nextInt();
                if(aux >=11 && aux <=99){
                    a[i] = aux;
                    contador++;
                }else{
                    System.out.println("ingresa un numero entre 11 y 99");
                    i--;
                }
         }

         for (int i = 1; i < a.length; i++){
            if(a[i]>mayor){
                mayor = a[i];
            }
         }

        System.out.println("mayor = " + mayor);
    }
}