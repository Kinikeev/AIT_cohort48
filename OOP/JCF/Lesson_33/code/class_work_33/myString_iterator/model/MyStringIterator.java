package class_work_33.myString_iterator.model;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {

    private StringBuilder str;
    private int size;
    private int currPost;

    public MyStringIterator(StringBuilder str) {
        this.str = str;
        this.size = str.length();
        //this.currPost = currPost;
    }

    @Override
    public boolean hasNext() {
        return currPost < size;
    }

    @Override
    public Character next() {
        Character current = str.charAt(currPost);
        currPost ++;
        return current;
    }

    @Override
    public void remove() {
        str.deleteCharAt(currPost - 1);
        currPost --;
        size --;
    }
}
