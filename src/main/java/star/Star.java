package star;

public class Star {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 10; i > a; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

    }
}
