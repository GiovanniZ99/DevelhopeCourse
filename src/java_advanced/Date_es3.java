package java_advanced;
/* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console */

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Date_es3 {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int year = data.getYear();
        Month month = data.getMonth();
        int dayOfMonth = data.getDayOfMonth();
        DayOfWeek dayOfWeek = data.getDayOfWeek();

        System.out.printf("%s %s %s %s", year, month, dayOfMonth, dayOfWeek);
    }
}
