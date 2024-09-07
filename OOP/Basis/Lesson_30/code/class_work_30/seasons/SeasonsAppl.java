package class_work_30.seasons;

// Опробовать на нем методы:
// .values()
// .toString
// .ordinal()
// .valueOf()

public class SeasonsAppl {
    public static void main(String[] args) {

        Season[] seasons = Season.values(); // все значения enum попали в массив

        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i].getNumber() + " : " + seasons[i].getName());
        }

        // for each  ( enter iter )
        for (Season s : seasons) {
            System.out.println(s.getName());
        }
        System.out.println("------------------- to string ----------------------");
        String str = Season.WINTER.toString();
        System.out.println(str);

        System.out.println("------------------- ordinal ----------------------");
        int n = Season.AUTUMN.ordinal();
        System.out.println("Autumn: " + n);
        int w = Season.WINTER.ordinal();
        System.out.println("Winter: " + w);

        System.out.println("------------------- valueOf ----------------------");
        Season s = Season.valueOf("SUMMER");
        System.out.println(s);

    } // End of main

}
