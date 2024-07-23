package collection.codes;
import java.util.*;
public class PriorityQ {
    public static void main(String[] args) {
        // by default min-heap is executed
        Queue<Integer> q = new PriorityQueue<>();
        q.offer(12);
        q.offer(10);
        q.offer(22);
        q.poll();
        Iterator itr = q.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Queue<Integer> qu = new PriorityQueue<>(Comparator.reverseOrder());
        qu.offer(12);
        qu.offer(10);
        qu.offer(22);
        qu.poll();
        Iterator it = qu.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }


}
