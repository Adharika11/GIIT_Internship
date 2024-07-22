package collection.codes;

import static java.lang.Integer.valueOf;

public class Boxing {
    public static void main(String[] args) {
        int a=10;
        System.out.println("Converting primitive data type a into Object");
        Integer i = Integer.valueOf(a);
        Integer b = a; //auto-boxing
        System.out.println("Value of object : "+b);
    }
}
