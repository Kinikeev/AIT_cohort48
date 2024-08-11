package class_work_17.compareStrings;

public class CompareStrings {
    public static void main(String[] args) {

        String str_1 = "Hello";
        String str_2 = "Hello";

        boolean checker = (str_1 == str_2);
        System.out.println(checker);

        String str_3 = new String("Hello");
        checker = (str_1 == str_3);
        System.out.println(checker);
        System.out.println(str_1.equals(str_3));

    } //
}
