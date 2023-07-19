package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        /*
        1) Array, Java'nin "AYNI DATA TIPINDE" "coklu data" depolamak icin olusturudugu bir yapidir.
                 ==> Arrays birden fazla variable depolamak icin kullanilabilen object(non primitive data)'lerdir.
        2) Array'ler "primitive data type" lar ve "referance" 'lar ile calisir.
        3) Array'ler "super fast"dir ve "memory"de cok az yer kaplarlar.
        4) Arrays'de sadece primitive datalar veya non-primitive datalara ait refernas'lar depolanabilir.
        5) Arrays icindeki tum variable'lar ayni data type'inde olmalidir.
        6) Heap memory de depolanirlar.
        7) Value ile birlikte methodlara da sahiptirler

         */

        //Application olustururken coklu datalari tek bir konteynira koymak icin Arrays kullanilir.

        //Array nasil olusturulur ?
        String stdNames[] = new String[5];  //Array olusturmak icin yazilmasi gereken kod
                                            //Kac data olustrcagimizi en son koseli paranteze ekleriz
                                            //parantez icindeki sayi bize Array'in length ini verir.
        //2.yol String [] stdNames;

        //Array nasil yazdirilir?
        System.out.println(stdNames); //burdaki sonuc bize stack memory deki adresi verir sadece.
        System.out.println(Arrays.toString(stdNames));  //Heap memory deki asil elemanlari yazdirir
        //[null, null, null, null, null]  ==> null lar String in default degeridir.
        // int default deger ==> 0 , tum numarik degerlerin default degeri 0'dir.(byte, short, usw...)
        // boolean default deger ==> false


        //Array'a nasil eleman eklenir?
        stdNames[0]="Ajda";  //index 0'a
        System.out.println(Arrays.toString(stdNames));  //[Ajda, null, null, null, null]--> Arraylar index kullanir
        stdNames[3]="Cuneyt";
        System.out.println(Arrays.toString(stdNames));   //[Ajda, null, null, Cuneyt, null]
        stdNames[2]="Kemal";
        System.out.println(Arrays.toString(stdNames));   //[Ajda, null, Kemal, Cuneyt, null]
        stdNames[1]="Ayhan";
        System.out.println(Arrays.toString(stdNames));  //[Ajda, Ayhan, Kemal, Cuneyt, null]
        stdNames[4]="Filiz";
        System.out.println(Arrays.toString(stdNames));   //[Ajda, Ayhan, Kemal, Cuneyt, Filiz]

        //Array deki spesifik bir elemani nasil alabiliriz

        System.out.println(stdNames[3]);  //Cuneyt

        //Example 1: stdNames array'indeki her ismin sonuna yildiz koyarak console'a yazdiriniz

        //1.yol (for loop , diger looplarla da yapilir)
        for(int i=0 ; i<stdNames.length ; i++){  //length String lerde parantezli(method), Arraylerde parantezsiz kullanilir.
            System.out.print(stdNames[i]+"*");  //Ajda*Ayhan*Kemal*Cuneyt*Filiz*
        }

        //Burdaki length variable'dir. Method olan length degil!!
        //String lerde karakter sayisini java hesaplar bu yüzden methoda ihtiyac duyariz.
        //Ama Array lerde karakter sayisini biz zaten biliyoruz [ ] icinde.


        System.out.println(); //dummy

        //2.yol: for-each loop ==> Enhanced(zengisletirilmis) Loop -Mümkünse hep for-each loop kullanin, degilse digerlerini kullanin
                                //[Ajda, Ayhan, Kemal, Cuneyt, Filiz]
        for(String w : stdNames){  //String cunku elemanlar String

            System.out.print(w + "*");      //Ajda*Ayhan*Kemal*Cuneyt*Filiz*

        }
        //for-each loop genellikle Array lerde kullanilir.

        System.out.println();


        //Exapmle 2: Bir Integer Array olusturunuz, 5 eleman ekleyiniz, elemanlarin toplamini bulup console'a yazdiirniz
        int num[] = new int[5];
        System.out.println(Arrays.toString(num)); //[0, 0, 0, 0, 0]
        num[0]=12;
        num[1]=23;
        num[2]=9;
        num[3]=38;
        num[4]=27;
        System.out.println(Arrays.toString(num));  //[12, 23, 9, 38, 27]

        int toplam= 0;
        for(int w: num){
            toplam = toplam +w;
        }
        System.out.println(toplam);  //109


        //Example 3: Bir char Array olusturunuz, 3 eleman ekleyiniz, elemanlarin carpimini bulup console'a yazdiriniz.
        char ch[]= new char[3];
        System.out.println(Arrays.toString(ch));

        ch[0]='J'; //74
        ch[1]='P'; //80
        ch[2]='A'; //65
        System.out.println(Arrays.toString(ch));
        int carpim =1;  //sonuc 0 olmasin diye 1 ekliyoruz

        for (char w :ch ){
            carpim =carpim * w;
        }
        System.out.println(carpim); //384800

        //char lar matematiksel islemlerde kullanilirsa ascii degerleri carpilir.



















    }
}
