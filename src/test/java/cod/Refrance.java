package cod;

import java.util.Arrays;

public class Refrance {
    @Override
    public String toString() {
        return "Refrance{}";
    }

    static int[] sortSqureAraay (int[] array){
        int[] squer_num = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            squer_num[i] = array[i] * array[i];
        }
        Arrays.sort(squer_num);
        return squer_num;



    }

    public static void main(String[] args) {
       int[] arry = {-6, -4, 1, 2, 3, 5};
        int[] ints = sortSqureAraay(arry);

        for (int anInt : ints) {

            System.out.println(anInt);
        }
    }
}
