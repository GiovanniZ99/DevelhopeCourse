package java_advanced.linkedlist;
/* Creare una classe Fruit che accetti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata */
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruitList = new LinkedList<>();

        fruitList.add(new Fruit("Mela"));
        fruitList.add(new Fruit("Banana"));
        fruitList.add(new Fruit("Arancia"));

        printList(fruitList);

        fruitList.addFirst(new Fruit("Limone"));
        fruitList.addLast(new Fruit("Pera"));

        printList(fruitList);
    }

    // Metodo per stampare la LinkedList di frutta
    public static void printList(LinkedList<Fruit> list) {
        for (Fruit fruit : list) {
            System.out.println(fruit.getName());
        }
    }
}

