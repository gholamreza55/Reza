package supr;

public class SuperDop {
    public static void main(String[] args) {
        Cat mycat = new Cat(3, "gholam", "kabab");
        System.out.println(mycat.age+ " " + mycat.name + " " + mycat.catFoodPrefrence );
        mycat.makeNoise();
        mycat.eat();

    }
}
