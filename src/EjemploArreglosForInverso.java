import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        //String[] productos = new String[7];
        String[] productos = {"uno","dos","tres","cuatro","cinco","seis","siete"};

        int largo = productos.length;

        /*productos[0] = "uno";
        productos[1] = "dos";
        productos[2] = "tres";
        productos[3] = "cuatro";
        productos[4] = "cinco";
        productos[5] = "seis";
        productos[6] = "siete";*/

        Arrays.sort(productos);
        for(int i = 0; i < largo; i++) {
            System.out.println("productos = " + productos[i]);
        }
        System.out.println("----------INVERSO----------");
        for(int i = largo-1; i> -1 ; i--){
            System.out.println("productos = " + productos[i]);
        }
        System.out.println("----------INVERSO 2----------");
        for(int i = 0; i < largo; i++) {
            System.out.println("productos = " + productos[largo-1-i]);
        }



    }
}
