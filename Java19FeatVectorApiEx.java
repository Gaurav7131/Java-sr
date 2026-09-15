import jdk.incubator.vector.FloatVector;
import jdk.incubator.vector.VectorSpecies;

public class Java19FeatVectorApiEx {
    static final VectorSpecies<Float> SPECIES = FloatVector.SPECIES_PREFERRED;

    public static void main(String[] args) {
        float[] a = { 1.5f, 2.5f, 3.5f, 4.5f };
        float[] b = { 2.0f, 2.0f, 2.0f, 2.0f };
        float[] c = new float[4];

        // Load into CPU SIMD registers and multiply simultaneously
        var va = FloatVector.fromArray(SPECIES, a, 0);
        var vb = FloatVector.fromArray(SPECIES, b, 0);
        var vc = va.mul(vb);
        vc.intoArray(c, 0);

        System.out.printf("SIMD Computed Output: [%.1f, %.1f, %.1f, %.1f]%n", c[0], c[1], c[2], c[3]);
    }
}