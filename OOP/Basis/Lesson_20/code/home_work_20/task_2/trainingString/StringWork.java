package home_work_20.task_2.trainingString;
    /*
        **Задание 2.**
    Разработайте приложение, которое принимает от пользователя строку (некое предложение,
    * например: "Мама мыла раму.") и выводит:
        - количество символов в строке;
        - количество символов в верхнем регистре;
        - количество цифр в строке;
        - количество пробелов в строке;
        - в зависимости от последнего символа в строке сообщает, какое это предложение:
                 - повествовательное;
                 - вопросительное;
                 - восклицательное.
     */
public class StringWork {
    public static void main(String[] args) {

        String line = "Leonid really has 123 Students and a Lot of Patience!";

        System.out.println("-----------------------------------------------------");
        System.out.println(line);
        System.out.println("-----------------------------------------------------");
        charactersCounter(line);       // - количество символов в строке;
        upperCaseCounter(line);        // - количество символов в верхнем регистре;
        digitsCounter(line);           // - количество цифр в строке;
        wordsCounter(line);            // - количество слов в строке;
        spaceCount(line);              // - количество пробелов в строке
        typeSentence(line);            // - тип предложения

    } // End of main

    // - количество символов в строке;
    public static void charactersCounter(String line){
        System.out.println("Количество символов в строке: ......... " + line.length());
    }

    // - количество символов в верхнем регистре;
    public static void upperCaseCounter(String line){
        int count = 0;
        for (char ch : line.toCharArray()) {        // For each
            if (Character.isUpperCase(ch)) {
                count ++;
            }
        }

        System.out.println("Количество символов в верхнем регистре: " + count);
    }

    // - количество цифр в строке;
    public static void digitsCounter(String line){
        int count = 0;
        for (char ch : line.toCharArray()){
            if (Character.isDigit(ch)){
                count ++;
            }
        }
        System.out.println("Количество цифр в строке: ............. " + count);
    }

    // - количество слов в строке;
    public static void wordsCounter (String line){
        String[] words = line.split(" ");
        System.out.println("Количество слов в строке: .............." + words.length);
    }

    // - количество пробелов в строке;
    public static void spaceCount(String line){
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            String a = "" + line.charAt(i);
            if (a.equals(" ")){
                count ++;
            }
        }
        System.out.println("Количество пробелов в строке:.......... " + count);
    }
    /*
    public static void spaceCount_2 (String line){
        int spaceCount = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Количество пробелов в строке: " + spaceCount);
    }
     */
    // какое это предложение:
        //                 - повествовательное;
        //                 - вопросительное;
        //                 - восклицательное.
    public static void typeSentence (String line){
        char ch = line.charAt(line.length() - 1);
        switch (ch){
            case '.' : System.out.println("Это предложение .......... повествовательное."); break;
            case '?' : System.out.println("Это предложение .......... вопросительное."); break;
            case '!' : System.out.println("Это предложение .......... восклицательное."); break;
            default:   System.out.println("Это предложение .......... unknown");
        }

    }




} // End of class
