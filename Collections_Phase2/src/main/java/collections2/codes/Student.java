package collections2.codes;
import java.util.*;
class Student implements Comparable<Student> {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age,other.age); // Natural ordering by name
    }
    @Override
    public String toString() {
        return name + " " + age;
    }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 25));
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 23));
        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
