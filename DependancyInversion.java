//Contract: Bluetooth
interface GameController {
    void PressButton();
}

// Attach Gadget>> Low-level Module
// Gadget 1:Gun
class Gun implements GameController {
    public void PressButton() {
        System.out.println("Gun Shoot");
    }
}

// Gadget 2:Joystick
class Joystick implements GameController {
    public void PressButton() {
        System.out.println("Joystick");
    }
}

// High-Level module>PlayStation
// Play station not depend on gun or joystick they dont care they are exist or
// not they dpeend on GameCtrler
class PlayStation {
    private GameController controller;

    // Dependacy Inversion as we can add new gadget
    public PlayStation(GameController controller) {
        this.controller = controller;
    }

    public void PlayGame() {
        controller.PressButton();

    }
}

class DependancyInversion {
    public static void main(String[] args) {
        // attached Gun
        GameController gc = new Gun();
        PlayStation ps = new PlayStation(gc);
        ps.PlayGame();

        // attaxh Joystick
        GameController gc2 = new Joystick();
        PlayStation ps2 = new PlayStation(gc2);
        ps2.PlayGame();

    }
}