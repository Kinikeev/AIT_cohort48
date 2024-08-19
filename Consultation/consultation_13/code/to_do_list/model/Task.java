package to_do_list.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Task {

    /*
        # Задание
Реализуйте класс Task:
- id - порядковый номер задачи
- task - содержание задачи
- priority - приоритет задачи
- data - контрольный срок выполнения задачи
- status
Спроектируйте и реализуйте интерфейс ToDoList
Реализуйте тесты ToDoListTest и имплементацию ToDoListImpl.
     */

    // fields
    private Integer id;
    private String task;
    private String priority;
    private Boolean status;
    private LocalDateTime dateOfCreate;
    private LocalDate deadLine;

    // constructor
    public Task(Integer id, String task, Boolean status, String priority, LocalDateTime dateOfCreate, LocalDate deadLine) {
        this.id = id;
        this.task = task;
        this.status = status;
        this.priority = priority;
        this.dateOfCreate = dateOfCreate;
        this.deadLine = deadLine;
    }

    // getters and setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public LocalDateTime getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(LocalDateTime dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Task task1)) return false;
        return Objects.equals(id, task1.id) && Objects.equals(task, task1.task) && Objects.equals(priority, task1.priority) && Objects.equals(status, task1.status) && Objects.equals(dateOfCreate, task1.dateOfCreate) && Objects.equals(deadLine, task1.deadLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, task, priority, status, dateOfCreate, deadLine);
    }

    @Override
    public String toString() {
        return String.format("Task: id - %d, task - %s, priority - %s, status - %s, created: %s, deadline: %s",
                id, task, priority, status, dateOfCreate, deadLine);
    }
} // End of class
