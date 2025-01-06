import java.time.LocalDate;

public class LocalDateCompareMethod {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        LocalDate localDate1 = LocalDate.of(2025, 1, 6);
        System.out.println("isEqual : " + localDate1.isEqual(localDate1));

        LocalDate localDate2 = LocalDate.of(2025, 1, 7);
        System.out.println("isBefore : " + localDate1.isBefore(localDate));
        System.out.println("isAfter : " + localDate1.isAfter(localDate2));

    }
}
