package supr;

public class Cat extends Animal{
    String catFoodPrefrence;

    public Cat(int age, String name, String catFoodPrefrence) {
        super(age, name);
        this.catFoodPrefrence = catFoodPrefrence;

    }

    @Override
    public void makeNoise() {

        super.makeNoise();
        System.out.println("Meow Meow meow");
        super.doSomeThingPrivate();

    }

    public void jump(){
        System.out.println("presh");
    }
}
