import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateCreateGet {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date is " + localDate);

        LocalDate localDate1 = LocalDate.of(2018, 03,03);
        System.out.println(localDate1);

        System.out.println("Year Day Date " + LocalDate.ofYearDay(2018,365));


        /**
         * Getting Values from Local Date
         */
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getYear());

    }
}
