package javaders.day41lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        System.out.println(getTheSumOfSquareOfOdss1(nums));  //17548
        System.out.println(getTheSumOfSquareOfOdss2(nums));  //17548
        System.out.println(getTheSumOfSquareOfOdss3(nums));  //17548

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



    //Example 1: Verilen bir List'teki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz

    public static int getTheSumOfSquareOfOdss1( List<Integer> nums){
        //identity : etkisiz eleman toplama icin 0, carpma icin 1 dir.
        //reduce --> toplama yapiyoruz
        return nums.stream(). //yukaridan asagiya dogru siraladi
                filter(t->t%2!=0). //tek sayilari filtreledi
                map(t-> t*t).      //
                reduce(0,(t,u)->t+u);  // t ilk degerini identiyden alir u ise degerini bir onceki islem sonucu olusan
                                              //s stream'den alir ==> yani t ilk asama 0 iken u 81'dir ==> böylece toplam 81
                                              // ikinci sefer de t artik 81'dir ve u ikinci sayi olan 17161'dir ==> toplam 17242 olur


        //coklu datayi tekli datayi cevirme icin reduce() methodu kullanilir, mesela en buyuk sayi veya en kucuk sayi,
        //toplami, carpmi olan son sayi bulmak icin.
        //Note: reduce() methodundaki toplama isleminde "t" ilk parametrenin ilk degerini daha sonraki tum degerleri toplamdan alir,
        // "u" ise stream'den alir

    }

    /*

    Önemli Not ==> Class ismi :: Method Ismi ==> Method Reference   (adres göstermis oluyorum)
     */
    public static int getTheSumOfSquareOfOdss2( List<Integer> nums) {

        return nums.stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                reduce(0, Math :: addExact);  //toplama methodu sectik !!!

    }
    public static int getTheSumOfSquareOfOdss3( List<Integer> nums) {

        return nums.stream().
                filter(t -> t % 2 != 0).
                map(Utils :: getSquare).  //ihtiyciniz olan method Java Class'larinda yoksa Utils Class olusturup icinde
                                          //ihtiyaciniz olan method'u olsuturunuz ve method reference kullaniniz.
                reduce(Math :: addExact).  //toplama methodu sectik !!!
                get();                    //get() methodu Optional<Integer> i integer'a ceviridk!!
    }
    public static int getTheSumOfSquareOfOdss4( List<Integer> nums) {

        return nums.stream().
                filter(Utils :: isOdd).   //Utils Class'da olsutrup cagiridik. NOt : Bir kere kullanilcak method icin Utils'e yazmaya gerek yok(tekrar tekrar yazilcakalar icin)
                map(Utils :: getSquare).
                reduce(Math :: addExact).get();  //toplama methodu sectik !!!

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
