package javaders.day41lambda;

import java.util.ArrayList;
import java.util.List;

public class Tekrar {
    public static void main(String[] args) {
        List<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(7);
        nums2.add(-4);
        nums2.add(9);
        nums2.add(2);
        nums2.add(4);
        nums2.add(6);
        nums2.add(15);
        System.out.println(getMultiplicationOfSquareofEvens(nums2));
        System.out.println(getTheSumOfEvenMaxAndOddMin(nums2));  //15
        System.out.println(getTheSumOfEvenLessThanSevenAndOddMinGreaterThanEight(nums2));  //15
    }
    //Example 2: Verilen bir List'teki cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini hesaplayan method olusturunuz.

    public static int getMultiplicationOfSquareofEvens( List<Integer> nums2){

        return  nums2.stream().filter(t->t%2==0).map(t->t*t).distinct().reduce(1,(t,u)->t*u);  //kareler tekrarssiz olmali  //147456
    }

    //Example 3 : Verilen bir List'teki cift sayi olan elemanlarin max degri ile tek sayi olan elemanlarin minimum degereinin
    //           toplamini hesaplayan method'u olusturunuz.
    public static int getTheSumOfEvenMaxAndOddMin(List<Integer> nums2){

        //etkisiz eleman olmadan reduce kullanirsak optional inetger döner bunu normal int'e cevirmek icin get() methodu ekliyoruz.

        int maxEven = nums2.stream().distinct().filter(t->t%2==0).reduce((t,u)->t>u ? t : u).get();  //her elemani max ile kiyasliyoruz
        int minOdd = nums2.stream().distinct().filter(t->t%2!=0).reduce((t,u)->t<u ? t : u).get();

        return maxEven + minOdd;

    }
    //Example 4 : Verilen bir List'teki cift sayi olan elemanlarin 7'den kucuk maximum degeri ile tek sayi olan elemanlarin
    //           8'den buyuk minimum degerinin toplamini hesaplayan methodu olusturunuz.

    public static int getTheSumOfEvenLessThanSevenAndOddMinGreaterThanEight(List<Integer> nums2){

        int min =nums2.stream().distinct().filter(t->t%2==0 && t<7).reduce((t,u)->t>u ? t: u).get();
        int max =nums2.stream().distinct().filter(t->t%2!=0 && t>8).reduce((t,u)->t<u ? t :u).get();
        return max + min;
    }

}
