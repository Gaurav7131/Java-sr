import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class Java18FeatForeignMemoryEx {
    public static void main(String[] args) {
        /*
         * Connecting Java to native C libraries, allocating 64-byte off-heap memory
         * to eliminate writing verbose wrappers or calling dangerous methods
         * like sun.misc.Unsafe via JNI (Java native Interface).
         * Confined scope controls the native memory allocation lifetime
         */
        try (Arena scope = Arena.ofConfined()) {
            MemorySegment segment = scope.allocate(64);// allocate 64 byte

            // MemorySegment handles primitive read/write on a segment
            segment.set(ValueLayout.JAVA_INT, 0, 1024);

            int val = segment.get(ValueLayout.JAVA_INT, 0);
            System.out.println("Retrieved Off-Heap Native Value: " + val);
        } // Scope closes and frees off-heap memory safely
    }
}