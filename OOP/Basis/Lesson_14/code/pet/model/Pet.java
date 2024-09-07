package pet.model;
    /*
      Задача 1. Создать класс Pet (Домашнее животное) с приватными полями:
                                           Task 1. Create a Pet class with private fields:
            - id                                    - id
            - вид                                   - view
            - возраст                               - age
            - кличка                                - nickname

        Стандартные методы:                     Standard methods:
            - конструктор на все поля;              - constructor for all fields;
            - геттеры и сеттеры на все поля;        - getters and setters for all fields;
            - метод toString.                       - toString method.

        Дополнительные методы:                  Additional methods:
            - спать                                 - sleep
            - есть                                  - eat
            - издавать звук                         - make sound
            - играть                                - play
            - гулять                                - walk
     */
public class Pet {

    // Creating private fields:
    private int id ;          // (идентификатор)
    private String view;      // (вид) (breed - порода)
    private int age;          // (возраст)
    private String nickname;  // (кличка)

    // Creating constructor:
    public Pet(int id, String view, int age, String nickname) {
        this.id = id;
        this.view = view;
        this.age = age;
        this.nickname = nickname;
    }

    // Creating getters and setters to all fields:
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getView() {
        return view;
    }
    public void setView(String view) {
        this.view = view;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    // Creating method toString:
    @Override                   // Override - (переопределить)
    public String toString() {
        return "Pet |" +
                " id: " + id +
                " | view: " + view +
                " | age: " + age +
                " | nickname: " + nickname + " |";
    }
    // display Pet
    public void displayPet(){
        System.out.println("Pet:__________________" +"\n" +
                           "id:       " + getId()+"\n" +
                           "View:     " + getView() + "\n" +
                           "Age:      " + getAge() + "\n" +
                           "Nickname: " + getNickname());
    }

    // Additional methods:    (Дополнительные методы)
    public void sleep(){
        System.out.println(getView() + " " + getNickname() + " is sleeping.");
    }
    public void eat(){
        System.out.println(getView() + " "+ getNickname() + " is eating.");
    }
    public void makeSound(){          // (издавать звук)
        System.out.println(getView() + " "+ getNickname() + " makes a sound.");
    }
    public void play(){
        System.out.println(getView() + " "+ getNickname() + " is playing.");
    }
    public void walk(){
        System.out.println(getView() + " "+ getNickname() + " is walking.");
    }

} // End of class
