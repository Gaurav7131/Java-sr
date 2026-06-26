class Address implements Cloneable {
    String city;

    public Address(String city) {
        this.city = city;
    }

    // protected copy
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

// main class
class Employee implements Cloneable {
    int id;
    String name;
    Address address;// connect address to Employee

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // public deep copy
    public Object clone() throws CloneNotSupportedException {
        // shallow copy-super
        Employee cloneEmp = (Employee) super.clone();

        // deep copy-this
        cloneEmp.address = (Address) this.address.clone();

        return cloneEmp;

    }
}

public class DeepCopyVsShallowCopy {
    public static void main(String[] args) {

        try {

            Address add = new Address("Pune");
            // original copy
            Employee emp1 = new Employee(1, "One", add);
            // deep cpy
            Employee emp2 = (Employee) emp1.clone();

            System.out.println("Before");
            System.out.println("Original:" + emp1.address.city);
            System.out.println("Clone:" + emp2.address.city);

            emp2.address.city = "Mumbai";
            System.out.println("After Altering loc:");
            System.out.println("Deep copy:" + emp2.address.city);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
