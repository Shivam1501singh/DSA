import java.util.*;
public class pract {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Mango");
        Iterator<String> iterator = set.iterator();
        System.out.println("Elements in the set:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
