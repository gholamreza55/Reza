package employ;

public class Fruit {
    String name;
    int quantity;

    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public void check() {
        if (name == null || name.isEmpty()){
            throw new FruitNameException();
        }if (quantity < 1 || quantity > 100){
            throw new FruitQuantityException();
        }
    }
}
