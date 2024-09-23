package class_work_38.hash_Set.model;

import class_work_38.hash_Set.dao.ISet;

import java.util.Iterator;
import java.util.LinkedList;

public class ISetImpl<E> implements ISet<E> {

    // fields
    // Для хранения элементов создаём массив линкед листов LinkedList, который содержит в себе элементы типа <E>
    private LinkedList<E>[] hashSet;  // это массив связных листов
    private int size;                 // общее кол-во элементов в set
    private int capacity;             // кол-во ячеек, "гвоздики для цепочек элементов"
    private double loadFactor;        // процент загрузки (загрузка "цепочек")

    // constructor
    public ISetImpl(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        hashSet = new LinkedList[capacity];
    }

    public ISetImpl(int capacity) {
        this(capacity, 0.75);
    }

    public ISetImpl(){
        this(16); // длина массива hashset
    }


    @Override
    public boolean add(E element) {
        if(size >= loadFactor * capacity ) { // не хватило места
            rebuildArray(); // увеличиваем
        }
        int index = getIndex(element);
        if (hashSet[index] == null) { // если индекс не занять
            hashSet[index] = new LinkedList<>(); // создаем новый элемент массива листов
        }
        if (hashSet[index].contains(element)) {
            return false; // следим за уникальностью элементов
        }
        hashSet[index].add(element); // добавляем элемент
        size++;
        return true;
    }

    private void rebuildArray(){  //
        capacity = capacity << 1; //увеличили capacity в 2 раза
        LinkedList<E>[] newHashset = new LinkedList[capacity];
        // надо обежать весь hashSet, залезть в каждый его LinkedList, переложить элементы в новый
        for (int i = 0; i < hashSet.length; i++) {
            if (hashSet[i] != null) {
                for (E e : hashSet[i]) {
                    int index = getIndex(e);
                    if (newHashset[index] == null) {
                        newHashset[index] = new LinkedList<>(); // создаем новый лист
                    }
                    newHashset[index].add(e); // добавляем элемент в LinkedList
                }
            }
        }
        hashSet = newHashset; // garbage collector очищает память
    }

    private int getIndex(Object o){    // getIndex - должен быть положительным
        int hashcode = o.hashCode(); // вычисление hashCode
        hashcode = hashcode >=0 ? hashcode : -hashcode; // тернарный оператор, делаем положительным
        return hashcode % capacity; // деление с остатком
    }

    @Override
    public boolean contains(Object o) {
        int index = getIndex(o);
        if(hashSet[index] == null) {
            return false;
        }
        return hashSet[index].contains(o); // проверяем наличие элемента
    }

    @Override
    public boolean remove(Object o) {
        int index = getIndex(o);
        if(hashSet[index] == null){
            return false;
        }
        boolean res = hashSet[index].remove(o);
        if(res){    // потому что res булиновский
            size--;
        }
        return res;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int totalCounter;
            int i;
            int j;
            @Override
            public boolean hasNext() {
                return totalCounter < size;
            }

            @Override
            public E next() {
                while(hashSet[i] == null || hashSet[i].isEmpty()){  // Empty - пустой
                    i++;
                }
                E res = hashSet[i].get(j);
                totalCounter++; // сдвинули курсор
                if(j < hashSet[i].size() - 1){ // почему -1?
                    j++;
                } else {
                    i++;
                    j=0;
                }
                return res;
            }
        };
    }
}
