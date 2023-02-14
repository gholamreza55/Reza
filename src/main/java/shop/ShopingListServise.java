package shop;

import java.util.List;

public interface ShopingListServise {
    List<Item> findAllItems();

    public void saveItem(List<Item> items);
}
