package shop;

import java.util.List;

public class ShopServImpl implements ShopServ{

    @Override
    public List<Item> list() {
        return null;
    }

    @Override
    public void save(List<Item> list) {
        for (Item item : list) {
            item.check();
        }
    }
}
