import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class Java19FeatForeignMemEx {
    public static void main(String[] args) {
        // Safe, confined off-heap native memory allocation in Java 19 rather than
        // Arena/ResourceScope
        try (MemorySession session = MemorySession.openConfined()) {
            MemorySegment segment = scope.allocate(64);

            // Write a 32-bit int at byte offset 0
            segment.set(ValueLayout.JAVA_INT, 0, 1024);

            // Read the value back safely
            int val = segment.get(ValueLayout.JAVA_INT, 0);
            System.out.println("Retrieved Off-Heap Native Value: " + val);
        } // Native memory is automatically unmapped and released here
    }
}