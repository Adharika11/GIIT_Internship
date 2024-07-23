package collection.codes;

import java.util.*;

public class LinkedHashSet_1 {
        public static void main(String[] args) {
            LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
            h.add(10);
            h.add(20);
            h.add(20);
            h.add(40);
            h.add(50);
            System.out.println(h);
            System.out.println(h.remove(20));
            System.out.println(h.size());
            System.out.println(h);
            h.clear();
            System.out.println(h);
        }
    }


