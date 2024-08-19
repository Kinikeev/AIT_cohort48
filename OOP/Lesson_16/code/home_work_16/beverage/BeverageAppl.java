package home_work_16.beverage;

public class BeverageAppl {
    public static void main(String[] args) {
        Beverage beverage = new Beverage(5,"White","carton");
        System.out.println(beverage);

        Beer beer = new Beer(30,"black","can",5.6,"Franciskaner",
                "whiss","Bayern");
        System.out.println(beer);

    } // End of main

} // End of class
