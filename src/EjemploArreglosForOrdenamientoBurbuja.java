import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {
    public static void main(String[] args) {

        String[] productos = {"uno","dos","tres","cuatro"};


        int total = productos.length;

        ordenamientoBurbujaGenerico(productos);

        for(int i = 0; i < total; i++) {
            System.out.println("productos = " + productos[i]);
        }

        System.out.println("ordenando arreglo de numeros");

        Integer [] numeros =  new Integer[7];

        numeros[0] = 5;
        numeros[1] = 7;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 6;
        numeros[5] = 2;
        numeros[6] = 1;

        ordenamientoBurbujaGenerico(numeros);

        for(int i = 0; i < numeros.length;i++){
            System.out.println("numeros[i] = " + numeros[i]);
        }

    }

    public static void ordenamientoBurbujaPlusString(String [] arr){
        for(int i =0 ;i<arr.length - 1; i++){
            for(int j  =0; j<arr.length -1 -i; j++){
                if(arr[j+1].compareTo(arr[j])<0){
                    String aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }

    public static void ordenamientoBurbujaString(String [] arr){
        for(int i =0 ;i<arr.length; i++){
            for(int j  =0; j<arr.length; j++){
                if(arr[i].compareTo(arr[j])<0){
                    String aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }



    public static void ordenarArrInt(int []arr){
        for(int i =0 ;i<arr.length - 1; i++){
            for(int j  =0; j<arr.length -1 -i; j++){
                if(((Comparable<Integer>)arr[j+1]).compareTo(arr[j])<0){
                    int aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }

    public static void inverso(String [] arr){
        for(int i = 0; i < arr.length/2; i++){
            String actual = arr[i];
            String inverso = arr[arr.length-1-i];
            arr[i] = inverso;
            arr[arr.length-1-i] = actual;
        }
    }

    public static void ordenamientoBurbujaGenerico(Object [] obj){
        for(int i =0 ;i<obj.length - 1; i++){
            for(int j  =0; j<obj.length -1 -i; j++){
                if(((Comparable<Object>)obj[j+1]).compareTo(obj[j])<0){
                    //de menor a mayor, sino cambiar por ">"
                    Object aux = obj[j];
                    obj[j] = obj[j+1];
                    obj[j+1] = aux;
                }
            }
        }
    }
}
