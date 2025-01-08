import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseFormatLocalDate {
    public static void parseLocalDate(){

        String formatterBASIC_ISO_DATE = "20250108";
        System.out.println("BASIC_ISO_DATE : " + LocalDate.parse(formatterBASIC_ISO_DATE,DateTimeFormatter.BASIC_ISO_DATE));

        String date = "2025-01-08";
        LocalDate formatterISO_LOCAL_DATE =  LocalDate.parse(date);
        System.out.println("ISO_LOCAL_DATE : " + formatterISO_LOCAL_DATE);

        String formatterISO_OFFSET_DATE = "2025-01-08+09:00";
        System.out.println("BASIC_ISO_DATE : " + LocalDate.parse(formatterISO_OFFSET_DATE,DateTimeFormatter.ISO_OFFSET_DATE));

        /**
         * Custom system defined format
         * 2025 -> yyyy or uuuu
         * 01 -> MM
         * 08 -> dd
         */
        String customFormat = "2025--01--08";
        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy--MM--dd");
        LocalDate customFormatterLocalDate = LocalDate.parse(customFormat,customDateTimeFormatter);
        System.out.println("localDate1 : " + customFormatterLocalDate);

        String customFormat2 = "2025%01%08";
        DateTimeFormatter customDateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy%MM%dd");
        LocalDate customFormatterLocalDate2 = LocalDate.parse(customFormat2,customDateTimeFormatter2);
        System.out.println("localDate2 : " + customFormatterLocalDate2);
    }

    public static void formatLocalDate(){
        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd|MM|yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate = LocalDate.now();
        System.out.println("normal LocalDate format: " + localDate);
        String formattedDate = localDate.format(dateTimeFormatter);
        System.out.println("formattedDate : " + formattedDate);

    }

    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();
    }
}
