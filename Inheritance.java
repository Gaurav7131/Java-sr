//Parent class
class Vehicle {
    int speed;

    void run() {
        System.out.println("vehicle is running" + speed + "mph");
    }

}

// child class
class Car extends Vehicle {
    void TurnonAc() {
        System.out.println("Turning on ac");
    }
}

// child class
class Bicycle extends Vehicle {
    void walk() {
        System.out.println("bycycle is walking");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run();

        Bicycle bicycle = new Bicycle();
        bicycle.walk();
        bicycle.run();// bycyle can do both because we extend vehicle class

        Car car = new Car();
        car.TurnonAc();
        car.run();// car can do both

    }

}
