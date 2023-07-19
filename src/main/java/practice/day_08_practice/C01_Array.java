package practice.day_08_practice;

import java.util.Arrays;

public class C01_Array {

    /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' elemanları bulan bir kod yazınız.
        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        output: min:-90, max:10001, ikincimax: 8787
       */

    public static void main(String[] args) {

        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[-90, 0, 1, 100, 845, 898, 8787, 10001]
        System.out.println("minimum: "+ arr[0]);
        System.out.println("maximum: "+ arr[arr.length-1]);
        System.out.println("second maximum: "+ arr[arr.length-2]);

    }
}
