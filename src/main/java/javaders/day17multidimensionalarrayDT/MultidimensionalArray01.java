package javaders.day17multidimensionalarrayDT;

import java.util.Arrays;

public class MultidimensionalArray01 {
    public static void main(String[] args) {

        //distaki array "outer array" ,icteki array "Inner array"
        //Bir Array'in elemanlari Array ise bu Array Multidimensional arraydir.

        //
            //Multidimensional Array nasil olusturulur?
        int a[][] = new int[3][2];

            //Multidimensional Arraylere eleman nasil eklenir?
        a[0][0] = 5;
        a[1][1] = 45;
        a[2][0] = 123;
        a[0][1] = 12;
        a[1][0] = 45;
        a[2][1] = 0;

            //Multidimensional Arrayleri console yazdirmak icin deepToString() methodunu kullaniriz

        System.out.println(Arrays.toString(a));  //[[I@4dd8dc3, [I@6d03e736, [I@568db2f2]

        System.out.println(Arrays.deepToString(a));  //[[5, 12], [45, 45], [123, 0]]  ***bu sekilde yazdirilmali

            //Multidimensional Array icinden spesific bir eleman nasil yazdirilir?

        System.out.println(a[1][1]);  //45  (burda int bir deger yazdirdigimiz icin normal sout kullandik)

            //Multidimensional Array icindeki array nasil yazilir

        System.out.println(Arrays.toString(a[0]));   //[5,12]
        System.out.println(Arrays.toString(a[1]));   //[81,45]


            //Kisa yoldan Multidimensional Array nasil olusturulur?

        String students[][] ={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};  //manuel olarak bu sekilde yazinca olusturabiliriz.

        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.

        int sum=0;
        for (String[] w : students){    //w'nin onune Arrayin data tipi yazilir. Burda String array ic elemanlarin tipidir

           sum= sum+ w.length;  //her bir ic array'i ayri ayri toplar
        }

        System.out.println(sum);

        //Example 2:Yukaridaki students arrayìn icinde "m" olan isimleri console'a yazdiriniz

        for(String [] w: students){

           for(String k : w){

               if(k.contains("m")){
                   System.out.println(k);  //Kemal, Cemal
               }

            }

        }

        //Example 3: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayniz
        int nums[][] = { {5, 4}, {2, 3, 2}, {7}};
        int result = 1;

        for (int [] w: nums){

            for(int k : w){

                result= result*k;
            }
        }
        System.out.println(result);  //1680



    }
}
