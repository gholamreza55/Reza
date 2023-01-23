package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class S5 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 2, 1);
        long count = list.stream().count();
        Optional<Integer> max = list.stream().max(Comparator.comparing(s -> s.intValue()));
        System.out.println(max);
        Optional<Integer> min = list.stream().min(Comparator.comparing(x -> x.intValue()));

        Integer collect = list.stream().collect(Collectors.summingInt(s -> s.intValue()));
        System.out.println(collect);
        System.out.println(min);
        System.out.println(count);
        Optional<Integer> first = list.stream().findFirst();
        if (first.isPresent())
            System.out.println(first.get());
        else
            System.out.println("stream is empty");
    }

}
