package class_work_20.user_validation;

public class User {

    // fields:
    private String email;
    private String password;

    // constructor:
    /*
    public User(String email) {
        this.email = email;
    }
     */
    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        } else {
            System.out.println(email + " is not valid");
        }

    }

    // Метод проверки в правильности введённого email - адреса.
    /*
    1) @ exists and only one (done)                   @ существует и только один (готово)
    2) dot after @ (done)                             точка после @ (готово)
    3) after last dot 2 or more symbols (done)
    4) alphabetic, digits, '_', '-', '.', '@' (done)

   /* private boolean isEmailValid(String email) {
        int indexAT = email.indexOf('@');     // index where @ place
        if (indexAT == -1 || indexAT != email.lastIndexOf('@')) {
            return false;      // @ exists and only one (done) -> @ существует и только один (готово)
        }
        if (email.indexOf('.', indexAT) == -1) {
            return false;       // 2) dot after @ (done) -> точка после @ (готово)
        }
        if (email.lastIndexOf('.') >= email.length() - 2) {
            return false;   // 3) after last dot 2 or more symbols (done) ->
            // 3) после последней точки 2 или более символов (готово)
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!(Character.isAlphabetic(c) || Character.isDigit(c) ||
                    c == '_' || c == '-' || c == '.' || c == '@')){ ;
            return false;    // 4) alphabetic, digits, '_', '-', '.', '@' (done)
            }
            // 4) буквы, цифры, '_', '-', '.', '@' (выполнено)
        }
        return true;
    }
    */
    // Метод проверки в правильности введённого email - адреса.
    private boolean isEmailValid(String email) {
        int indexAt = email.indexOf('@'); // index where @ placed
        if(indexAt == -1 || indexAt != email.lastIndexOf('@')){
            return false;
        }
        if(email.indexOf('.', indexAt) == -1){
            return false;
        }
        if(email.lastIndexOf('.') >= email.length() - 2) {
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if(!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '_' || c == '-' || c == '.' || c == '@')){
                return false;
            }
        }
        return true;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
        else {
            System.out.println("Password is not valid");
        }
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    // 1) length >= 8
    //2) min one digit
    //3) min one symbol in upperCase
    //4) min one symbol in lowerCase
    //5) min one special symbol (!%@$&)
    /*
    private boolean isPasswordValid(String password){
        boolean[] result = new boolean[5];
        if (password.length() >= 8){
            result[0] = true;
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)){
                result[1] = true;
            }
            if (Character.isLowerCase(c)){
                result[2] = true;
            }
            if (Character.isDigit(c)){
                result[3] = true;
            }
            if ("!%@$&".indexOf(c) >= 0){
                result[4] = true;
            }
            if (result[0] && result[1] && result[2] && result[3] && result[4]){
                return true;
            }
        }
        return false;
    }

     */
    private boolean isPasswordValid(String password) {
        boolean[] res = new boolean[5];
        if(password.length() >= 8){
            res[0] = true;
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(Character.isUpperCase(c)){
                res[0] = true;
            }
            if(Character.isLowerCase(c)){
                res[2] = true;
            }
            if(Character.isDigit(c)){
                res[3] = true;
            }
            if("!%@$&".indexOf(c) >= 0){
                res[4] = true;
            }
            if(res[0] && res[1] && res[2] && res[3] && res[4]){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
} // End of class
