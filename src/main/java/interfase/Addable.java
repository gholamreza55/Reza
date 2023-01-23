package interfase;

public interface Addable {
    public int adittion(int a, int b);
}

class AddableImp implements Addable{

    @Override
    public int adittion(int a, int b) {
        return a + b;
    }
}
class Lambda{
    public static void main(String[] args) {
        Addable addable = (a, b) -> a * b;
        int adittion = addable.adittion(12, 8);
        System.out.println(adittion);
    }
}
