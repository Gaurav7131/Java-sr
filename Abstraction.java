abstract class Tv {
    // no code just absract method asbtarct method dont have [body] and need
    // abstract [class] also , we cant instiatitate abstract class in main method
    abstract void turnonTv();
}

class SmartTv extends Tv {
    void turnonTv() {
        System.out.println("turning on tv");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        SmartTv sTv = new SmartTv();
        sTv.turnonTv();
    }

}
