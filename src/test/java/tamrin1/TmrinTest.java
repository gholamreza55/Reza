package tamrin1;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class TmrinTest {
    public static void main(String[] args) {
        Tamrin tamrin = new TamrinImpl();
        List<Compani> list = new LinkedList<>();
        list.add(new Compani(12, "reza", 21, "gholam"));
        list.add(new Compani(2, "gholam", 30, "akbar"));
        tamrin.saveLink(list);
    }
}
