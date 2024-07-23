package collection.codes;
import java.util.*;
public class HashSet_1 {
    public static void main(String[] args) {
        HashSet<Integer>h=new HashSet<Integer>();
        h.add(10);
        h.add(20);
        h.add(20);
        h.add(40);
        h.add(50);
        System.out.println(h);
        System.out.println(h.remove(20));
        System.out.println(h.size());
        h.clear();
        System.out.println(h);
    }
}
