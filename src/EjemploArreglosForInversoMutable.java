import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {

        String[] productos = {"uno","dos","tres","cuatro","cinco","seis","siete"};

        int largo = productos.length;

        Arrays.sort(productos);

        for(int i = 0; i < largo; i++) {
            System.out.println("productos = " + productos[i]);
        }

        inverso(productos);

        for(int i = 0; i < largo; i++) {
            System.out.println("productos = " + productos[i]);
        }

        Collections.reverse(Arrays.asList(productos));

        for(int i = 0; i < largo; i++) {
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
