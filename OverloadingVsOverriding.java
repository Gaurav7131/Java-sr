class VideoGameCharacter {
    // fixed var size
    final int MAX_SIZE = 100;

    // final we can override it call only in main method
    final void showHealth() {
        System.out.println("SHow helath");
    }

    // method used for method overloading same name diff para
    void attack() {
        System.out.println("attack");
    }

    void attack(String weapon) {
        System.out.println("Attackin with weapon" + weapon);
    }

    // method used for method oevrrring
    void war() {
        System.out.println("war");

    }
}

// chidl class-Wizard
class Wizard extends VideoGameCharacter {
    // override method
    @Override
    void war() {
        System.out.println("Fireball");

    }
}

// child class-Knight
class Knight extends VideoGameCharacter {
    @Override
    void war() {
        System.out.println("Sword");

    }
}

public class OverloadingVsOverriding {
    public static void main(String[] args) {
        VideoGameCharacter vc = new VideoGameCharacter();

        System.out.println("Ovevloaded method");
        vc.attack("Axe");
        vc.attack();

        vc.showHealth();// method called directly
        System.out.println("MAx szie is" + vc.MAX_SIZE);// variable so called using sout

        // Dynamic binding = Run-time polymorphism
        System.out.println("Dynamic Binding");
        VideoGameCharacter player1 = new Knight();
        VideoGameCharacter player2 = new Wizard();

        player1.war();
        player2.attack("Hammer");

    }
}
