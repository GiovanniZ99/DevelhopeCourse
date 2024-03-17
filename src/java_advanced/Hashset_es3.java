/*Hashset 3
Create la struttura, La popolate e poi implementate una ricerca nel set a partire da un valore
di input, Se lo trovate, allora lo togliete dal set. Fate in modo di trovare tutti i valori con cui
avete popolato il set in modo che rimanga vuoto, A quel punto stampate il set per vedere
che sia effettivamente vuoto*/
package java_advanced;

import java.util.HashSet;

public class Hashset_es3 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        fillHashset(hashSet, "tre");
        fillHashset(hashSet, "quattro" );
        removeElementOfHashset(hashSet, "tre");
        removeElementOfHashset(hashSet, "quattro");

    }
    public static void fillHashset(HashSet<String> genericHashset, String stringToAdd) {
        genericHashset.add(stringToAdd);
        System.out.println(genericHashset);
    }

    public static void removeElementOfHashset(HashSet<String> genericHashset, String stringToRemove) {
        if (genericHashset.contains(stringToRemove)) {
            genericHashset.remove(stringToRemove);
            System.out.println(genericHashset);
        }
    }
}
