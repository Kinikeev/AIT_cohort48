package currency_convertor;

// **Задача 1.**
//Создайте enum с кодами валют и их текущими курсами к евро.
//Добавьте все валюты в список, при добавлении убедитесь, что не добавляются дубликаты.
//Выведите список валют и их курсов на экран.
//Реализуйте возможность для пользователя выбрать желаемую валюту, ввести ее количество и узнать,
//сколько он получит при обмене на евро.

public enum Currency {
    EUR(1,"euro",1), USD(2,"dollar",1.11),
    CHF(3,"frank",1.05), GBP(4,"pound",0.85), ;
    // 1. составляем необходимые поля
    private int number; // номер валюты
    private String name; // название валюты
    private double rate; // обменный курс

    // 2. constructor, после конструктора наверху вводим ENUM перед точкой с запятой
    Currency(int number, String name, double rate) {
        this.number = number;
        this.name = name;
        this.rate = rate;
    }

    // 3. getters на все поля
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public double getRate() {
        return rate;
    }

    // 4. setters только на rate
    public void setRate(double rate) {
        this.rate = rate;
    }

    // 5. to String - напишем сами с использованием формата
    public String toString(){
        return String.format("%d - name: %s, rate: %.2f",number,name,rate);
    }

    // 6. теперь создадим отдельный Class CurrencyConvertor

}
