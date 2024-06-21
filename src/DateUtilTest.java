import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DateUtilTest {

    @Test
    void getAnno() {
        Integer expectedAnno = 2023;
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(expectedAnno, dateTime.getYear());
    }

    @Test
    void getMese() {
        Integer expectedMese = 3;
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(expectedMese, dateTime.getMonthValue());
    }

    @Test
    void getGiorno() {
        Integer expectedGiorno = 1;
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(expectedGiorno, dateTime.getDayOfMonth());
    }

    @Test
    void getGiornoSettimana() {
        String expectedGiornoDellaSettimana = "WEDNESDAY";
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(expectedGiornoDellaSettimana, dateTime.getDayOfWeek().toString());
    }
}