package shop;

import java.util.List;

public interface ShoppingListDAO {
    List<Item> findAllItems();

    public void saveItem(List<Item> items);
}
