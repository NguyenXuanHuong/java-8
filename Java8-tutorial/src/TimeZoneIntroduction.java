import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeZoneIntroduction {
    public static void main(String[] args) {
        //UTC -> TimeZone 00:00
        LocalDateTime sampleLocalDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now(); //gets you this machines TimeZone
        System.out.println("zonedDateTime : " + zonedDateTime);

        ZoneOffset zoneOffset = zonedDateTime.getOffset();
        System.out.println("zoneOffset : " + zoneOffset);

        ZoneId zoneId = zonedDateTime.getZone();
        System.out.println("zoneId : " + zoneId.getId());

        // System.out.println("getAvailableZoneIds : " + ZoneId.getAvailableZoneIds());

        /*ZoneId.getAvailableZoneIds()
                .forEach(zone -> {
                    System.out.println("zone : " + zone);
                });*/
        System.out.println("no Of Zones : " + ZoneId.getAvailableZoneIds().size());

        ZonedDateTime tokyoZoneDateTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("tokyoZoneDateTime: " + tokyoZoneDateTime);
        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.systemDefault());
        System.out.println("Instant to Zoned using zoneID: " + zonedDateTime2);
        ZonedDateTime zonedDateTime3 = Instant.now().atZone(ZoneOffset.ofHours(9));
        System.out.println("Instant to Zoned using zoneOffset: : " + zonedDateTime3);

        ZonedDateTime hanoiTime = tokyoZoneDateTime.withZoneSameInstant(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.out.println("vietnam zone date time: " + hanoiTime);

        LocalDateTime tokyoLocalDateTime = tokyoZoneDateTime.toLocalDateTime();
        System.out.println("tokyoLocalDateTime: " + tokyoLocalDateTime);

    }
}
