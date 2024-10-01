package class_work_40;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyEx {

    // подсчитать кол-во повторов слов

    public static void main(String[] args) {

        // "a", "abc", "ab", "limit", "ab", "a", "ab", "limit", "a", "a", "a"

        String[] words = {"a", "abc", "ab", "limit", "ab", "a", "ab", "limit", "a", "a", "a"};

        printWordsFrequency(words);

    } // end of main

    private static void printWordsFrequency(String[] words){
        // положить в (собрать) Map
        Map<String,Integer> result = new HashMap<>();
        for (String word : words){
            if (!result.containsKey(word)){
                result.put(word,1);  // 1 - первый раз нашли  слово
            } else {
                result.put(word, result.get(word) + 1); // если строка повторяется добавляем +1
            }
        }

        // print
        for (String word : result.keySet()) {
            System.out.println("Word: " + word + ", frequency: " + result.get(word));
        }

    }

} // end of class
