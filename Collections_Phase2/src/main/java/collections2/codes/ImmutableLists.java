package collections2.codes;
import java.util.*;
public class ImmutableLists {
        public static void main(String[] args) {
            List<String> modifiableList = new ArrayList<>();
            modifiableList.add("Apple");
            modifiableList.add("Banana");
            modifiableList.add("Cherry");
            List<String> immutableList = Collections.unmodifiableList(modifiableList);
            try {
                immutableList.add("Date"); // Throws UnsupportedOperationException
            } catch (UnsupportedOperationException e) {
                System.out.println("Cannot modify immutable list.");
            }
            System.out.println("Immutable List: " + immutableList);
        }
    }

