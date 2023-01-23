package stream;

import java.util.List;
import java.util.stream.Stream;

public class S1 {
    public static void main(String[] args) {
        List<Integer> num = List.of(4, 5, 7, 8, 9);

        Stream<Integer> data = num.stream();
        Stream<Integer> sorted = data.sorted();
        sorted.forEach(System.out::println);

   }
}
