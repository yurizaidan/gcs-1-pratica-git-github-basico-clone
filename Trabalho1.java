import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class main {

    //Método A
    public static int nOcorrencias (ArrayList<Integer> list, int target){
        int count = 0;
        for (int e:numeros){
            if (target=e){
            count++;
            }
        }
        return count;
    }

    //Método D
    public static List<Integer> listRepeat (List<Integer> list){
        Set<Integer> elements = new HashSet<Integer>();
        return list.stream().filter(n -> !elements.add(n)).collect(Collectors.toList());

    }
    // Método B
    static boolean elementosRepetidos(ArrayList<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i).equals(l.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }
    // Método E
    public static ArrayList<Integer> uniao(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> resultado = new ArrayList<>();

        for (Integer elemento : l1) {
            if (!resultado.contains(elemento)) {
                resultado.add(elemento);
            }
        }

        for (Integer elemento : l2) {
            if (!resultado.contains(elemento)) {
                resultado.add(elemento);
            }
        }

        return resultado;
    } 
    //Método C
    public static int nroRepeat(ArrayList<Integer> l) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer num : l) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (Integer frequency : frequencyMap.values()) {
            if (frequency > 1) {
                count++;
            }
        }

        return count;
    }
    //Método F
    public static ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        HashSet<Integer> set1 = new HashSet<>(l1);
        HashSet<Integer> set2 = new HashSet<>(l2);

        set1.retainAll(set2);

        return new ArrayList<>(set1);
    }
}
