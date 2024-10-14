package class_work_43.programmers;

// В этом классе нужно учесть состав и количество языков программирования, которые знает программист (technology).
// Чем больше языков (количество), тем "круче".

import java.util.Arrays;

public class Programmer {

    private String name;
    String[] technologies;

    //    В Java, varargs (сокращение от "variable arguments" — переменное количество аргументов)
    //    позволяет методу принимать разное количество аргументов одного типа. Это удобно,
    //    когда количество аргументов неизвестно заранее.

    public Programmer(String name, String...technologies) {  // ... varargs
        this.name = name;
        this.technologies = technologies;
    }

    public String getName() {
        return name;
    }

    public String[] getTechnologies() {
        return technologies;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", technologies=" + Arrays.toString(technologies) +
                '}' ;
    }
}
