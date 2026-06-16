//Violation of Liskow Substitution
class Bird {
    void fly() {
        System.out.println("fly");
    }
}

// child class
class Ostrich extends Bird {
    void fly() {
        throw new RuntimeException("Can't fly");
    }
}

// Correct way
// parent class>Childclass for flyingbird 2)Childclass for NonFlyingBird
class CoBird {
    // coomon actiity of bird thats 2 cat can do it
    void eat() {
        System.out.println("Eat");
    }
}

// chidl class1 for FlyingBird
class FlyingBird extends CoBird {
    void canfly() {
        System.out.println("fly");
    }
}

// chidl class2 for NonFlyingBird
class NonFlyingBird extends CoBird {
    void runFast() {
        System.out.println("Ostrich");
    }
}

class LisKovSubsti {
    public static void main(String[] args) {
        CoBird cb = new FlyingBird();// parenrt class obj with Cild class obj with()
        cb.eat();
        // cb.fly(); fly cant access because its safe but we can call them using child
        // class obj>child class method
        FlyingBird fb = new FlyingBird();
        fb.canfly();

    }
}
