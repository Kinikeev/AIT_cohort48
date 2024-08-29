package class_work_31.time_api_exesises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class TimeAppl {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now(); // вызвали текущую дату
        System.out.println(localDate);  // ISO - формат

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println("---------------------------------------------------------------------");

        LocalDate gagarin = LocalDate.of(1961,04,12);
        System.out.println(gagarin);

        // // Какой это был день недели?
        System.out.println(gagarin.getDayOfWeek());

        // // Какой это был день года?
        System.out.println(gagarin.getDayOfYear());

        // проверка года на "Високосность"
        int year = 2024;
        System.out.println("Is year " + year + " liep: -> " + Year.isLeap(year));
        System.out.println("---------------------------------------------------------------------");


        System.out.println(gagarin.isBefore(localDate)); // true
        System.out.println(gagarin.isAfter(localDate));  // false

        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getEra());
        System.out.println("---------------------------------------------------------------------");
        LocalDate event = LocalDate.of(1961,01,01); // event - событие
        System.out.println(localDate.compareTo(gagarin)); // years
        System.out.println(event.compareTo(gagarin));
        event = LocalDate.of(1961,04,15);
        System.out.println(event.compareTo(gagarin));

        /*
        LocalDate date = LocalDate.now();
        int weekNumber = date.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR);
         */
        // travel in time
        LocalDate newDate = localDate.plusDays(10);
        System.out.println(newDate);

        // ChronoUnits
        newDate = localDate.plus(14, ChronoUnit.DECADES);
        System.out.println(newDate);
        localDateTime = localDateTime.plus(14,ChronoUnit.MINUTES);
        System.out.println(localDateTime);
        localDateTime = localDateTime.plus(1,ChronoUnit.HALF_DAYS);
        System.out.println(localDateTime);
        System.out.println("------------------- Period ------------------------------------------------");
        long period = ChronoUnit.DAYS.between(gagarin,localDate);
        System.out.println(period);
        period = ChronoUnit.MONTHS.between(gagarin,localDate);
        System.out.println(period);
        LocalDate lenin = LocalDate.of(1870,04,22);
        period = ChronoUnit.MONTHS.between(lenin,gagarin);
        System.out.println(period);
        System.out.println("------------------- DateTimeFormatter ------------------------------------------------");
        DateTimeFormatter df = DateTimeFormatter.BASIC_ISO_DATE;
        String date = gagarin.format(df);
        System.out.println(date); // датуперевели в строку
        // // выбрали другой формат
        df = DateTimeFormatter.ISO_LOCAL_DATE;
        date = gagarin.format(df);
        System.out.println(date);
        // задаем другой (собственный формат) формат
        df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = gagarin.format(df);
        System.out.println(date);
        // задаем другой (собственный формат) формат
        df = DateTimeFormatter.ofPattern("dd/M/yy");
        date = gagarin.format(df);
        System.out.println(date);
        // задаем другой (собственный формат) формат
        df = DateTimeFormatter.ofPattern("dd/MMM/yy");
        date = gagarin.format(df);
        System.out.println(date);

        // задаем другой (собственный формат) формат
        df = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.UK);
        date = gagarin.format(df);
        System.out.println(date);
        System.out.println("-----------------------------------------------------------------------");

        date = "27/08/2024";
        df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        newDate = LocalDate.parse(date, df);
        System.out.println(newDate.toString());
        System.out.println(newDate.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.forLanguageTag("ru"))));
        System.out.println("///////////////////////////////////////////////////////////////");
        // calculate years between dates
        LocalDate day = LocalDate.of(1964,05,01);
        int years = (int) ChronoUnit.YEARS.between(day,localDate);
        System.out.println(years);
        // parsing date from string
        String stringDay = "27:08:2024";
        LocalDate res = LocalDate.parse(stringDay,DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd][dd:MM:yyyy"));
        System.out.println(res);
        String birthsDay = "01/05/1964";


    } // End of main

} // End of class
