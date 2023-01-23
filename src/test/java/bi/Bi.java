package bi;

import com.sun.jdi.IntegerType;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Bi {
    @Test
    void name() {
        BiFunction<Integer, Integer, Integer> biFunction = Integer::sum;
        BiFunction<Integer, Integer, Integer> biFunction1 = Integer::max;
        Integer t = biFunction1.apply(4, 5);
        System.out.println(t);

        Function<Integer, Integer> function = a -> a * a;

        Integer v = biFunction.andThen(function).apply(10, 20);
        System.out.println(v);
    }
}
