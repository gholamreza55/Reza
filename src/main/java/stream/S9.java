package stream;

import java.util.List;

public class S9 {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 6, 8, 2, 9, 3);
        Integer reduce = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println(reduce);
    }
}
