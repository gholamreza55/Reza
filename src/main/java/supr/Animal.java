package supr;

public class Animal {
    int age;
    String name;

    public Animal(){}

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Hello, I am an Animal");
    }

    public void eat(){
        System.out.println("Munch munch");
    }

    public void doSomeThingPrivate(){
        System.out.println("Hey this method is private");
    }
}
