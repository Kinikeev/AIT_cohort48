package class_work_39.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetString {
    public static void main(String[] args) {

        Set<String> rivers = new TreeSet<>();

        rivers.add("Volga");
        rivers.add("Dunau");
        rivers.add("Lech");
        rivers.add("Rain");
        rivers.add("Isar");
        rivers.add("Dunau"); // повторяется

        System.out.println(rivers.size());
        for (String str : rivers){
            System.out.println(str);
        }
        System.out.println(rivers);



    }
}
