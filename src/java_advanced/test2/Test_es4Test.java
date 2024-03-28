package java_advanced.test2;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class Test_es4Test {

    @Test
    void main() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = date.getYear();
        Month month = date.getMonth();
        int day = date.getDayOfMonth();
        DayOfWeek dayWeek = date.getDayOfWeek();

        int expectedYear = 2023;
        Month expectedMonth = Month.MARCH;
        int expectedDay = 1;
        DayOfWeek expectedDayOfWeek = DayOfWeek.WEDNESDAY;

        assertEquals(expectedYear, year);
        assertEquals(expectedMonth, month);
        assertEquals(expectedDay, day);
        assertEquals(expectedDayOfWeek, dayWeek);

    }
}