package motageyer;

import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {


        StringJoiner str = new StringJoiner(",","[","]");
        str.add("A").add("B").add("C");
        System.out.println(str);

        StringJoiner str1 = new StringJoiner(":");
        str1.add("P").add("Q");
        System.out.println(str1);

        str.merge(str1);
        System.out.println(str);

        System.out.println("--------------------------------------");




    }
}
