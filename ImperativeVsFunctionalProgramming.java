import java.util.Arrays;
import java.util.List;

public class ImperativeVsFunctionalProgramming {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Imperative Programming:How to do> for loop
        System.out.println("Imperative Programming:");
        for (int l : list) {
            if (l % 2 == 0) {

                System.out.print(l + " ");
            }

        }

        // Fuctional(Declarative):what u want?- stream
        System.out.println("\nFunctional Programming:");
        list.stream()
                .filter(l -> l % 2 == 0)
                .forEach(l -> System.out.print(l + " "));
    }
}