
// import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ArrayLists {
    public static void main(String args[]) {
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // list.add(0);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(6);
        // list.add(8);
        // System.out.println(list);

        // // get elemnt ;
        // int elemnt = list.get(3);
        // System.out.println(elemnt);

        // // add el in element
        // list.add(1, 1);
        // System.out.println(list);

        // // set element
        // list.set(0, 5);
        // System.out.println(list);

        // // delet element
        // list.remove(5);
        // System.out.println(list);

        // // rsize
        // int size = list.size();
        // System.out.println(size);

        // // loop
        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i));
        // }
        // System.out.println();

        // // sorting
        // Collections.sort(list);
        // System.out.println(list);

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
