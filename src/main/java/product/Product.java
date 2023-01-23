package product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        for (Product product : getList()) {
            if (product.getPrice() >= 28000f)
                list.add(product);
              //  System.out.println(product);
         }
             System.out.println("---------------------------");

            for (Product product : list) {
                System.out.println(product);
            }
                System.out.println("---------------------");


                List<Product> v = getList().stream()
                        .filter(p -> p.getPrice() >= 28000)
                        .toList();
                System.out.println(v);


            }

    public static List<Product> getList(){
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "Hp laptop", 25000f));
        list.add(new Product(2, "Dell laptop", 30000f));
        list.add(new Product(3, "Leneve laptop", 28000f));
        list.add(new Product(4, "Sony laptop", 28000f));
        list.add(new Product(5, "Apple laptop", 90000f));
        return list;
    }

    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
