package java_advanced.test2;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

/* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Ottieni l'anno
Ottieni il mese
Ottieni il giorno
Ottieni il giorno della settimana
Stampa i risultati sulla console -Crea dei test per questo esercizio */
public class Test_es4 {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = date.getYear();
        Month month = date.getMonth();
        int day = date.getDayOfMonth();
        DayOfWeek dayWeek = date.getDayOfWeek();
        System.out.printf("%s %s %s %s", year, month, day, dayWeek);
    }
}
