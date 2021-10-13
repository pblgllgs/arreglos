import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "uno";
        productos[1] = "dos";
        productos[2] = "tres";
        productos[3] = "cuatro";
        productos[4] = "cinco";
        productos[5] = "seis";
        productos[6] = "siete";

        Arrays.sort(productos);

        for (String producto: productos) {
            System.out.println("producto = " + producto.toString());
        }

        int [] numeros = new int[4];

        for (int i = 0; i < numeros.length;i++){
            numeros[i] = i;
            System.out.println("numeros = " + numeros[i]);
        }

    }
}
