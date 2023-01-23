package stream;

import com.spun.util.Comparator;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class S6 {
    public static void main(String[] args) {
        int sum = IntStream
                .range(1, 5)
                .sum();
        System.out.println(sum);


        Stream<String>  l = Stream.of("polad", "reza", "gholam");
        Optional<String> first = l.sorted().findFirst();
        System.out.println(first.get());

        Arrays.stream(new int[]{2, 8, 14, 5, 6}).average().ifPresent(System.out::println);
    }
}
