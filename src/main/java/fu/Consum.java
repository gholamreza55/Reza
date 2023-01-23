package fu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 5 ,6, 9);
        Consumer<Integer> consumer = System.out::println;
        list.forEach(consumer);

        Map<Integer, String>  map =  new HashMap<>();
        map.put(2, "ali");
        map.put(4, "reza");
        BiConsumer< Integer, String> function = (x, y) ->
                System.out.println("x : "+ x + " , "+" y : " +y);
        map.forEach(function);


    }
}
