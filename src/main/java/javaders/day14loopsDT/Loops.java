package javaders.day14loopsDT;

public class Loops {
    public static void main(String[] args) {
        //Soru 1: Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //        //"Pwd12?Ab" ==> P12?A

        String s="Pwd12?Ab";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                continue; //eger kucuk harflerden biri denk gelirse umursama yok gibi davran ve geriye kalani yazdir
            }else {
                System.out.print(ch);   //P12?A
            }

        }
        // break ile continue arasindaki fark nedir?
        // break switch in disina cikmak icin loopu kirmak icin kullanilir
        // continue ise loop calisirken bazi elemanlari isleme sokmamak icin kullanilir

        System.out.println();  //dummy

        //Soru 2: Bir String'i ters ceviren kodu yaziniz
        //Java ==> avaJ

        //yeni olusturudgum data icin once bos bir String olusturuyoruz!!

        String t ="Java";
        String ters = "";

        for (int i = t.length()-1; i >=0; i--) {  //sondan yazmaya baslamam lazim

            ters= ters + t.substring(i,i+1);   //bu direk String data döndürür !!
        }

        System.out.println(t);      //Java
        System.out.println(ters);   //avaJ

        //2.yol
        String u ="Java";
        String ters2 = "";

        for (int i = u.length()-1; i >=0; i--) {

            ters2= ters2 + u.charAt(i);  //char methodu bize char data döndürür ve biz datayi concatination ile String hale cevirir.!!
        }

        System.out.println(u);      //Java
        System.out.println(ters2);   //avaJ



        //Soru 3:Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==> 5+7+8=20

        int sum =0;
        int num =578;  //-578 yazsaydik 0 görürdük cünkü loop i>0 dedik
        num = Math.abs(num);  //yaparak mutlak deger eklemis olduk

        for (int i =num ; i>0 ; i=i/10) {  //i>0 yaptik cunku en son 10 a bolme durumunda 0,5 verir ve bunu loop u almaya gerek yok

            sum =sum + i%10;

        }
        System.out.println(sum);










    }
}
