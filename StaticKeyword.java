class Base {
    // static method dont need to create obj
    static void display() {
        System.out.println("Base class");
    }

    // non static dynamic binding
    void show() {
        System.out.println("non static method in base");
    }
}

// child class
class Child extends Base {
    static void display() {
        System.out.println("Static method in BAse");
    }

    // overloaded method
    void show() {
        System.out.println("Non static method in Child");
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        // dynaimic binding method overriding extend base with Child Subclass
        Base b = new Child();
        // compile time compiler know which method he has to called
        b.display();
        // dynamic runtime jvm decide the obj
        b.show();

    }

}
