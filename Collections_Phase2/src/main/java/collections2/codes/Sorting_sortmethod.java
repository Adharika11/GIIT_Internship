package collections2.codes;
import java.util.*;
public class Sorting_sortmethod {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(50);
        al.add(30);
        al.add(40);
        ListIterator it = al.listIterator();
        Collections.sort(al);
        Collections.reverse(al);
        System.out.println(al);
    }
}
