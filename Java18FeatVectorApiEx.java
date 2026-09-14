import jdk.incubator.vector.FloatVector;
import jdk.incubator.vector.VectorSpecies;

public class Java18FeatVectorApiEx {
    // Vector api allows java program to tap into h/w SIMD(single inst,multiple
    // data) vector lanes.
    static final VectorSpecies<Float> species = FloatVector.SPECIES_PREFERRED;

    public static void main(String[] args) {
        float[] a = { 1.0f, 2.0f, 3.0f, 4.0f };
        float[] b = { 5.0f, 6.0f, 7.0f, 8.0f };
        float[] c = new float[4];

        // loads data into cpu vector lanes and ops parallel across arry of no
        var va = FloatVector.fromArray(species, a, 0);
        var vb = FloatVector.fromArray(species, b, 0);
        var vc = va.mul(vb);// va * vb
        vc.intoArray(c, 0);

        // printf sounds like c
        System.out.printf("SIMD Computed Output: [%.1f, %.1f, %.1f, %.1f]%n", c[0], c[1], c[2], c[3]);// printf

    }
}
