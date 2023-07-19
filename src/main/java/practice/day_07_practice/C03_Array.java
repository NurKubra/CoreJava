package practice.day_07_practice;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C03_Array {

    /*
     Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
     ve bu rakamları bir array'e esayn ediniz. Olusturdugunuz array'i yazdırınız

     Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız

     Ortalamadan daha buyuk olan array elemanlarını yazdırınız
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[4];

        for (int i = 0; i <4 ; i++) {   //Kullanicidan 4 tane rakam alacagimiz icin 0'dan 4 e kadar for döngüsüne aldik.
            System.out.println("Lütfen "+ (i+1)+ ". rakami giriniz");
            int rakam = scan.nextInt();
            arr[i] =rakam;              //Kullanicidan aldigimiz her rakami sirasiyla Array'e esayn ettik.
        }
        System.out.println(Arrays.toString(arr));


        double toplam =0;
        for(int w:arr){
            toplam+= w;
        }
        System.out.println(toplam);
        double ortalama = toplam/arr.length;
        System.out.println(ortalama);


        //Ortalamadan daha buyuk olan array elemanlarini yazdiriniz

        for (int each: arr){
            if(each>ortalama){
                System.out.println(each+ " ");
            }
        }

    }

}
