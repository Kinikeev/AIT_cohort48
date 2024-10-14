package home_work_43.parcel.model;

    // Создайте класс Box с полем: List - список посылок. Классы Container и Box являются итерируемыми.
    // Предположим, что каждая посылка в среднем имеет вес = 2 кг.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box implements Iterable<Parcel>{

    List<Parcel> parcels;

    public Box(int numParcels) {
        parcels = new ArrayList<>();             // заполняем Box посылками
        for (int i = 0; i < numParcels; i++) {
            parcels.add(new Parcel(2.0)); // вес посылки по умолчанию 2 кг
        }
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

    @Override
    public Iterator<Parcel> iterator() {
        return parcels.iterator();
    }

    @Override
    public String toString() {
        return "Box{" +
                "parcels: " + parcels +
                '}';
    }
}
