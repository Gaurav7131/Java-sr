class Section {
    int BALANCE = 0;// shared resouce

    public void increment() {
        // critical section start
        BALANCE++;
        // critical section end
    }
}

public class CriticalSection {
    public static void main(String[] args) {
        Section s = new Section();
        s.increment();
        System.out.println("Balance:" + s);

    }
}
