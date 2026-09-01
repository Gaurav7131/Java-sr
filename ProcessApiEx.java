//ProcessHandle to retrieve PIDs, process info, destroy process trees, and register asynchronous exit hooks
public class ProcessApiEx {
    public static void main(String[] args) throws IllegalStateException {
        ProcessHandle current = ProcessHandle.current();
        System.out.println("PID:" + current.pid());
        current.info().command().ifPresent(cmd -> System.out.println("Command" + cmd));
        current.onExit().thenAccept(c -> System.out.println("Process" + c.pid() + "exited"));
        current.destroy();

    }
}
