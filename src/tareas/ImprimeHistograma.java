package tareas;

public class ImprimeHistograma {
    public static void main(String[] args) {

        int[] a = {4,3,4,6,6,4,1,4,5,4,1,1};

        int uno =0;
        int dos =0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        int seis = 0;

        for (int i = 0; i < a.length; i++){
                if(a[i]==1){
                    uno +=1;
                }else if(a[i]==2){
                    dos +=1;
                }else if(a[i]==3){
                    tres +=1;
                }else if(a[i]==4){
                    cuatro +=1;
                }else if(a[i]==5){
                    cinco +=1;
                }else{
                    seis +=1;
                }
        }

        int []b = {uno,dos,tres,cuatro,cinco,seis};

        for (int i = 0; i < b.length; i++){
            System.out.println((i+1)+": " + asteriscos(b[i]));
        }
    }

    public static String asteriscos(int cantidad){
        String msg = "";
        int i=0;
        while(i<cantidad){
            msg = msg.concat("*");
            i++;
        }
        return msg;
    }
}
