package collections2.codes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList_Comparator implements Comparable<ArrayList_Comparator> {
    String name;
    int age;

    // Constructor
    ArrayList_Comparator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override the compareTo method for natural ordering by age
    @Override
    public int compareTo(ArrayList_Comparator other) {
        return Integer.compare(this.age, other.age);
    }
    @Override
    public String toString() {
        return name + " " + age;
    }
    static class NameComparator implements Comparator<ArrayList_Comparator> {
        @Override
        public int compare(ArrayList_Comparator o1, ArrayList_Comparator o2) {
            return o1.name.compareTo(o2.name); // Sort alphabetically by name
        }
    }

    static class AgeComparator implements Comparator<ArrayList_Comparator> {
        @Override
        public int compare(ArrayList_Comparator o1, ArrayList_Comparator o2) {
            return Integer.compare(o1.age, o2.age); // Sort numerically by age
        }
    }

    public static void main(String[] args) {
        // Create an ArrayList of ArrayList_Comparator objects
        ArrayList<ArrayList_Comparator> list = new ArrayList<>();
        list.add(new ArrayList_Comparator("Alice", 22));
        list.add(new ArrayList_Comparator("Bob", 23));
        list.add(new ArrayList_Comparator("Charlie", 21));

        // Print the original list
        System.out.println("Original list:");
        System.out.println(list);

        // Sort by natural order (age) using Comparable
        Collections.sort(list);
        System.out.println("\nSorted by age (natural order):");
        System.out.println(list);

        // Sort by name using NameComparator
        Collections.sort(list, new NameComparator());
        System.out.println("\nSorted by name:");
        System.out.println(list);

        // Sort by age using AgeComparator (to show sorting by age again)
        Collections.sort(list, new AgeComparator());
        System.out.println("\nSorted by age (using AgeComparator):");
        System.out.println(list);
    }
}
