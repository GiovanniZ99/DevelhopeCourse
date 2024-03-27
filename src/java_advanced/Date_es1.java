package java_advanced;
/*Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni*/
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date_es1 {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String shortForm = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String midtForm = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String longForm = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        System.out.println(shortForm);
        System.out.println(midtForm);
        System.out.println(longForm);
    }
}
