package class_work_38.hash_Set;

import class_work_38.hash_Set.dao.ISet;
import class_work_38.hash_Set.model.ISetImpl;

public class ISetAppl {
    public static void main(String[] args) {

        ISet<String> mySet = new ISetImpl<>(8,0.5);

        mySet.add("Boston");
        mySet.add("Berlin");
        mySet.add("Hamburg");
        mySet.add("New York");
        mySet.add("Washington");
        mySet.add("Augsburg");
        mySet.add("Atlanta");

        System.out.println(mySet.size());
        printSet(mySet);

        System.out.println(mySet.contains("Augsburg"));
        System.out.println(mySet.contains("Amberg"));

        mySet.remove("New York");
        System.out.println(mySet.size());





    } // end of main
    private static void printSet (ISet<String> set){
        for (String s : set){
            System.out.println(s);
        }

    }
}
