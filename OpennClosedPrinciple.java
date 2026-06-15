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

/*
 * class PlayStation{
 * public void PlayGame(String game){
 * if(game.equals(Mario)){
 * Sout("Mario st ");
 * }else if (game.equals(Spiderman)){
 * SOut("Spiderman Starting");
 * }
 * //if we want to add new features or game we want to make chnages in if/else
 * loop
 * if could halt other program flow =(tight coupling)
 * }
 * 
 */