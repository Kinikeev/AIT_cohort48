package class_work_22.validator;

public class Validator {

    // Credit cart number
    public static boolean checkCreditCardNumber(String str){
        return str.matches("^(\\d{8,16})");
    }

    public static boolean checkDateFormatEU(String str){
        // Format EU: DD.MM.YYYY
        if (!str.matches("^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(\\d{4})$")){
            System.out.println(str + " - The format is incorrect.");
            return false;  // Формат некорректен
        }
        String[] parts = str.split("\\.");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (day > daysInMonth(month,year)){
            System.out.println(str + " - Wrong Day");
            return false ; // День превышает количество дней в месяце
        }
        System.out.println(str + " - Correct!");
        return true;
    }
    public static int daysInMonth(int month,int year){
        return switch (month) {

            // January, March, May, July, August, October, December.
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            // April, June, September, November.
            case 4, 6, 9, 11 -> 30;
            // February.
            case 2 -> (isLeapYear(year)) ? 29 : 28;
            default -> 0;
        };
    }
    public static boolean isLeapYear(int year){
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0 );
    }

    public static boolean checkDateFormatUS(String str){
        // Format EU: YYYY.MM.DD
        if (!str.matches("^(\\d{4})\\.(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])$")){
            System.out.println(str + " - The format is incorrect.");
            return false;  // Формат некорректен
        }
        String[] parts = str.split("\\.");
        int day = Integer.parseInt(parts[2]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[0]);

        if (day > daysInMonth(month,year)){
            System.out.println(str + " - Wrong Day");
            return false ; // День превышает количество дней в месяце
        }
        System.out.println(str + " - Correct!");
        return true;
    }

    public static boolean checkPhoneNumber(String str){
        // ("+08(01)1234-5678")
        if (!str.matches("^\\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}$")) {
            System.out.println(str + " - Wrong number.");
            return false;
        }
        System.out.println(str + " - Correct !!!");
        return true;
    }

    public static boolean checkLessEquals255(String str){
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch)){
                System.out.println(str + " - Wrong! Number is alphabetic.");
                return false;
            }
        }
        int less = Integer.parseInt(str);
        if (!str.matches("^\\d{3}%") && less > 255 || less < 0 ){
            System.out.println(str + " - Wrong ?");
            return false;
        }
        System.out.println(str + " - Correct!");
        return true;

    }

} // End of class
