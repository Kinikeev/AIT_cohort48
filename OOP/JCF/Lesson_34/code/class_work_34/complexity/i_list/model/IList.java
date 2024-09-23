package class_work_34.complexity.i_list.model;

// зададим абстрактные методы для работы со структурой данных "лист/list" (список чего-то),
// для любых типов данных Integer, String, StringBuilder, Employee, Car, Pet, Photo, Book ...

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface IList<E> extends Iterable<E> {

    int size();

    default boolean isEmpty(){  // есть он пустой, то true
        return size() == 0;
    }

    void clean();

    boolean add(E element);
    default boolean contains(Object o){  // есть ли элемент в списке
        return indexOf(o) >= 0;
    }

    default boolean remove(Object o){
        int index = indexOf(o);
        if (index < 0){         // // когда объекта нет в нашем списке
            return false;
        }
        remove(index);
        return true;
    }

    boolean add ( int index, E element);
    E remove (int index);
    E get (int index);
    E set (int index, E element);
    int indexOf (Object o);
    int lastIndexOf (Object o);

    List<Double> listOfWight = new ArrayList<>();

}
