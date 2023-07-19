package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {

    /*
    1)Application'larda "data" ile bu data'larin isleyen kod'lar(Logic) birbirinden ayrilir.
    Yani Logic data'ya bagimli olmamalidir.
    Datay'ya bagimli olarak yazilan kodlara "Hard code" denir.
    Hard code hatali kod demektir.

    Asagidaki grades array'inde son elemani almak icin "4" veya "grades.length-1" kullanilabilir.
    "4" kullanirsaniz, array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.lenght-1"
    kullanirsaniz hep dogru sonucu alirsiniz.
     */

    public static void main(String[] args) {

        //Array'leri kisayoldan nasil olustururuz

        // int grade[]= new int[5];  //grade :not
        int grades[]= {67,98,100,34,76};
        System.out.println(Arrays.toString(grades));  //[67, 98, 100, 34, 76]


        //Interview sorusu
        //Example 1:grades array'indeki en kucuk ve en buyuk array'in toplamini ekrana yazdiran kodu yaziniz.
        // Önce siralariz ==> 34<67<76<98<100 ve ilk ve sonu aliriz.

        Arrays.sort(grades);   //sort: sirala demek

        System.out.println(Arrays.toString(grades));  //[34, 67, 76, 98, 100]

        System.out.println(grades[0] + grades[grades.length-1]);  //134

        //Application larda "data" kismi ve "action" kismi vardir !!
        //data kismnida istegiimiz kadar degisiklik yapabliriz.
        //data degistignde kod bozuluyorsa hard kod'dur ve istenemz!!!

        //Arrays.sort(aileUyeleri); //sayilari kucukten buyuge, stringleri alfabetik siralar.

        //Example 2: Size verilen bir String Array'deki isimlerden 5 character'den az character icerenleri console'a yazdiriniz

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for(String w : stdNames){
            if(w.length()<5 ){

                System.out.println(w);
            }
        }

        //Example 3: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        //           isimlerden onceki isimleri console'a yazdiriniz

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames)); //[Ajda, Ayhan, Cuneyt, Filiz, Tom]

        for (String a: stdNames){

            if(a.charAt(0)<'F'){
                System.out.println(a);
            }

        }
        //ya da
        for (String a: stdNames){

            if(a.startsWith("F")){
                break;
            }
            System.out.println(a);  //Filizi de yazdirmaz, Filizden sonrakileri de kontrol etmez!!!Boylece zaman kazanmis olur.
        }

        System.out.println();

        //Example 4: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        //           isimlerden onceki isimleri ve F ile baslayan isimleri console'a yazdiriniz
        Arrays.sort(stdNames);
        for (String a: stdNames){

            System.out.print(a +" ");        //Bu soruda once yazdirir sonra loop'u kirar bu yüzden Filiz de dahil olur.!
            if(a.startsWith("F")){
                break;                       //!
            }

        }

        //Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        //           isimler haric diger isimleri console'a yazdiriniz


        Arrays.sort(stdNames); //sort() methodu numerik datalari kucukten buyuge(asending) dizer,
                               //String leri ise alfabetik sirada (alphabetically) dizer.
                               //asending + alphabetically ==> Natural Order

        for (String a: stdNames){

            if(a.startsWith("F")){
                continue;     //bosver gitsin demek!  ==> spesifik datalari isleme sokmak istemiyorsak continue kullanilir.
            }
            System.out.print(a+ " ");  //Ajda Ayhan Cuneyt Tom
        }

        System.out.println();

        //2.yol
        for (String a: stdNames){
            if(!a.startsWith("F")){
                System.out.print(a+ " ");
            }
        }

        //stand alone : kendi basina ayakta durabilen; her application kendi basina ayakta durabilmeli














    }

}
