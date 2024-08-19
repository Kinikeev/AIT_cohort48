package class_work_16.poliphormism;

public class HouseAppl {
    public static void main(String[] args) {

        Cat myCat = new Cat("Anka",5,4.4,"persian");
        Dog myDod = new Dog("Muhtar",2,15.6,"spaniel");

        System.out.println(myCat.toString());
        myCat.voice();
        System.out.println(myCat.getName() + " has wight " + myCat.getWight());


        System.out.println(myDod.toString());
        myDod.voice();


    }



}
