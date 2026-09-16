import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class Java20FeatForeignMemoryEx {
    public static void main(String[] args) {
        // confined memory allocation guaranteed lifetime persist
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment segment = arena.allocate(16);

            segment.set(ValueLayout.JAVA_INT, 0, 42);

            int var = segment.get(ValueLayout.JAVA_INT, 0);
            System.out.println("Retrive Native Memory:" + var);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
