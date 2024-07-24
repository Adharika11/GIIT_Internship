package collection.codes;
import java.util.*;
public class Vector_1 {
    public static void main(String[] args) {
        Vector<Integer>list=new Vector<>();
        list.add(10);
        list.add(30);
        list.add(40);
        Enumeration e=list.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }

}
