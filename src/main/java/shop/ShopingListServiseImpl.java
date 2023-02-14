package shop;

import java.util.List;

public class ShopingListServiseImpl implements ShopingListServise {
    
    @Override
    public List<Item> findAllItems() {
        ShoppingListDAO shopingListDAO = new ShopingListDAOImpl();
        return shopingListDAO.findAllItems();
    }

    @Override
    public void saveItem(List<Item> items) {
        for (Item item : items) {
            item.check();

        }
        ShoppingListDAO shopingListDAO = new ShopingListDAOImpl();
        shopingListDAO.saveItem(items);

    }
}
