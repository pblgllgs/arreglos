import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int largo = productos.length;
        productos[0] = "uno";
        productos[1] = "dos";
        productos[2] = "tres";
        productos[3] = "cuatro";
        productos[4] = "cinco";
        productos[5] = "seis";
        productos[6] = "siete";

        Arrays.sort(productos);

        for (String producto: productos) {
            System.out.println("producto = " + producto);
        }

        for(int i = 0; i < largo; i++) {
            System.out.println("productos = " + productos[i]);
        }

        int j =0;
        while( j < largo ) {
            System.out.println("productos = " + productos[j]);
            j++;
        }

        int x =0;
        do {
            System.out.println("productos = " + productos[x]);
            x++;
        }while( x < largo );

        int [] numeros = new int[4];
        int num = numeros.length ;

        for (int k = 0; k < num;k++){
            numeros[k] = k;
            System.out.println("numeros = " + numeros[k]);
        }

    }
}
