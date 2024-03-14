/*Hashset 3
Create la struttura, La popolate e poi implementate una ricerca nel set a partire da un valore
di input, Se lo trovate, allora lo togliete dal set. Fate in modo di trovare tutti i valori con cui
avete popolato il set in modo che rimanga vuoto, A quel punto stampate il set per vedere
che sia effettivamente vuoto*/
package java_advanced;

import java.util.HashSet;

public class Hashset_es3 {
    public static void main(String[] args) {
        System.out.println(operationOnHashset());
    }

    public static HashSet<String> operationOnHashset(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("tre");
        hashSet.add("quattro");
        hashSet.add("cinque");
        String elementoDaTrovare = "tre";
        String elementoDaTrovare2 = "quattro";
        String elementoDaTrovare3 = "cinque";

        if (hashSet.contains (elementoDaTrovare) || hashSet.contains(elementoDaTrovare2)
                || hashSet.contains(elementoDaTrovare3)) {
            hashSet.remove(elementoDaTrovare);
            hashSet.remove(elementoDaTrovare2);
            hashSet.remove(elementoDaTrovare3);
        }
        return hashSet;
    }
}
