public class generic<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public static void main(String[] args) {
        // Creating a generic for Integer
        generic<Integer> integergeneric = new generic<>();
        integergeneric.setData(123);
        System.out.println("Integer value: " + integergeneric.getData());

        // Creating a generic for String
        generic<String> stringgeneric = new generic<>();
        stringgeneric.setData("Hello, World!");
        System.out.println("String value: " + stringgeneric.getData());
    }
}
