package home_work_43.parcel.model;

    // Создайте класс Container с полями: String label (маркировка) и List - список коробок с посылками.
    // Создайте класс Box с полем: List - список посылок. Классы Container и Box являются итерируемыми.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container implements Iterable<Box> {

    private String label;
    List<Box> boxes;

    public Container(String label, int numBoxes) {
        this.label = label;
        boxes = new ArrayList<>();                            // заполняем Container
        for (int i = 0; i < numBoxes; i++) {
            boxes.add(new Box((int) (Math.random() * 6 + 5))); // от 5 до 10 посылок
        }
    }

    public String getLabel() {
        return label;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
}
