package javaders.day14loops;

import java.util.Scanner;

public class Loops02While {
    public static void main(String[] args) {
        //3'den 8'e kadar tum tamsayilari console'a yazdiran kodu yaziniz

        //1.way

        for (int i=3; i<9 ; i++){
            System.out.print(i+" ");
        }

        System.out.println("");

        //2.Way
        int i=3;  //baslangic degeri en tepeye yazilir

        while(i<9) {  //sart kismi parantez icine yazilir
            System.out.print(i + " ");
            i++; //increment-decrement asagiya yazilir (islemi yap sonra arttir)

        }
        //for ile yaptigin herseyi while ile yapabilirisin

        System.out.println();

        //Example : 21 den 180 e kadar hem 4 hemde 6 ile bolunebilen tamsayilari ekrana yazdirabilen kodu yazdiriniz
        //1.way
        for (int k=21; k<181 ; k++){
            if(k%4==0 && k%6==0){
                System.out.print(k+" ");
            }
        }
        System.out.println();

        //2.way  //okunurluk acisindan kolay olmasi nedeniyle ihtiyac duyulmustur.!!
        int k=21;
        while (k<181){
            if(k%4==0 && k%6==0) {
                System.out.print(k + " ");
            }
            k++;
        }

        System.out.println();

        //Example : Size verilen kucuk harfle yazilmis String'in indexi cift sayi olan karakterlerini buyuk harfe donusturunuz
        //miami==> MiAmI

       /* //1.way
        String s ="miami";

        for (int i=0 ; i<s.length() ; i++){
            String ch = s.substring(i,i+1);
            if (i%2==0){
                System.out.print(ch.toUpperCase());
            }
        }
        *\

        */

        //2.way
        String s ="miami";

        int m=0;
        while (m<s.length()){
            String ch =s.substring(m,m+1);
            if (m%2==0){
                System.out.print(ch.toUpperCase());
            }else {
                System.out.print(ch); // eger cift karakter degilse direk yazdirir.
            }
            m++;  //bu kismi unutmayin yoksa "infinite loop" olusur.Yani "sonsuz loop" ulasir.

        }
        System.out.println();

        //Kodlar RAM de calsir harddisk de degil!!

        //Example : Size verilen tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz
        int r =578;
        r=Math.abs(r);  //mutlak deger yapma !!
        int sum =0;

        while (r>0){
            sum = sum +r%10;

            r=r/10;
        }
        System.out.println(sum); //5+7+8=20



        //Example : Kullanicidan aldiginiz sayi icin carpim tablosu olusturan kodu yaziniz
        //3x1=3 3x2=6 3x3=9 .....3x10=30

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number ...");
        double n =input.nextDouble();

        int u =1;
        while (u<11){

            System.out.println(n+ "x" + u + "=" + (n*u));
            u++;
        }


        //Example :Kullanicidan aldiigniz String deki sessiz harfleri console'a yazdiran kodu yaziniz
        //Alabama == > lbm
        //Hello ==> hll

        //1.way
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word..");
        String y = scan.next();

        int z=0;
        while (z<y.length()){

           char ch = y.charAt(z);
           boolean x= ch=='a' || ch=='e' || ch== 'i' || ch=='o' || ch=='u'||ch=='A' || ch=='E' || ch== 'I' || ch=='O' || ch=='U';
           //Parantez ici sade olmasi acisindan x e kisattik !!
           if(x) {
               z++;  //Burda while döngusunde continue kullandigmiz icin mutlaka "z++;" eklemeliyizz!!!!!!
               continue; //if dogruysa bunlari haric tut
           }else{
               System.out.print(ch); //hll
           }
            z++;
        }

        System.out.println();

        //2.way
        int v=0;
        while (v<y.length()){

            char ch = y.charAt(v);
            boolean x= ch=='a' || ch=='e' || ch== 'i' || ch=='o' || ch=='u'||ch=='A' || ch=='E' || ch== 'I' || ch=='O' || ch=='U';
            if(!x) {  //sesli harf degilse yazdir !!!
                System.out.print(ch); //hll
            }

            v++;
        }



    }

}
