//(waiter)
class Waiter extends Thread {
    String name;

    Waiter(String name) {
        this.name = name;
    }

    // task-Process
    public void run() {
        for (int i = 0; i <= 3; i++) {

            try {
                Thread.sleep(1000);// wait for 1 min
                System.out.println(name + " is serving:" + i);// print name + servant
            } catch (InterruptedException e) {
                System.out.println("Error:" + e.getMessage());

            }
        }
    }

}

public class MultithreadingExtendsThread {
    public static void main(String[] args) {
        Waiter w = new Waiter("Ram");
        Waiter w2 = new Waiter("Shyam");

        // start
        w.start();
        w2.start();// both worked parallely

    }

}
