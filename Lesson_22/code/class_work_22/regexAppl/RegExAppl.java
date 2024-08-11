package class_work_22.regexAppl;

public class RegExAppl {
    public static void main(String[] args) {
        String text =" Java17";
        String pattern = " *(J|j)ava([1-9]|[1-9][0-9])?";

        boolean checker = text.matches(pattern);
        System.out.println(checker);
        System.out.println("\\\\");

        // domain
        String domain = "A-b-r.a-kadabra.com";
        pattern = "((\\w(-|\\.|\\w)*\\w)|\\w)\\.(com|org|de|il)";
        checker = domain.matches(pattern);
        System.out.println(checker);

        /*
    1) @ exists and only one (done)
    2) dot after @ (done)
    3) after last dot 2 or more symbols (done)
    4) alphabetic, digits, '_', '-', '.', '@' (done)
        */
        System.out.println("-----------------------------------------------------------");
        String email = "peter@mail.ru";
        pattern = "((\\w(-|\\.|\\w)*\\w)|\\w)@[a-zA-Z0-9](\\w|-|\\.)*\\.[A-Za-z]{2,6}";
        checker = email.matches(pattern);
        System.out.println(checker);


    }
}
