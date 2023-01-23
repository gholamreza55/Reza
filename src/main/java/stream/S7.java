package stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class S7 {
    public static void main(String[] args) {
        int[] num = {2, 8, 10, 7, 14, 9};
        double asDouble = Arrays.stream(num).average().getAsDouble();
        System.out.println(asDouble);
        Arrays.stream(num).average().ifPresent(System.out::println);
        System.out.println("---------------------------------");
        IntStream.of(num).average().ifPresent(System.out::println);
        IntStream.of(num).max().ifPresent(System.out::println);
        IntStream.of(num).min().ifPresent(System.out::println);
        int sum = IntStream.of(num).sum();
        System.out.println(sum);
        IntStream skip = IntStream.of(num).sorted();
        System.out.println("---------------------------------");
        skip.forEach(System.out::println);
        System.out.println("-----------------------");
        int sum1 = IntStream.range(2, 5).sum();
        System.out.println(sum1);
    }
}
