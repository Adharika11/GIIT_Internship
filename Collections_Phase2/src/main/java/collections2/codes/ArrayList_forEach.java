
    package collections2.codes;
import java.util.*;

    public class ArrayList_forEach {
        public static void main(String[] args) {
            ArrayList<String> al=new ArrayList<String>();
            al.add("Adharika");
            al.add("Pranjal");
            al.add("Pooja");
            al.add("Khushi");
            for(String str : al){
                System.out.println(str);
            }
        }
    }


