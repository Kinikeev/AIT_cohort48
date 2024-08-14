package class_work_27.json_wrapper.wrapperWithGenerics;

public class WrappelAppl {
    public static void main(String[] args) {

        JsonWrapper<String> wrapper = new JsonWrapper<>("10");
        System.out.println(wrapper.toString());
        System.out.println(wrapper);
        System.out.println("-----------------------------------------------");

        int a = Integer.parseInt( wrapper.getValue());
        System.out.println(a * 30);
        System.out.println("------------------------------------------------");

        JsonWrapper<Integer> numWrapper = new JsonWrapper<>(10);
        System.out.println(numWrapper.toString());
        System.out.println(numWrapper.getValue());
        System.out.println(numWrapper.getValue() * 7);



    }
}
