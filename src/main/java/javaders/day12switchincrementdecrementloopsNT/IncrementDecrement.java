package javaders.day12switchincrementdecrementloopsNT;

public class IncrementDecrement {

    public static void main(String[] args) {

        /*
        1)Increment arttirmak demektir, Decrement azaltmak demektir.
        2)Increment "toplama ve carpma" ile, Decrement "cikarma ve carpma" ile yapilabilir.
        3)Increment ve Decrement 3 yolla yapilir;
           i) int i =12; ==>  i=i+5;
           ii) int i =12 == >  i +=5;
           iii) int i = 12; ==> i ++;
           Note : 3.yol sadece 1 arttirmak icin kullanilir

           i) int i =12; ==>  i=i-5;
           ii) int i =12 == >  i -=5;
           iii) int i = 12; ==> i --;
           Note : 3.yol sadece 1 azaltmak icin kullanilir

        */

        //Mesela bir App de girilen yas her yil artcagi icin her sene +1 eklenmelidir

        //INCREMENT-ARTTIRMA (Toplamayla ya da carpma ile yapilabilir)
        //Toplama
        int age = 12;
        age =age+1;  //(1. yazma sekli )bu ve
        age +=1;     //(2. yazma sekli) bu esittir . + ve = arasina bosluk konulmaz (1 arttirmak icin yaptik)
        age++;       //(3.yazma sekli) bu da esittir ve 1 arttirmak icin kullanilir
        age+=10;    //10 arttirmak icin kullanilir
        //carpma
        double salary =12000;
        salary = salary * 1.1; //1. yazma sekli
        salary *=1.1;          //2. yazma sekli
        // salary**;  boyle bir yazma sekli yok bir seyin 1 ile carpimi yine aynidir.

        //DECREMENT -AZALTMA
        //cikarma
        int price =12;
        price = price -3;  //1.yol
        price -=3;         //2.yol
        price --;          //3.yal  ==> sadece 1 azaltmak icin kullanilir.

        //bolme
        int salary2 = 1200;
        salary2 =salary2/3;   //1.yol
        salary2/=3;           //2.yol
        // salary//;   boyle bir sekilde yoktur


        //******* Increment *****\\
        int yas = 12;
        System.out.println(yas); //12

        yas = yas++;              //POST INCREMENT
        System.out.println(yas);  //12

        //Java kodlari asagidan yukari ve soldan saga yazdirir.
        //arttirma kismini okumadan yas'i konteynrin icine koydu.O yüzden iki degerde esit cikti.
        //Java arttirmayi göremedigi icin once ++ yi yapiyoruz

        yas =++yas;               //PRE INCREMENT
        System.out.println(yas);  //13

        //Arttirma islemi sonra yapilirsa Post Increment
        //Artirma islemi önce yapilirsa Pre Increment denir

        //******* Decrement *****\\

        int salary3 = 40;
        salary3 = salary3--;    //POST DECREMENT
        System.out.println(salary3);  //40

        salary3= --salary3;     //PRE DECREMENT
        System.out.println(salary3);   //39







    }
}
