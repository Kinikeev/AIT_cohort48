package class_work_40;

import java.util.HashMap;
import java.util.Map;

public class MenAndWomen {

    // подсчитать кол-во мужчин и женщин в группе

    public static void main(String[] args) {
        //     K       V
        // "Leonid" : male
        // "Farangiz" : female

        Map<String,String> gender = new HashMap<>();

        gender.put("L", "m");
        gender.put("M", "m");
        gender.put("S", "f");
        gender.put("K", "m");
        gender.put("F", "f");
        gender.put("H", "m");
        gender.put("X", "f");

        // 1st option
        int men = 0;
        for (String name : gender.keySet()){
            if (gender.get(name).equals("m")){
                men++;
            }
        }
        int women = gender.size() - men;
        System.out.println("men = " + men + "; Women = " + women);

        // 2nd option
        women = 0;
        for (String g : gender.values()){
            if (g.equals("f")){
                women ++;
            }
        }
        System.out.println(women);

    }
}
