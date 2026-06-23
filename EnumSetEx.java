import java.util.EnumSet;

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, FRIDAY
}

public class EnumSetEx {
    public static void main(String[] args) {
        EnumSet<Days> d = EnumSet.of(Days.FRIDAY, Days.MONDAY);

        System.out.println("Days:" + d);
    }
}
