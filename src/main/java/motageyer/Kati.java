package motageyer;

import java.util.ArrayList;
import java.util.List;

public class Kati {
    public static void main(String[] args) {
        int[] a = {4, 21, 3, 12, 8, 15, 6, 17};
        print(a);
    }

    static void print(int[] a) {
        List<Integer> list = new ArrayList<>();
        for (int i : a) {
            if (i > 4)
            list.add(i);
        }
        System.out.println(list);
    }
}
