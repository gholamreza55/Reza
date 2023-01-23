package fun;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class Fun4 {
    @Test
    void name() {
        Function<String, String> stringFunction = s -> s.replace(":", "=");
        Function<String, String> stringStringFunction = s -> "{" + s +"}";

        String v = stringFunction.andThen(stringStringFunction).apply("key : value");
        System.out.println(v);

    }
}
