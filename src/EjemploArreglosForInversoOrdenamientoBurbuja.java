import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoOrdenamientoBurbuja {
    public static void main(String[] args) {

        String[] productos = {"uno","dos","tres","cuatro"};

        int total = productos.length;
        int contador = 0;
        for(int i =0 ;i<total - 1; i++){
            for(int j  =0; j<total -1 -i; j++){
                if(productos[j+1].compareTo(productos[j])<0){
                    String aux = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = aux;
                }
                contador ++;
            }
        }

        System.out.println("contador = " + contador);

        for(int i = 0; i < total; i++) {
            System.out.println("productos = " + productos[i]);
        }

        Arrays.sort(productos);

        for(int i = 0; i < total; i++) {
            System.out.println("productos = " + productos[i]);
        }

        inverso(productos);

        for(int i = 0; i < total; i++) {
            System.out.println("productos = " + productos[i]);
        }

        Collections.reverse(Arrays.asList(productos));

        for(int i = 0; i < total; i++) {
            System.out.println("productos = " + productos[i]);
        }


    }

    public static void inverso(String [] productos){
        int largo = productos.length;
        for(int i = 0; i < largo/2; i++){
            String actual = productos[i];
            String inverso = productos[largo-1-i];
            productos[i] = inverso;
            productos[largo-1-i] = actual;
        }
    }
}
