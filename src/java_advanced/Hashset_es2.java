/*Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato */
package java_advanced;

import java.util.HashSet;


public class Hashset_es2 {
    public static void main(String[] args) {

        System.out.println(fillAndOpOnHashset());

        HashSet <String> newObject = new HashSet<>();
        newObject.add("popoliamo");
        System.out.println(newObject.contains("popoliamo"));
    }
    public static HashSet<String> fillAndOpOnHashset(){
       HashSet <String> hashSet = new HashSet<>();
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("5");
        return hashSet;
    }
}


