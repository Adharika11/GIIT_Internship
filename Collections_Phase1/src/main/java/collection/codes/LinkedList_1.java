package collection.codes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_1 {
        public static void main(String[] args) {
            LinkedList<Integer> l = new LinkedList<Integer>();
            l.add(10);
            l.add(20);
            l.add(30);
            if(l.contains(20)){
                System.out.println("Present");
            }
            Iterator itr=l.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }

        }
    }












