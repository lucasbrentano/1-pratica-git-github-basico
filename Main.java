import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main (String[]args){
        ArrayList<Integer> elementos = new ArrayList<Integer>(7);
        elementos.add(2);
        elementos.add(3);
        elementos.add(5);
        elementos.add(7);
        elementos.add(11);
        elementos.add(13);
        elementos.add(17);

        int testandoOcorrencias = nOcorrencias(elementos, 7);
        System.out.println(testandoOcorrencias);
    }

    //Método a Lucas
    public static int nOcorrencias (ArrayList<Integer> l, int el) {
        int ocorrencias = 0;
        for (int i=0; i < l.size(); i++) {
            if (l.get(i) == el) {
                ocorrencias++;
            }
        }
        return ocorrencias;
    }

    //Método b Luis
    //Método c Yan
    //Método d Lucas
    //Método e Luis
    //Método f Yan
}
