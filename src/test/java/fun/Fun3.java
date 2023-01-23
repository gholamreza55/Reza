package fun;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Fun3 {
    @Test
    void name() {
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> (a * b);
       // Integer x = biFunction.apply(10, 20);
       // System.out.println(x);
        Function<Integer, Integer> function = y -> y * y;
       // Integer t = function.apply(4);
       // System.out.println(t);

        Function<Integer, Integer> function1 = l -> l * l;

       // function.apply(function1);

        Integer v = biFunction.andThen(function).apply(2, 3);
        System.out.println(v);

    }
}
