package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class S4 {
    public static void main(String[] args) {
        List<String> alpha = List.of("a", "b", "c", "d");

        List<String> alphaUpper = new ArrayList<>();
        for (String s : alpha) {
            alphaUpper.add(s.toUpperCase());
        }
        System.out.println(alpha);

        System.out.println("------------------");
        System.out.println(alphaUpper);

        System.out.println("-------------------");

        alpha.stream().map(s -> s.toUpperCase()).toList();
        List<String> coll = alpha.stream().map(String::toUpperCase).toList();
        System.out.println(coll);

    }
}
