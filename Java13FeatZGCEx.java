import java.util.ArrayList;
import java.util.List;

public class Java13FeatZGCEx {
    public static void main(String[] args) {
        List<Byte[]> memBurner = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            memBurner.add(new Byte[1024 * 1024 * 2]);// Allocate 2MB
        }
        System.out.println("Allocated Chunk");
        memBurner.clear();// Clean unused uncommitedmem by zgc
        System.gc();
        System.out.println("Zgc Ops Successfully");

    }
}
