import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main (String[]args){
        ArrayList<Integer> elementos = new ArrayList<Integer>();
        elementos.add(2);
        elementos.add(3);
        elementos.add(5);
        elementos.add(7);
        elementos.add(11);
        elementos.add(13);
        elementos.add(17);

        ArrayList<Integer> elementos2 = new ArrayList<Integer>();
        elementos2.add(0);
        elementos2.add(1);
        elementos2.add(1);
        elementos2.add(2);
        elementos2.add(3);
        elementos2.add(5);
        elementos2.add(6);
        elementos2.add(0);
        elementos2.add(0);
        elementos2.add(5);

        int testandoOcorrencias = nOcorrencias(elementos, 7);
        System.out.println(testandoOcorrencias);
        ArrayList<Integer> metodoRepeat = listRepeat(elementos2);
        System.out.println(metodoRepeat);

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
    public static ArrayList<Integer> listRepeat (ArrayList<Integer> l) {
        ArrayList<Integer> repeater = new ArrayList<Integer>();
        for (int i=0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (i==j) break;
                if (l.get(i).equals(l.get(j))) {
                    repeater.add(l.get(i));
                    break;
                }
            }
        }
        return repeater;
    }
    //Método e Luis
    //Método f Yan
}
