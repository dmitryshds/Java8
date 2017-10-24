package biz.bagira.shds.date_time;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class App17 {

    public static void main(String[] args) {

        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);    //SystemClock[Europe/Helsinki]

        System.out.println(clock.millis());     // 1508784796772

        Instant instant = clock.instant();
        System.out.println(instant);      // 2017-10-23T18:54:01.602Z
        Date date = Date.from(instant);
        System.out.println(date);         //Mon Oct 23 21:54:53 EEST 2017


        ZoneId.getAvailableZoneIds().forEach(System.out::println);    //all zones

        ZoneId zone1 = ZoneId.of("Europe/Bratislava");
        System.out.println(zone1.getRules());   //ZoneRules[currentStandardOffset=+01:00]

        ZoneId zone2 = ZoneId.of("Australia/Melbourne");
        LocalTime now1 = LocalTime.now(zone1);
        LocalTime now2 = LocalTime.now(zone2);

        System.out.println(now1.isBefore(now2));  // false

        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);   //-14
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);    //-899

        System.out.println(hoursBetween);       // -14
        System.out.println(minutesBetween);     // -899


        LocalTime late = LocalTime.of(23, 59, 59);
        System.out.println(late);       // 23:59:59

        DateTimeFormatter germanFormatter =
            DateTimeFormatter
                .ofLocalizedTime(FormatStyle.SHORT)
                .withLocale(Locale.GERMAN);

        LocalTime leetTime = LocalTime.parse("13:37", germanFormatter);
        System.out.println(leetTime);   // 13:37

        //LocalDate

        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = tomorrow.minusDays(2);

        System.out.println("tomorrow : "+tomorrow);
        System.out.println("yesterday : "+yesterday);

        LocalDate milenium = LocalDate.of(2000, Month.JANUARY, 1);
        DayOfWeek dayOfWeek = milenium.getDayOfWeek();
        System.out.println(dayOfWeek);    // SATURDAY


        DateTimeFormatter mediumGermanFormatter =
            DateTimeFormatter
                .ofLocalizedDate(FormatStyle.MEDIUM)
                .withLocale(Locale.GERMAN);

        LocalDate xmas = LocalDate.parse("24.12.2014", mediumGermanFormatter);
        System.out.println(xmas);   // 2014-12-24

//        LocalDateTime

        LocalDateTime sylvester = LocalDateTime.of(2014, Month.DECEMBER, 31, 23, 59, 59);

        DayOfWeek day = sylvester.getDayOfWeek();
        System.out.println(day);      // WEDNESDAY

        Month month = sylvester.getMonth();
        System.out.println(month);          // DECEMBER

        long minuteOfDay = sylvester.getLong(ChronoField.MINUTE_OF_DAY);
        System.out.println(minuteOfDay);    // 1439


        Instant sylvesterInstant = sylvester
                .atZone(ZoneId.systemDefault())
                .toInstant();

        Date legacyDate = Date.from(sylvesterInstant);
        System.out.println(legacyDate);     // Wed Dec 31 23:59:59 EET 2014

        DateTimeFormatter formatter =
            DateTimeFormatter
                .ofPattern("dd-MM-yyyy HH:mm:ss.SSS");

        LocalDateTime parsed = LocalDateTime.parse("03-05-2017 23:59:59.005", formatter);
        String string = formatter.format(parsed);
        System.out.println(string);     //03-05-2017 23:59:59.005

    }
}
