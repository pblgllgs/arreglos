package tareas;

import java.util.Scanner;

public class UltimoPrimero {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            System.out.println("ingresa el numero: "+ (i+1));
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++){
            System.out.print("["+a[i]+"]");
        }
        System.out.println();
        int f=0;
        int l=0;
        for(int i = 0; i<a.length/2; i++){
            f= a[i];
            l=a[a.length-1-i];
            a[i]=l;
            a[a.length-1-i]=f;
        }

        for (int i = 0; i < a.length; i++){
            System.out.print("["+a[i]+"]");
        }

    }
}
