import java.util.ArrayList;
import java.util.List;

public class Java12FeatShenanDoahGcEx {
    public static void main(String[] args) {
        List<Byte[]> memoryBurner = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            memoryBurner.add(new Byte[1024 * 1024 * 2]);// allocate 2MB
        }
        System.out.println("Allocate Chunks");
        memoryBurner.clear();// frees up shenandoah GC
        System.gc();
        System.out.println("Cleans up Memory within subMls");
    }
}
