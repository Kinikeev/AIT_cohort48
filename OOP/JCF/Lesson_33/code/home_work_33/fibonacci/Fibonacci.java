package home_work_33.fibonacci;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer>{

    // fields
    private int q;

    public Fibonacci(int q) {
        this.q = q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(q); // TODO
    }
}
