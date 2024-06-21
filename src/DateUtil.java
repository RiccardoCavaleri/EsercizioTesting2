import java.time.OffsetDateTime;

public class DateUtil {
    public OffsetDateTime dataParse (String dataString){
        return OffsetDateTime.parse(" 2023-03-01T13:00:00Z");
    }
    public Integer getAnno (OffsetDateTime dateTime){
        return dateTime.getYear();
    }
    public Integer getMese(OffsetDateTime dateTime){
        return dateTime.getMonthValue();
    }
    public Integer getGiorno(OffsetDateTime dateTime){
        return dateTime.getDayOfMonth();
    }
    public String getGiornoSettimana(OffsetDateTime dateTime){
        return dateTime.getDayOfWeek().toString();
    }
}