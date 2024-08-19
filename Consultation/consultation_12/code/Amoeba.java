public class Amoeba {
    /*
        Задача 1. Одноклеточная амёба каждые 3 часа делится на 2 такие же амёбы.
        Необходимо определить, сколько будет амёб через n часов, если первоначально была только одна амёба.
     */
    public static void main(String[] args) {

        amoebas(15);

    } // End of main

    public static void amoebas(int hours){
        int amoebas = 1;
        for (int i = 2; i <= hours; i++) {
            if (i % 3 == 0) {
                amoebas *= 2;
            }
        }
        System.out.println("Через " + hours + " часа будет " + amoebas + " амёб.");
        System.out.println("In " + hours + " hours will be " + amoebas + " amoebas.");
    }

} // End of class
