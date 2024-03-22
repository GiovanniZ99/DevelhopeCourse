package java_advanced.arraylist_2;

/*Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato*/

import java_advanced.arraylist_1.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Matteo", 28));
        students.add(new Student("Giorgia", 26));
        students.add(new Student("Luca", 19));
        students.add(new Student("Giovanni", 24));
        students.add(new Student("Denise", 21));
        students.add(new Student("Simone", 22));
        students.add(new Student("Pier", 33));
        students.add(new Student("Daniela", 16));
        students.add(new Student("Gianluca", 18));
        students.add(new Student("Luigi", 36));
        students.add(new Student("Maria", 67));
        students.add(new Student("Antonio", 11));
        for(Student studente: students) {
            System.out.println(studente.getNome());
        }
        System.out.println();
        students.sort(Comparator.comparing(Student::getNome));
        for(Student student: students){
            System.out.println(student.getNome());
        }
    }
}
