package motaferege;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M1 {
    @Test
    void name() {
        int a = 0;
        while (a < 10){
            System.out.println("a is less than 10 : " + a);
            a++;
        }
    }

    @Test
    void name1() {
        int x = 0;
        while (x == 1){
            System.out.println(x);
        }
    }

    @Test
    void name2() {
        String sev = "salam khobi shoma";
        Scanner scanner = new Scanner(sev);
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()){
            list.add(scanner.next());
        }
        System.out.println(list);
    }
}
