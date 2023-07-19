package javaders.day45lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        elemanlariYazdir(nums);
        System.out.println();
        elemanlariYazdir2(nums);
        System.out.println();
        ciftElemanlariYazdir(nums);
        System.out.println();
        ciftElemanlariYazdir2(nums);
        System.out.println();


        //functional yapilar okunabilirlik acisindan daha avantajli
    }

    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void elemanlariYazdir(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");  //12 9 131 14 9 10 4 12 15

        }
    }

    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void elemanlariYazdir2(List<Integer> nums) {
        nums.stream().forEach(t -> System.out.print(t + " "));  //her bir t variable'ini al aralarinda bosluk birakarak yazdir.

    }

    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void ciftElemanlariYazdir(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void ciftElemanlariYazdir2(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }


    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekElemanlarinKareleriYazdir(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekElemanlarinKareleriYazdir2(List<Integer> nums) {
        nums.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
    public static void ciftElemanlarinKareleriToplami(List<Integer> nums) {
        int toplam = 0;
        for (Integer w : nums) {
            if (w % 2 == 0) {
                toplam += w * w;
            }
        }
        System.out.println(toplam);

    }

    public static void ciftElemanlarinKareleriToplami2(List<Integer> nums) {
        nums.stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(Math::addExact).  //ya da (t-> t+t)  reduce() methodu coklu datayi tek dataya cevirmek demek
                get();   //Optinal dönen datayi Integere'a döndürür.

    }

    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz
    public static void ciftElemanlarinKareleriCarpimi(List<Integer> nums) {
        nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(Math::multiplyExact).get();

        //get(), reduce(), forEach() terminal methodlardir. Bu methodlar sonlandirici methodlardir. Sonrasinda method kullnailmaz

    }

    //9)Liste ogelerinden max degeri veren bir method olusturunuz
    public static void maxDeger(List<Integer> nums) {
        //1.yol
        Integer max = nums.stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);  //baslangic degeri MIN.VALUE olarak en kucuk sayisi sectik.
        //sonra iki tane deger vardir. t iicnde en kucuk sayi vardir.
        //u ise akistaki ilk datadan itibaren icine alir.
        //atama yapip oyle yazdirilmali
        System.out.println(max);
    }
        /*
        alinti not :
        stream metodu ile elamanlari stream'e cevirdik ve hepsi alt alta yazildi. reduce metodu ile elemanlari indirge dedik.
        reduce metodu icinde Integer.MIN_VALUE baslangic deger demektir. t her zaman ilk degerini baslangic degeri
        dedigimiz Integer.MIN_VALUE'yi alir,  Integer.MIN_VALUE degeri -2 milyar. Bu sabit bir deger. u ise stream
        icinde siralanan bastaki degeri alir. t daha sonra stream'deki
        ikinci degeri alir.  Sirasiyla t>u kisminda iki sayi deger aldikca karsilastirilir.
        Basta -2 milyar>12  12 daha buyuk. Bu sekilde biz buyuk olani bulduk.
         */

    //2.yol
    public static void maxDeger2(List<Integer> nums) {
        Integer max2 = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);  //burda kiyas yapmak istegimiz rakam olarak
        // MIN.VALUE yerine ilk elemani aldik
        System.out.println(max2);
    }

    //3.yol
    public static void maxDeger3(List<Integer> nums) {
        Integer max3 = nums.stream().distinct().sorted().
                reduce((t, u) -> u).//ben sana iki tane sayi veriyorum, sen bana ikinciyi döndür demek.
                        get();  //yukarda Integer'a atadigimiz icin get() kullanamdik
        System.out.println(max3);

    }


    //10)Liste ogelerinden minumum degeri veren method olusturunuz

    public static void minDeger(List<Integer> nums) {

        Integer min = nums.stream().
                distinct().
                reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println(min);

    }

    public static void minDeger2(List<Integer> nums) {

        Integer min2 = nums.stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                reduce(nums.get(0), (t, u) -> t < u ? t : u);
        System.out.println(min2);

    }

    public static void minDeger3(List<Integer> nums) {

        Integer min3 = nums.stream().
                distinct().sorted(Comparator.reverseOrder()).
                reduce((t, u) -> t).get();
        System.out.println(min3);

    }

}








