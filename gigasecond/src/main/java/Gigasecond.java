import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

//    public void modernTime() {
//        Gigasecond gigaSecond = new Gigasecond(LocalDate.of(2011, Month.APRIL, 25));
//
//        assertEquals(LocalDateTime.of(2043, Month.JANUARY, 1, 1, 46, 40), gigaSecond.getDate());
//    }

    private static final Long GigaSeconds = BigInteger
            .valueOf(10)
            .pow(9)
            .longValue();
    private final LocalDateTime date;

    Gigasecond(LocalDate date) {
        this(date.atStartOfDay());
    }

    Gigasecond(LocalDateTime date) {
        this.date = date;
    }

    LocalDateTime getDate() {
        System.out.println(GigaSeconds);
        System.out.println(date.plusSeconds(GigaSeconds));
        return date.plusSeconds(GigaSeconds);
    }

}
