package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class S3 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(20, "gholam", 28, 400000));
        list.add(new Employee(30, "reza", 30, 350000));
        list.add(new Employee(40, "nasser", 25,340000));
        list.add(new Employee(50, "ali", 35, 380000));

        List<Employee> employeeList = list.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        }).toList();

        employeeList.forEach(System.out::println);
        System.out.println("---------------------------------");


        list.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .toList().forEach(System.out::println);
        System.out.println("------------------------------------");


        list.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .toList().forEach(System.out::println);

    }
}
