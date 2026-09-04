import java.util.List;
import java.util.stream.Collectors;

public class Java12FeatCollectorTeeingEx {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 20, 30, 40);

        // Collectors.teeing:use Stream collector(Master) downstream each element
        // through 2
        // pipes() and later fuses with Bifunction;[average={(2 pipes->[sum/count]}
        double average = nums.stream().collect(Collectors.teeing(
                Collectors.summingDouble(i -> i), // sum
                Collectors.counting(), // count
                (sum, count) -> sum / count));// fuse

        System.out.println("Average:" + average);
    }
}
