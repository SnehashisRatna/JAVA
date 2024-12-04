import java.util.*;

public class LL {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        System.out.println(list);

        list.addLast("list");
        list.add("of");
        list.add("string");
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == "of") {
                System.out.println(i);
            }

            System.out.print(list.get(i) + "->");
        }
        System.out.println("null");

        list.remove(3);
        System.out.println(list);

    }
}
