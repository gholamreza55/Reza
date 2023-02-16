package shop;

import java.util.List;

public class ShopingListServiseImpl implements ShopingListServise {
    ShoppingListDAO shopingListDAO;


    @Override
    public List<Item> findAllItems() {
        return shopingListDAO.findAllItems();
    }

    @Override
    public void saveItem(List<Item> items) {
        for (Item item : items) {
            item.check();

        }
        shopingListDAO.saveItem(items);

    }
}
