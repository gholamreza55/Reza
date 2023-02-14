package employ;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shop.ItemNameException;

import java.util.LinkedList;
import java.util.List;

public class FruitTest {
    List<Fruit> fruits = new LinkedList<>();
    EmployeeListServiceImpl employeeList = new EmployeeListServiceImpl();

    @BeforeEach
    void setUp() {
        fruits = new LinkedList<>();
        employeeList = new EmployeeListServiceImpl();

    }

    @Test
    void name1() {
        fruits.add(new Fruit("Orange", 2));
        fruits.add(new Fruit("banana", 5));
        Assertions.assertDoesNotThrow(() -> employeeList.saveFruit(fruits));

    }

    @Test
    void name2() {
        fruits.add(new Fruit("Orange", 2));
        fruits.add(new Fruit(null, 5));
        Assertions.assertThrows(FruitNameException.class, () -> employeeList.saveFruit(fruits));
         }

    @Test
    void name3() {
        fruits.add(new Fruit("Orange", 2));
        fruits.add(new Fruit("", 5));
        Assertions.assertThrows(FruitNameException.class, () -> employeeList.saveFruit(fruits));
    }

    @Test
    void name4() {
        fruits.add(new Fruit("Orange", 2));
        fruits.add(new Fruit("", 0));
            Assertions.assertThrows(FruitQuantityException.class, () -> employeeList.saveFruit(fruits));

    }
    @Test
    void name5() {
        fruits.add(new Fruit("Orange", 28));
        fruits.add(new Fruit("", 102));
        Assertions.assertThrows(FruitNameException.class, () -> employeeList.saveFruit(fruits));

    }
}
