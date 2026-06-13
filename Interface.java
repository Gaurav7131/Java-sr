interface Cricket {
    // fixed
    int TEAM_SIZE = 11;

    // asbstract method has no body so>
    void PlayBatting();

    void PlayFielding();
}

// Contract signed class so implememts interface
class Player implements Cricket {
    public void PlayBatting() {
        System.out.println("Batting");

    }

    public void PlayFielding() {
        System.out.println("Fielding");
    }
}

// main class
public class Interface {
    public static void main(String[] args) {
        Player virat = new Player();

        virat.PlayBatting();
        virat.PlayFielding();

        System.out.println("Team Size is:" + Cricket.TEAM_SIZE);

    }
}