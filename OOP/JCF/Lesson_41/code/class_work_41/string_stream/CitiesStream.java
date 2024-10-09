package class_work_41.string_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CitiesStream {
    public static void main(String[] args) {

        //Возьмите список городов, отфильтруйте только те названия, которые начинаются с заданной буквы,
        //преобразуйте их в верхний регистр и выведите в алфавитном порядке.

        List<String> cityList = Arrays.asList("Augsburg", "Munich", "berlin", "Heidelberg",
                                  "Worms", "Frankfurt am Main","Bremen", "Bonn", "Braunschweig");

        char firstLetter = 'b';
        List<String> result = filterCity (cityList,firstLetter);

        // print
        result.forEach(System.out::println);


    } // end of main

    private static List<String> filterCity(List<String> cityList, char firstLetter) {
        return cityList.stream()
                .filter(city -> city.toLowerCase().startsWith(String.valueOf(firstLetter)))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
    }

} // end of class
