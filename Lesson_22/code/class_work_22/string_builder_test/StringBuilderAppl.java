package class_work_22.string_builder_test;

public class StringBuilderAppl {
    public static void main(String[] args) {

        // operations with string

        String str = "Java";
        str = str + "_" + 17;
        System.out.println(str);
        System.out.println("------------------------------------");



        // operations with StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        sb.append("_").append(17);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.insert(7,"Hello");
        System.out.println(sb);
        String str3 = sb.toString();
        System.out.println(str3);





    }
}
