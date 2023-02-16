package tamrin1;

import tamrin.Person;
import tamrin.Te;
import tamrin.TeImpl;

import java.util.LinkedList;
import java.util.List;

public class TeTest {
    public static void main(String[] args) {
        Te tamrin = new TeImpl();
        List<Person> list = new LinkedList<>();
        list.add(new Person(12, "reza"));
        list.add(new Person(2, "gholam"));
        tamrin.saveImp(list);
}
}
