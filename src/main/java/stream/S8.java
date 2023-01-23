package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class S8 {
    public static void main(String[] args) throws IOException {
        String[] num = {"Ali", "Akbar", "gholam", "Reza", "Asghar"};
        Arrays.stream(num).filter(x -> x.startsWith("A" )).forEach(System.out::println);

        System.out.println("--------------------------------");

        List<String> strings = Arrays.asList("Ali", "Akbar", "gholam", "Reza", "Asghar");
        strings.stream()
                .map(x -> x.toLowerCase())
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        Stream<String> band = Files
                .lines(Paths.get("C:\\Users\\Dell\\Desktop\\d.txt"));

        band.sorted()
                .filter(x -> x.length() > 8)
                .forEach(System.out::println);

        System.out.println("----------------------------------");

        Stream<String> band1 = Files
                .lines(Paths.get("C:\\Users\\Dell\\Desktop\\d.txt"));
        band1.filter(x -> x.contains("lam"))
                .forEach(System.out::println);
        band1.close();

        System.out.println("----------------------");

        Double reduce = Stream.of(3.4, 4.5, 7.2).reduce(1.0, (a, b) -> a * b);
        System.out.println(reduce);

        System.out.println("----------------------");

        IntSummaryStatistics sumer = IntStream.of(5, 6, 2, 8).summaryStatistics();
        System.out.println(sumer);

        int sum = IntStream.of(5, 6, 2, 8).sum();
        System.out.println(sum);


    }
}
