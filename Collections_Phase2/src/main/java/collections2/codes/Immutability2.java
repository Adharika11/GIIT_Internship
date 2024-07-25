package collections2.codes;
import java.util.*;
public class Immutability2 {
    public static void main(String[] args) {
                List<String> immutableList = List.of("Apple", "Banana", "Cherry");

                // Attempt to modify the immutable list
                try {
                    immutableList.add("Date"); // Throws UnsupportedOperationException
                } catch (UnsupportedOperationException e) {
                    System.out.println("Cannot modify immutable list.");
                }
                System.out.println("Immutable List: " + immutableList);
            }
        }


