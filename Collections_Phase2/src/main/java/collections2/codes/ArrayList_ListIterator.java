package collections2.codes;
import java.util.*;
public class ArrayList_ListIterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("Hello");
        al.add(30);
        al.add(40);
        ListIterator it = al.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}