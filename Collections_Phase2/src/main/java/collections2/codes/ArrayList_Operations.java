package collections2.codes;
import java.util.*;
public class ArrayList_Operations {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(20);
        al.add(67);
        al.add(40);
        al.add(90);

        //Inserting at end (by default insertion takes place at end)
        al.add(40);
        System.out.println(al);

        //Access elements
        System.out.println(al.get(2));

        //Inserting at specified position (first or middle) - O(n) since this shifting take place implicitly
        al.add(2,40);
        System.out.println(al);

        //remove at specified position
        al.remove(1);
        System.out.println(al);

        //removing all elements
        al.removeAll(al);
        System.out.println(al);
    }
}
