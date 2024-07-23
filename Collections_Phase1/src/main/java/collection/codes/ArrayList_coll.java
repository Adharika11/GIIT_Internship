package collection.codes;
import java.util.*;
public class ArrayList_coll {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();
        str.add("Mohan");
        str.add("Rohan");
        str.add("Saloni");
        str.add("Medhavi");
        System.out.println("At index 3: " + str.get(3));
        System.out.println("List elements: ");
        for (String s : str) {
            System.out.println(s);
        }
        str.remove(2);
        Iterator itr = str.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}




