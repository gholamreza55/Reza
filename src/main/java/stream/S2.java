package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class S2 {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();
        fruit.add("Banana");
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        Stream<String> stream = fruit.stream();

        List<String> sortList = stream.sorted(Comparator.naturalOrder())
                .toList();
        System.out.println(sortList);

        List<String> sortList2 = fruit.stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .toList();
        System.out.println(sortList2);

        List<String> sortList3 = fruit.stream()
                .sorted().toList();
        System.out.println(sortList3);


        List<String> sortList4 = fruit.stream()
                .sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortList4);


    }
}
