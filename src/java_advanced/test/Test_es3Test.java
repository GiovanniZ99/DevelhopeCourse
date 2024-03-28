package java_advanced.test;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class Test_es3Test {

    @Test
    void main() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String formatDate = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
         assertEquals("1 marzo 2023",formatDate);
    }
}