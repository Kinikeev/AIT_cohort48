package class_work_27.json_wrapper.wrapper_no_generics;

public class JsonWrapper {

    // формат JSON
    private Object value;
    // constructor

    public JsonWrapper(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: " + value + "}";
    }
}
