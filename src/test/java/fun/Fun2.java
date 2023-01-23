package fun;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Function;

public class Fun2 {

    @Test
    void name() {
        Function<Integer, String> function = number ->
        {
            if (number % 2 == 0)
                return "odd : " + number;
            else
                return "oven : " + number;
        };

        String x = function.apply(21);
        System.out.println(x);
    }

    @Test
    void name1() {
        Function<Integer, Integer> function = v -> v * 2;
        Integer l = function.apply(4);
        System.out.println(l);
        System.out.println("-------------------------------");
        Function<Integer, Integer> function1 = num -> num * num;
        Integer v = function1.apply(3);
        System.out.println(v);
        System.out.println("-----------------------------------");

        Integer integer = function.andThen(function1).apply(4);
        System.out.println(integer);

    }

    @Test
    void name2() {
        List<String> list = Arrays.asList("Payton", "java", "C++", "javascript");
        Map<String, Integer> map = converToListMap(list, x -> x.length());

        System.out.println(map);
    }

    private static<T, R> Map<T, R> converToListMap(List<T> list, Function<T, R> function) {
        Map<T,R> res = new HashMap<>();
        for (T t : list) {
            res.put(t, function.apply(t));
        }
        return res;

    }

}
