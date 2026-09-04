//JEP 333/JEP 777(A scalable low lvl latency ZGC):1)colored ptr(store gc metadata) 2)load barrier(JIT injected checks)

import java.util.ArrayList;
import java.util.List;

public class Java11FeatZGCDemo {
    public static void main(String[] args) {
        List<Byte[]> memBurner = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            memBurner.add(new Byte[1024 * 1024 * 2]);// Allocate 2MB chunks
        }
        System.out.println("Allocating Chunks");
        memBurner.clear();// frees up mem for ZGC
        System.gc();
        System.out.println("Memory Cleared with submillis");
    }
}
