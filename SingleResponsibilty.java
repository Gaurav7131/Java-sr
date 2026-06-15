//Voilating SRP beacuase One class>Diffenent Resp/Action/Job|| on man 3 task that's unfair
class Restaurant {
    // Cooking
    void cookRest() {
        System.out.println("Cooking");
    }

    // Cashier
    void cashRest() {
        System.out.println("Cashier");
    }

    // Cleaning
    void cleanRest() {
        System.out.println("Cleaning");
    }

}

// Correct Way SRP: Single class-SIngle Resp/Action/Job ||1-1
// Class 1:Cooking
class Chef {
    void cookRest() {
        System.out.println("Cooking");
    }

}

// Class2:Cashier
class Cashier {
    void cashRest() {
        System.out.println("Cashier");
    }
}

// class3:Cleaning
class Cleaning {
    void cleanRest() {
        System.out.println("Cleaning");
    }
}

class SingleResponsibilty {
    public static void main(String[] args) {
        Chef c = new Chef();
        c.cookRest();

        Cashier cs = new Cashier();
        cs.cashRest();

        Cleaning cl = new Cleaning();
        cl.cleanRest();

    }
}