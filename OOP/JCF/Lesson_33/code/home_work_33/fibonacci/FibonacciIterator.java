package home_work_33.fibonacci;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer>{

    // fields
    private int q;
    private int prevNum;
    private int prevPrevNum;
    private int cursor; // cursor

    // constructor

    public FibonacciIterator(int q) {
        this.q = q;
        this.prevNum = 1;
        this.prevPrevNum = 1;
        this.cursor = 1;
    }


    @Override
    public boolean hasNext() {
        return cursor <= q; // - проверка на кол-во чисел в ряду
    }

    @Override
    public Integer next() {
        if (cursor++ <= 2) {
            return 1;
        }
        int currNum = prevNum; // текущее число b
        prevNum = prevPrevNum + prevNum; // a+b вычисляем следующее как сумму двух предыдущих
        prevPrevNum = currNum; // переносим текущее число
        return prevNum; // - как получить сл. число Фибоначчи в ряду = предыдущее + текущее

    }
}
