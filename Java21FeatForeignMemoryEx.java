
// Requires: --enable-preview
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class Java21FeatForeignMemoryEx {
    public static void main(String[] args) {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment segment = arena.allocate(8);
            segment.set(ValueLayout.JAVA_LONG, 0, 42L);
            System.out.println("Off-heap value: " + segment.get(ValueLayout.JAVA_LONG, 0));
        }
    }
}