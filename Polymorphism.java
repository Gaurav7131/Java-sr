class VideoGameChar {
    void attack() {
        System.out.println("Attack button basics features");
    }
}

class Knight extends VideoGameChar {
    @Override
    void attack() {
        System.out.println("Knight swing the sword");
    }
}

class Wizard extends VideoGameChar {
    @Override
    void attack() {
        System.out.println("Wizards throwing fireball");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Knight kn = new Knight();
        kn.attack();

        Wizard wz = new Wizard();
        wz.attack();

    }
}
