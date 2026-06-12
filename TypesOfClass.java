//POJo class hold only variables,getter setter method
class ToyData {
    String name = "Baby Toy";
}

// abstract class has no body,incomlete blueprint and task too
abstract class Blueprint {
    abstract void Play();
}

// concentrete(comlete fully functional class)+final(treasure) class hired to
// complete incomlete task of abstarct class
final class Robot extends Blueprint {

    // nested class
    class Battery {

        void Power() {
            System.out.println("Power is On");
        }
    }

    void Play() {
        System.out.println("Playing");// incomplete task comleted here
    }
}

public class TypesOfClass {
    public static void main(String[] args) {
        Robot myRobot = new Robot();
        myRobot.Play();

        // nested class obj
        Robot.Battery battery = myRobot.new Battery(); // varible Rbot class's because Battery>>Power (inner class)
        battery.Power();

        // anonymous class dont have name,work like intern do their work and on the fly
        Blueprint b = new Blueprint() {
            void Play() {
                System.out.println("Magic");
            }
        };
        b.Play();

    }
}