package collection.codes;

import java.util.*;

public class TreeSet_1 {
        public static void main(String[] args) {
            Set<Integer> h=new TreeSet<Integer>();
            //implements binary tree thus O(logn) , thus it prints elements in sorted order but uniquely.
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




