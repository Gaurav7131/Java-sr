//Parent class>Parent constructor>Parent method>Child class extends parent class>Child constructor SUper()>Child Method>main method instnaceof test
class BasicPhone {
    String brand = "Nokia";

    // Parent class Constructor
    BasicPhone() {
        System.out.println("Just calling Feature");
    }

    // Parent method
    void Calling() {
        System.out.println("Ringing");
    }
}

// child class
class SmartPhone extends BasicPhone {
    String feature = "5G Internet";

    // child construcotr with super() method
    SmartPhone() {
        super();// caling parent class constructor to invoke all parent methods,var
        System.out.println("Internet Speeding");

    }

    // child method
    void SmartDetails() {
        System.out.println("Details of SmartPhone:" + super.brand);
        super.Calling();
        System.out.println("Feature:" + feature);
    }
}

public class Inheritace {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.SmartDetails();

        // instanceof() operator test to evaluate that sp object belongs to parent class
        // or not
        if (sp instanceof BasicPhone) {
            System.out.println("Yes it belongs");
        } else {
            System.out.println("Not belongs");
        }

    }

}
