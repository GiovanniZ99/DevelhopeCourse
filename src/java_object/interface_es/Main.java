/*Scrivere un programma che contenga un'interfaccia Forma ed un metodo chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo
per il calcolo dell'area.*/
package java_advanced.interface_es;

public class Main {
    public static void main(String[] args) {
        Triangolo triangolo = new Triangolo(5, 3);
        Rettangolo rettangolo= new Rettangolo(2, 5.6f);
        System.out.println(triangolo.calcolaArea());
        System.out.println(rettangolo.calcolaArea());
    }
}
