package collections2.codes;
import java.util.*;
public class ArrayList_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
