/*Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato */
package java_advanced;

import java.util.HashSet;


public class Hashset_es2 {
    public static void main(String[] args) {
        HashSet <String> hashSet = new HashSet<>();
       fillHashset(hashSet, "tre");
        System.out.println(elementOfHashset(hashSet, "tre"));
    }
    public static void  fillHashset(HashSet <String> genericHashset, String stringToAdd){
        genericHashset.add(stringToAdd);
        System.out.println(genericHashset);
    }
    public static boolean elementOfHashset(HashSet <String> genericHashset, String stringToFind){
        return (genericHashset.contains(stringToFind));
    }
}


