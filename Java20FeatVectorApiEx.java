import jdk.incubator.vector.FloatVector;
import jdk.incubator.vector.VectorSpecies;

public class Java20FeatVectorApiEx {
    // Select the optimal SIMD vector bit-width supported by the host CPU
    // fixed 128-bit vector = exactly 4 single-precision floats (32 bits * 4 = 128)
    static final VectorSpecies<Float> SPECIES = FloatVector.SPECIES_128;// fixed 128

    public static void main(String[] args) {
        float[] a = { 1.0f, 2.0f, 3.0f, 4.0f };
        float[] b = { 5.0f, 6.0f, 7.0f, 8.0f };
        float[] c = new float[4];

        // Load data directly into CPU SIMD registers
        var va = FloatVector.fromArray(SPECIES, a, 0);
        var vb = FloatVector.fromArray(SPECIES, b, 0);

        // Hardware-accelerated parallel SIMD (add)
        var vc = va.add(vb);

        // Write the SIMD register values back to memory
        vc.intoArray(c, 0);

        System.out.printf("SIMD Result: [%.1f, %.1f, %.1f, %.1f]%n", c[0], c[1], c[2], c[3]);
    }
}