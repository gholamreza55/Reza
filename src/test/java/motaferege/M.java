package motaferege;

public class M {
    public static void main(String[] args) {
        String x = "I love you to me";
        String r = reserve(x);
        System.out.println(r);
        System.out.println("----------------------------");
        String rool = rool(x);
        System.out.println(rool);
        System.out.println("-------------------------------");
        String didar = didar(x);
        System.out.println(didar);


    }

    private static String didar(String b) {
        char[] letter = new char[b.length()];
        int negar = 0;
        for (int i = b.length() - 1; i >= 0; i--) {
            letter[negar] = b.charAt(i);
            negar++;
            }
       // String didar = "";
        StringBuilder didar = new StringBuilder();
        for (int i = 0; i < b.length(); i++) {
          //  didar = didar + letter[i];
            didar.append(letter[i]);

        }
        System.out.println(didar);


        return didar.toString();
    }

    private static String rool(String y) {
        char[] a = new char[y.length()];
        for (int i = y.length() - 1; i >= 0; i--) {
            System.out.println(y.charAt(i));
        }
            return y;

        }

    private static String reserve(String s) {
        char[] letter = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        return s;
    }

}
