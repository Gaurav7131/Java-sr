//Violation os ISP
interface Printer {
    void Print();

    void Fax();

    void Scan();
}

class Machine implements Printer {
    public void Print() {
        System.out.println("Print");
    }

    public void Fax() {
        System.out.println();
    }

    public void Scan() {
        System.out.println("Scanning");
    }
}

// Correct way Sep interface for Spe method like SRP|| one interface one method
// (action/Respo)
interface ProPrinter {
    void Print();
}

interface Scanner {
    void Scan();
}

interface Fax {
    void fax();
}

// class signing interface that they want to do client should not be forced to
// implement interface that they dont do
class Machine1 implements ProPrinter {
    public void Print() {
        System.out.println("Printing");
    }
}

public class InterfaceSegreg {
    public static void main(String[] args) {
        // Printer m = new Machine();
        // m.Print();

        ProPrinter p = new Machine1();
        p.Print();

    }
}
