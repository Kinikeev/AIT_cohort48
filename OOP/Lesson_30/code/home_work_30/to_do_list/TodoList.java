package home_work_30.to_do_list;

public enum TodoList {

    ADD(1, "Добавить задачу",1),
    VIEW(2, "Посмотреть все задачи",2),
    DELETE(3, "Удалить задачу (по номеру)",3),
    EXIT(4, "Выйти из меню",4);


    // fields
    private int number;
    private String action;
    private int choice;

    // constructor
    TodoList(int number, String action,int i) {
        this.number = number;
        this.action = action;
        this.choice = i;
    }
    // getters
    public int getNumber() {
        return number;
    }
    public String getAction() {
        return action;
    }
    public int getChoice() {
        return choice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TodoList{");
        sb.append("number=").append(number);
        sb.append(", action='").append(action).append('\'');
        sb.append('}');
        return sb.toString();
    }
} // End of enum
