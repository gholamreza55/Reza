package fun;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Fill {
    @Test
    void name() {
        String text = "java the best!";
        Function<String, Integer> fun = Fill::countWitheSpace;
        Integer x = applyToStr(text, fun);
        System.out.println(x);

    }

    private static Integer applyToStr(String text, Function<String, Integer> fun) {
        return fun.apply(text);
    }

    public static Integer countWitheSpace(String text) {
        int n = 0;
        char[] s = text.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == ' ') {
                n = n + 1;
            }
        }
        return n;
    }

    @Test
    void name1() {
        List<String> list = List.of("Payton", "Fortran", "C");
        Function<String, Integer> fun = a -> a.length();
        List<Integer> reslist = applyAndCreat(fun, list);

        System.out.println(reslist);
    }

    private static <R, T> List<R> applyAndCreat(Function<T, R> fun, List<T> list) {
        List<R> list1 = new ArrayList<>();
        for (T t : list) {
            list1.add(fun.apply(t));
        }
        return list1;

    }

    @Test
    void name4() {
        List<String> list = List.of("Ali", "Golamreza", "Mohammad", "Akbar");
        Map<String, Integer> map = alip(list, String::length);
        System.out.println(map);

    }

    private <R, T> Map<R, T> alip(List<R> list, Function<R, T> function){
        Map<R, T> map = new HashMap<>();
        for (R r : list) {
            map.put(r, function.apply(r));

        }
        return map;
    }
}




