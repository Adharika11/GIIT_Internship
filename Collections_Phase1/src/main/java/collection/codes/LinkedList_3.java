package collection.codes;
import java.util.*;
public class LinkedList_3 {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.poll();
        q.offer(90);
        Iterator itr=q.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
