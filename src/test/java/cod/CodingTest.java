package cod;

import org.junit.jupiter.api.Test;

public class CodingTest {

    @Test
    void name1() {
        int number = 3, i = 3;
        int result = 1;
        for (int j = 0; j < i; j++) {
            result *= number;
        }
        System.out.println(number +"^"+ i + "=" +result);
}

    @Test
    void name() {
        String a = "javacodingfreely";
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a.charAt(j));
            }
            System.out.println();
        }


    }
}
