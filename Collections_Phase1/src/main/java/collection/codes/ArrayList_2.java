package collection.codes;
import java.util.*;
public class ArrayList_2 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList();
            l.add(10);
            l.add(20);
            l.add(30);
            if(l.contains(20)){
                System.out.println("Present");
            }
            List<Integer>list=new ArrayList();
            list.add(20);
            list.add(50);
            list.add(60);
//            l.addAll(list);
        Iterator itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Retain");
        l.retainAll(list);
        Iterator it=l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Remove");
        l.removeAll(list);
        l.add(80);
        Iterator i=l.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }






    }
}










