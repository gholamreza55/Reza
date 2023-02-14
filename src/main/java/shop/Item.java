package shop;


public class Item {
    private final String name;
    private int quantity;

    public Item(String name, int quantity) {

        this.name = name;
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public void check() {
        if (name == null || name.isEmpty()){
            throw new ItemNameException();
        }
        if (quantity < 1 || quantity > 100){
            throw new ItemQuantityException();
        }

    }
}
