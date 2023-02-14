package shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

public class ItemTest {
    private ShopingListServise shopingList;
    private List<Item> itemList;
    @BeforeEach
    void setUp() {
        shopingList = new ShopingListServiseImpl();
        itemList = new LinkedList<>();

    }

    @Test
    void should_check_if_item_names_are_not_null_or_empty_1() {
        List<Item> itemList = new LinkedList<>();
        itemList.add(new Item("Banana", 5));
        itemList.add(new Item("Orange", 2));
       // System.out.println(itemList);

        Assertions.assertDoesNotThrow(() -> shopingList.saveItem(itemList));
    }

    @Test
    void should_throw_item_name_exception_when_an_item_with_null_name_exsit_2() {
        itemList.add(new Item("Banana", 5));
        itemList.add(new Item(null, 2));

        Assertions.assertThrows(ItemNameException.class, () -> shopingList.saveItem(itemList));

    }

    @Test
    void should_throw_item_name_exception_when_an_item_with_empty_name_exsit_3() {
        List<Item> itemList = new LinkedList<>();
        itemList.add(new Item("", 5));
        itemList.add(new Item("Orange", 2));

        Assertions.assertThrows(ItemNameException.class, () -> shopingList.saveItem(itemList));

    }

    @Test
    void should_item_quantty_throw_exception_when_item_has_a_quantity_less_then_1_4() {
        itemList.add(new Item("Banana", 0));
        itemList.add(new Item("Orange", 2));

        Assertions.assertThrows(ItemQuantityException.class, () -> shopingList.saveItem(itemList));

    }
      @Test
    void should_item_quantty_throw_exception_when_item_has_a_quantity_greater_then_100_5() {
        List<Item> itemList = new LinkedList<>();
        itemList.add(new Item("Banana", 28));
        itemList.add(new Item("Orange", 101));

        Assertions.assertThrows(ItemQuantityException.class, () -> shopingList.saveItem(itemList));


    }
}
