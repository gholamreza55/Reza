package shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

public class ShopTest {
    ShopServ shopSerList;
    List<Item> itemList;
    @BeforeEach
    void setUp() {
        shopSerList = new ShopServImpl();
        itemList= new LinkedList<>();
    }
    @Test
    void name() {

        itemList.add(new Item("banana", 2));
        itemList.add(new Item("orange", 3));
        Assertions.assertDoesNotThrow(() ->shopSerList.save(itemList));

    }



    @Test
    void name1() {

        itemList.add(new Item("banana", 2));
        itemList.add(new Item(null, 3));

        Assertions.assertThrows(ItemNameException.class, () ->shopSerList.save(itemList));
    }
    @Test
    void name2() {

        itemList.add(new Item("banana", 2));
        itemList.add(new Item("", 3));

        Assertions.assertThrows(ItemNameException.class, () ->shopSerList.save(itemList));
    }
    @Test
    void name3() {

        itemList.add(new Item("banana", 0));
        itemList.add(new Item("orange", 3));

        Assertions.assertThrows(ItemQuantityException.class, () ->shopSerList.save(itemList));
    }

    @Test
    void name4() {

        itemList.add(new Item("banana", 102));
        itemList.add(new Item("orange", 3));

        Assertions.assertThrows(ItemQuantityException.class, () ->shopSerList.save(itemList));
    }



}
