import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.rollno, s.rollno);
    }

    @Override
    public String toString() {
        return rollno + " rollno " + name + " name ";
    }
}

// sep class for Comparator
class NameStudent implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparableVsComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Virat"));
        students.add(new Student(3, "Bethel"));
        students.add(new Student(9, "Tilak"));

        // Comaparable
        Collections.sort(students);
        System.out.println("Roll no sorting:");

        // comparator> call comparator created class obj
        Collections.sort(students, new NameStudent());
        System.out.println("Name sorting:" + students);
    }
}