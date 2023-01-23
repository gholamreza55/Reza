package fun;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class Fun {
    @Test
    void name() {
        Map<Integer, String> map =  new HashMap<>();
        map.put(2, "ali");
        map.put(4, "reza");
        BiConsumer< Integer, String> biCons = (x, y) -> System.out.println("x : "+ x + " , "+" y : " +y);
        map.forEach(biCons);

    }

    @Test
    void name1() {
        List<Integer> list = Arrays.asList(2, 4, 5 ,6, 9);
        Consumer<Integer> consumer = System.out::println;
        list.forEach(consumer);
    }

    @Test
    void name2() {
        Function<String, Integer> function = a -> a.length();
        Integer x = function.apply("Hello");
        System.out.println(x);

        Function<Integer, Integer> function1 = s -> s + s ;
        Integer y = function1.apply(10);
        System.out.println(y);

        Function<Integer, Integer> f = l -> l * x;
        System.out.println(f.apply(10));

        System.out.println("--------------------------------");


    }


    }








