package use;

public class Main1 {
    static int quiz(int x, int y){
        if (y == 1)
            return x;
        else
            return x + quiz(x, y - 1  );
    }

    public static void main(String[] args) {
        int n = quiz(8, 3);
        System.out.println(n);
    }
}
