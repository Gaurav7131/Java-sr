import java.util.Arrays;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;

    // constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // call method
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class StreamOps {
    public static void main(String[] args) {
        // Convert Stream to Arrays
        String[] str = { "Apple", "Bat", "Cat", "Dog" };
        System.out.println("Stream to Arrays:");

        Arrays.stream(str)// convyeor start
                .filter(w -> w.length() > 3)// filter word > 3
                .map(String::toUpperCase) // capitalized word
                .forEach(System.out::println);// terminal

        // Convert List to Map
        List<Student> l = Arrays.asList(
                new Student(1, "One"),
                new Student(2, "Two"),
                new Student(3, "Three"));

        System.out.println("List to Map:");
        Map<Integer, String> m = l.stream()// conveyor
                .collect(Collectors.toMap(Student::getId, Student::getName));// terminal

        System.out.println(m);

        // Stream:one thread at a time,but ordered
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream().forEach(System.out::println);

        // ParallelStream:muttipler worker(threads) at the same time so random order
        list.parallelStream().forEach(System.out::println);

    }

}
