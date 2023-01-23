package cod;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Ford {
    @Override
    public String toString() {
        return "Ford{}";
    }

    @Test
    void name() {
        var x = new Integer[]{1, 2, 3};


        for (Integer integer : x) {
            integer *= integer;
            System.out.println(integer);
            System.out.println(Arrays.toString(x));
        }

    }
}
