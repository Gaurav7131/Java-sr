//Private Method Interface:allow sharing common code between defaultor static method within interface without exposing helper method to implementation classes
interface DbInfo {
    default void logInfo(String msg) {
        log("info", msg);
    }

    default void logError(String msg) {
        log("Error", msg);
    }

    static void log(String level, String msg) {
        System.out.println("[" + level + "]" + msg);
    }
}

public class PrivateMethodInterfaceEx {
    public static void main(String[] args) {
        System.out.println("Logging:" + DbInfo.class);
    }
}
