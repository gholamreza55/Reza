package predic;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicat {
    @Test
    void name() {
        List<Integer> list = List.of(1, 2, 3 ,4 , 5, 6, 7, 8, 9 ,10);
        Predicate<Integer> predicate = t -> t > 5;
        Predicate<Integer> predicate1 = t -> t < 8;

        list.stream().filter(predicate.and(predicate1)).toList()
                .forEach(System.out::println);

    }

    @Test
    void name1() {
        List<String> list = List.of("A", "AA", "AAA", "B", "BB", "BBB");

        Predicate<String> lengh = l -> l.length() == 3;
        Predicate<String> star = t -> t.startsWith("A");

        List<String> list1 = list.stream().filter(star.or(lengh)).toList();
        List<String> list2 = list.stream().filter(star.and(lengh)).toList();
        System.out.println(list2);
        System.out.println(list1);


    }
}
