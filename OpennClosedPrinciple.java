interface Gamecd {
    void start();
}

// old class
// class1;MArio
class Mario implements Gamecd {
    public void start() {
        System.out.println("Mario Start");
    }
}

// class2:Spiderman
class Spiderman implements Gamecd {
    public void start() {
        System.out.println("Spiderman Starting");
    }
}

// new class adding Open for Extension
class GTA implements Gamecd {
    public void start() {
        System.out.println("GTA Starting");
    }
}

// Closed for Modification
class Playstation {
    public void playGame(Gamecd cd) {
        cd.start();
    }
}

class OpennClosedPrinciple {
    public static void main(String[] args) {
        Playstation ps = new Playstation();

        // insert cd
        // insert Mario cds
        Mario mr = new Mario();
        ps.playGame(mr);

        // insert SPiderman
        Spiderman sm = new Spiderman();
        ps.playGame(sm);

        // insert Gta cd
        GTA gta = new GTA();
        ps.playGame(gta);
    }
}
