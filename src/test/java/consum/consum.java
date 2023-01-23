package consum;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

public class consum {
    @Test
    void name() {
        Consumer<String> consumer = p -> System.out.println(p);
                consumer.accept("Golamreza");

        Consumer<String> consumer1 = p -> System.out.println(p+" java");
        Consumer<String> consumer2 = p -> System.out.println(p+ " world");
        consumer1.andThen(consumer2).accept("hello");
        System.out.println();
    }
}
