import java.util.HashMap;
import java.util.Objects;

class Student {

    int rollno;

    Student(int rollno) {

        this.rollno = rollno;
    }

    // hashcode
    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        return rollno == ((Student) obj).rollno;

    }
}

public class StudentHashcodeNEquals {
    public static void main(String[] args) {
        HashMap<Student, String> register = new HashMap<>();

        Student rn = new Student(10);
        register.put(rn, "Origignal rn");
        System.out.println("Orignal rn:" + register.get(rn));

        // changed rollno: lost key Problem
        rn.rollno = 101;

        System.out.println("Altered rollno:" + register.get(rn));

    }

}
