package tareas;

public class MayorOcurrencia {
    public static void main(String[] args) {

        int []a = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};

        int mayor= 0;
        int aux = 0;
        int valor=0;

        for(int i = 0; i < a.length; i++){
            aux=0;
            for(int j = 0; j < a.length;j++){
                if(a[i]== a[j]){
                    aux++;
                }
            }
            if(mayor<aux){
                mayor=aux;
                valor = a[i];
            }
        }
        System.out.println("la mayor ocurrencia es: " + mayor);
        System.out.println("El elemento que mas se repite es: "+ valor);

    }
}
