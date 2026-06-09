//Proof that Java is passby value only not pass by reference
class Tv {
    String name = "Sony";// Original name
}

public class SimpleProof {
    public static void main(String[] args) {
        Tv myTv = new Tv();

        // we are sending remotecopy to method and try to pass obj as a ref to method

        tryToChangeTv(myTv);

        // This is the proof that java is pass by value here will be print Sony rather
        // than Samsung
        System.out.println("My tv name is :" + myTv.name);

    }

    // we used static here because we wanna call to main method its it static so we
    // had to written here static in order to call main method we we remove static
    // it shows static context error
    static void tryToChangeTv(Tv remoteCopy) {
        remoteCopy = new Tv();
        remoteCopy.name = "Samsung";

    }
}
