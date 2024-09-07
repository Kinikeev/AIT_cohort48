package class_work_33.myString_iterator.model;

import java.util.Iterator;

public class MyStringAppl {
    public static void main(String[] args) {

        MyString myString = new MyString("Two beer, or not two beer");
        System.out.println(myString);
        myString.addChar('!');
        System.out.println(myString);
        myString.removeChar(',');
        System.out.println(myString);
        System.out.println("-------------------------------------------------------------------------------------");
        /*
        StringBuilder sb = myString.getStr();
        System.out.println(sb);
        sb.setLength(5);
        System.out.println(sb);
        System.out.println(myString);

         */
        Iterator<Character> iterator = myString.iterator();
        while (iterator.hasNext()){
            char c = iterator.next();
            System.out.print(Character.toUpperCase(c));
        }
        System.out.println();

        for (Character c : myString){
            System.out.print(c);
        }
        System.out.println();

        System.out.println("--------------------------------------------------------------------------------");
        iterator = myString.iterator();  // curPos выставляем в начало
        while (iterator.hasNext()){
            char c = iterator.next();
            if (c == 'o'){
                iterator.remove();
            }
        }
        System.out.println(myString);

        for (Character c : myString){
            if (c == 'o'){
                iterator.remove();
            }
        }




    }
}
