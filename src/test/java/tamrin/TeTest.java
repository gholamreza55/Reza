package tamrin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

public class TeTest {
    Te te;
    List<Person> list;

    @BeforeEach
    void setUp() {
        te = new TeImpl();
        list = new LinkedList<>();
    }

    @Test
    void name() {
        list.add(new Person(1, "gholam"));
        list.add(new Person(2, "reza"));
        Assertions.assertDoesNotThrow(() -> te.saveImp(list));
    }

    @Test
    void name1() {
        list.add(new Person(1, "gholam"));
        list.add(new Person(2, "reza"));
        Assertions.assertThrows(IdException.class,() -> te.saveImp(list));
       }

    @Test
    void name2() {
        list.add(new Person(28, "gholam"));
        list.add(new Person(101, "reza"));
        Assertions.assertThrows(IdException.class,() -> te.saveImp(list));

    }

    @Test
    void name3() {
        list.add(new Person(1, "gholam"));
        list.add(new Person(2, null));
        Assertions.assertThrows(NameException.class,() -> te.saveImp(list));

    }
    @Test
    void name4() {
        list.add(new Person(1, ""));
        list.add(new Person(2, "reza"));
        Assertions.assertThrows(NameException.class,() -> te.saveImp(list));

    }
}
