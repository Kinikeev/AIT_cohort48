package class_work_39.treeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCar {
    public static void main(String[] args) {

        Set<Car_39> carTreeSet = new TreeSet<>();

        Car_39[] cars = new Car_39[5];
        cars[0] = new Car_39("N4", "Model1", "C1", 2.0, "red");
        cars[1] = new Car_39("N3", "Model2", "C2", 2.5, "red");
        cars[2] = new Car_39("N2", "Model1", "C3", 3.0, "green");
        cars[3] = new Car_39("N1", "Model3", "C1", 1.4, "gray");
        cars[4] = new Car_39("N4", "Model2", "C3", 2.5, "black"); // duplicate

        for (Car_39 car : cars){
            carTreeSet.add(car);
        }
        //carsTreeSet.addAll(List.of(cars));

        System.out.println("Size = " +  carTreeSet.size());

        //System.out.println(carTreeSet);
        for (Car_39 car : carTreeSet){
            System.out.println(car);
        }
        System.out.println("- - - - - - - - - - - - - - - - - ");

        Comparator<Car_39> findCarByColor = new Comparator<Car_39>() {
            @Override
            public int compare(Car_39 o1, Car_39 o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        };
        Set<Car_39> carTreeSetColor = new TreeSet<>(findCarByColor);

        for (Car_39 car : cars){
            System.out.println(car);
        }
        System.out.println("--------------------------------------------------------------");

        for (Car_39 car : carTreeSetColor){
            System.out.println(car);
        }

    }
}
