class Base {
    // private var
    private String name = "Confidential";
    private int age = 0;

    // Rule:its protected but in child class we can reduce its visibility to Public
    // only Public
    protected void Show() {
        System.out.println("Protected");
    }

    // private var age can we can accesses by using only setter method now
    public void Setage(int setage) {
        if (setage < 0) {
            System.out.println("Opps age cannot be less than 0");
        } else {
            this.age = setage;// if age is valid trch add kr setage mdhe
            System.out.println("Current age" + setage);
        }
    }

    public void Setname(String setname) {
        if (setname == name) {
            System.out.println("Name Matched");
        } else {
            this.name = setname;// if age is valid trch add kr setage mdhe
            System.out.println("Current Name" + setname);
        }
    }
}

// child class
class Child extends Base {
    // Look we used Public here reduced visibilty and we overriden method same names
    @Override
    public void Show() {
        System.out.println("public");

    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.Show();

        Base b = new Base();
        b.Setage(-1);// setage
        b.Setname("Confidential");// setname if i changed string it goes in else
    }

}