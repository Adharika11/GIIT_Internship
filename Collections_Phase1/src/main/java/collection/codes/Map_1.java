package collection.codes;
import java.util.*;
public class Map_1 {
    public static void main(String[] args) {

            Map<String, Integer> numbers = new HashMap<>();

            numbers.put("One", 1);
            numbers.put("Two", 2);
            numbers.put("Three", 3);
            numbers.put("Four", 4);
            numbers.put("Five", 5);
            for (Map.Entry<String, Integer> e: numbers.entrySet()) {
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

            numbers.remove("Three");

        if(!numbers.containsKey("Two")) {
            numbers.put("Two", 23);
        }

            numbers.putIfAbsent("Six", 23);
            System.out.println(numbers);
            System.out.println(numbers.containsValue(3));

            System.out.println(numbers.isEmpty());

        }
    }

