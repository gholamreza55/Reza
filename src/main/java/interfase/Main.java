package interfase;

public class Main {
    public static void main(String[] args) {
        Shape ren = ()-> System.out.println("gholamreza");
        Shape circle = ()-> System.out.println("Method circle");
        Shape rengtle = () -> System.out.println("renghtle method");
        Shape squer = () -> System.out.println("squer method");
        print(()-> System.out.println("gholamreza"));
        print(circle);
        print(ren);
        print(rengtle);
        print(squer);

    }

    private static void print(Shape shape){
        shape.draw();
    }

}
class renghtle implements Shape{

    @Override
    public void draw() {
        System.out.println("renghtle method");
    }
}
class Squer implements Shape{

    @Override
    public void draw() {
        System.out.println("squer method");
    }
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Method circle");
    }
}
