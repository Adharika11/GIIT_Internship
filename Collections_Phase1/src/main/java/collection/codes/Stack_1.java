package collection.codes;
import java.util.*;
public class Stack_1 {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack <Integer>();
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Top element: "+st.peek());
        st.pop();
        ListIterator<Integer> itr=st.listIterator(st.size());
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }


    }
}
