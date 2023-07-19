package practice.day_07_practice;

import java.util.Arrays;

public class C04_Array {
    // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
    // input : 1,2,-3,4,-5,-6
    // output :-1,-2,3,-4,5,6

    public static void main(String[] args) {
        int arr[] ={1,2,-3,4,-5,-6};

        int brr[]= new int[arr.length];  //output icin yeni Array

        int idx=0;     //yani 0. inexten baslayip esayn et diyoruz
        for(int each:arr){   //arr'deki herbir elemani foreach ile aldik
            brr[idx]=each*-1; //her eleman negatif degrini sirasiyla brr'ye esayn ettik.
            idx++;
        }
        System.out.println(Arrays.toString(brr));
    }
}
