//Stream Improvment APi:1)takeWhile 2)dropWhile 3)ofNullable 4)iterate

import java.util.stream.Stream;

public class StreamImprovementEx {
    public static void main(String[] args) {
        // 1)takeWhile:takes element as soon as predicate is true
        Stream.of(2, 4, 6, 7, 8, 10).takeWhile(n -> n % 2 == 0).forEach(System.out::print);
        System.out.println();

        // dropWhile:drop element as soon as predicate is true
        Stream.of(2, 4, 6, 7, 8, 10).dropWhile(n -> n % 2 == 0).forEach(System.out::print);
        System.out.println();

        // iterate:act as a std for with predicate termination
        Stream.iterate(1, n -> n <= 5, n -> n + 1).forEach(System.out::print);
        System.out.println();

        // ofNullable:prevents null checks by returning single-element stream if
        // non-null & return empty stream if null
        String name = null;
        Stream.ofNullable(name).forEach(System.out::println);
    }
}
