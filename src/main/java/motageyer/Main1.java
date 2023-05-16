package motageyer;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("33", "374", "xyz");
        list.forEach(s -> {
            try {
                System.out.println(Integer.parseInt(s));
            }catch (Exception ex){
                System.out.println("exception" + ex.getMessage());
            }
        });


    }

   /* public static void main(String[] args) {
        List<String> list = Arrays.asList("33", "374", "123");
       // List<Integer> collect = list.stream().map(Integer::parseInt).toList();
        List<Integer> collect = list.stream().map(String::length).toList();
        System.out.println(collect);
        System.out.println(list);
        list.forEach(System.out::println);

    }

    */

  /*  public static void main(String[] args) {
        String input = "ilovejavateche";
        String[] result = input.split("");
        System.out.println(Arrays.toString(result));
        Set<String> collect = Arrays.stream(result).collect(Collectors.toSet());
        System.out.println(collect);
    }

   */
    
   /* public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 8, 4, 6, 7);
        Integer reduce = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }
    
    */
}
