package shop;

import java.util.List;

public interface ShopServ {

    public List<Item> list();

    default void save(List<Item> list) {


    }

}
