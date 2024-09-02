import java.util.ArrayList;
import java.util.HashSet;
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

        // Questão a
        int testandoOcorrencias = nOcorrencias(elementos, 7);
        System.out.println(testandoOcorrencias);
        // Questão b
        boolean repete = hasRepeat(elementos);
        System.out.println(repete);
        // Questão d
        ArrayList<Integer> metodoRepeat = listRepeat(elementos2);
        System.out.println(metodoRepeat);
        // Questão e
        ArrayList<Integer> uniao = union(elementos, elementos2);
        System.out.println(uniao);
        // Questão f
        ArrayList<Integer> intersecsao = intersect(elementos, elementos2);
        System.out.println(intersecsao);
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
    public static boolean hasRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> checked = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            int count = 0;
            if (!checked.contains(l.get(i))) {
                for (int j = 0; j < l.size(); j++) {
                    if (l.get(i).equals(l.get(j))) {
                        count++;
                    }
                }
                if (count > 1) {
                    return true;
                }
                checked.add(l.get(i));
            }
        }
        return false;
    }

    //Método c Lucas

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
    public static ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < l1.size(); i++) {
            result.add(l1.get(i));
        }
        for (int i = 0; i < l2.size(); i++) {
            boolean found = false;
            for (int j = 0; j < result.size(); j++) {
                if (l2.get(i).equals(result.get(j))) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(l2.get(i));
            }
        }
        return result;
    }
    
    //Método f Luis
    public static ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < l1.size(); i++) {
             if (l2.contains(l1.get(i)) && !result.contains(l1.get(i))) {
                result.add(l1.get(i));
             }
        }
        return result;
    }
}
