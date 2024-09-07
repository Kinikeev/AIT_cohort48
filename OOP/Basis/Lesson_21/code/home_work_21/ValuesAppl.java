package home_work_21;
    /*
        Задание 2.(*) Напишите приложение, которое выводит минимальные/максимальные
        числовые значения примитивных типов: byte, short, char, int, long, float, double Типы как
        объекты String должны браться из аргументов основной функции main.
        Если в аргументах нет какого-либо типа (не указан тип), приложение должно вывести
        максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double).
        Если аргументы содержат неправильный тип, приложение должно вывести сообщение:
        Неверный тип.
     */

public class ValuesAppl {

    // Приложение с аргументами командной строки
    public static void main(String[] args) {

        // Строки, которые определяют типы данных
        String[] types = {"byte", "short", "char", "int", "long", "float", "double"};

        // Если не указаны аргументы
        if (args.length == 0) {
            displayMinMaxValues();
            return;
        }

        // Если указаны аргументы
        for (String arg : args) {
            switch (arg) {
                case "byte":
                    System.out.println("byte:   min = " + Byte.MIN_VALUE +
                            ",                 max = " + Byte.MAX_VALUE);
                    break;
                case "short":
                    System.out.println("short:  min = " + Short.MIN_VALUE +
                            ",               max = " + Short.MAX_VALUE);
                    break;
                case "char":
                    System.out.println("char:   min = " + (int) Character.MIN_VALUE +
                            ",                    max = " +  (int) Character.MAX_VALUE);
                    break;
                case "int":
                    System.out.println("int:    min = " + Integer.MIN_VALUE +
                            ",          max = " + Integer.MAX_VALUE);
                    break;
                case "long":
                    System.out.println("long:   min = " + Long.MIN_VALUE + ", max = " + Long.MAX_VALUE);
                    break;
                case "float":
                    System.out.println("float:  min = " + Float.MIN_VALUE +
                            ",              max = " + Float.MAX_VALUE);
                    break;
                case "double":
                    System.out.println("double: min = " + Double.MIN_VALUE +
                            ",             max = " + Double.MAX_VALUE);
                    break;
                default:
                    System.out.println("Invalid type.");
                    return;
            }
        }

    } // End of main

    // Если не указаны аргументы:
    private static void displayMinMaxValues() {
        System.out.println("byte:   min = " + Byte.MIN_VALUE +
                ",                 max = " + Byte.MAX_VALUE);
        System.out.println("short:  min = " + Short.MIN_VALUE +
                ",               max = " + Short.MAX_VALUE);
        System.out.println("char:   min = " + (int) Character.MIN_VALUE +
                ",                    max = " + (int) Character.MAX_VALUE);
        System.out.println("int:    min = " + Integer.MIN_VALUE + ",          max = " + Integer.MAX_VALUE);
        System.out.println("long:   min = " + Long.MIN_VALUE + ", max = " + Long.MAX_VALUE);
        System.out.println("float:  min = " + Float.MIN_VALUE +
                ",              max = " + Float.MAX_VALUE);
        System.out.println("double: min = " + Double.MIN_VALUE +
                ",             max = " + Double.MAX_VALUE);
    }

} // End of class








