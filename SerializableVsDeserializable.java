import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializableVsDeserializable {
    public static void main(String[] args) {
        Student s = new Student(1, "Gaurav");

        try {
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);// Object->Bytes

            fos.close();
            oos.close();

            System.out.println("Serialization Done");

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Deserialization: Decode Byte into Object
        try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s2 = (Student) ois.readObject();// Bytes -> Object

            ois.close();
            fis.close();

            System.out.println("DeSerialization:" + s2.name);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
