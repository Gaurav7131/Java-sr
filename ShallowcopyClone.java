class Employee implements Cloneable {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // shallow copy
        return super.clone();

    }
}

public class ShallowcopyClone {

    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee(1, "Ajay");

            Employee emp2 = (Employee) emp1.clone();

            System.out.println("Original:" + emp1.name);
            System.out.println("Clone:" + emp2.name);

            // chnaged name
            emp2.name = "Rahul";

            System.out.println("Original:" + emp1.name);
            System.out.println("Clone:" + emp2.name);

        } catch (CloneNotSupportedException e) {
            e.getMessage();
        }

    }
}
