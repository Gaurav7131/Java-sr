enum Priority {
    INFO(10),
    WARNING(20),
    EMERGENCY(30);

    int setPriority;

    // construcotor for Priorty no set
    Priority(int setP) {
        setPriority = setP;

    }

    // method to get Priority
    public int getPriority() {
        return setPriority;
    }
}

public class MsgEnum {
    public static void main(String[] args) {
        System.out.println("Priority Levels");

        Priority myPriority = Priority.EMERGENCY;
        System.out.println("URs prioirty is:" + myPriority);
        System.out.println("Levels of priority" + myPriority.getPriority());

        // compare
        if (myPriority == Priority.EMERGENCY) {
            System.out.println("Ready to take actions");
        } else {
            System.out.println("Ignore it");

        }
        // check avaiabalble one and their setp not dependasnt on first get method
        // for(variable)
        for (Priority p : Priority.values()) {
            System.out.println("Priority is" + p.getPriority());
        }
    }
}
