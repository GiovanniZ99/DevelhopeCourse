package java_advanced.arraylist_1;

/* Creare una classe Student che accetti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();
        students.add(new Student("Matteo", 28));
        students.add(new Student("Giorgio", 26));
        for(Student studente: students){
            System.out.println(studente.getNome());
        }
        System.out.println();
        students.add(new Student("Luca", 19));
        students.add(new Student("Giovanni", 24));
        students.add(new Student("Denise", 21));
        students.add(new Student("Simone", 23));
        for(Student studente: students){
            System.out.println(studente.getNome());
        }
    }
}
