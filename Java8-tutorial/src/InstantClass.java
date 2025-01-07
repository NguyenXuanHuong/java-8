import java.time.Duration;
import java.time.Instant;

public class InstantClass {
    public static void main(String[] args) {

        // EPOCH <-> Jan. 1st 1970

        Instant instant = Instant.now();
        System.out.println(instant);

        System.out.println("getEpochSecond  : " + instant.getEpochSecond());

        Instant instant1  = Instant.ofEpochSecond(40);
        System.out.println("instant1 : " + instant1);

        Instant instant2 = Instant.now();

        Duration duration = Duration.between(instant,instant2);

        System.out.println("getNano : " + duration.getNano());

    }
}
