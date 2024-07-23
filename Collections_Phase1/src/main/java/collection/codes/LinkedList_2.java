package collection.codes;
import java.util.*;

public class LinkedList_2 {
    public static void main(String[] args) {
        List<String>l=new LinkedList();
        l.add("hello");
        l.add("happy");
        l.add("world");
        if(l.contains("world")){
            System.out.println("Present");
        }
        l.set(2,"girl");
        l.remove(0);
        Iterator itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        }
    }

