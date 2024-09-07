package home_work_33.myArray_iterator.model;

    // Задача 1. По аналогии с работой на занятии создать:
//
//класс MyArray
//MyArrayIterator
//использовать в MyArrayAppl:
//изменить знак каждого элемента на противоположный;
//возвести каждый элемент множества в квадрат;
//удалить все четные элементы.

import java.util.Iterator;

public class MyArray implements Iterable<Integer>{

    private Integer number;

    public MyArray(int number) {
        this.number = number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyArray{");
        sb.append("integer: ").append(number);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
