package java_advanced.builder;
/* Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
Il costruttore accetterà un Builder in input
Creare una classe Builder che attraverso il costruttore e dei metodi specifici
(tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
Creare due oggetti Person e stamparli a video */
public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder("Ciro", "Esposito")
                .setAge(25)
                .setAddress("Via Napoli")
                .build();
        Person person2 = new PersonBuilder("Nunzio", "Esposito")
                .setAge(7)
                .setAddress("Via Pizza")
                .build();
        System.out.printf("%s, %s", person, person2);
    }
}
