package javaders.day09stringmanupilationsifstatement;

public class C01_StringManipulations {

    public static void main(String[] args) {

        //Example : Bir String'in hic karakter icerip icermedgini kontrol eden kodu yaziniz.

        String str=""; //hiclik

        //1.yol //Ajavaya 2 islem yaptiridm 1. lenght() kullandim 2. ==0 kullandim.
        boolean result =str.length()==0;  //hic karakter yoksa true karakter varsa false
        System.out.println("String bos mu ? = " + result); //true

        String str1=" ";
        boolean result1 =str1.length()==0;
        System.out.println("String bos mu ? = " + result1); //false



        //2.yol
        //********* isEmpty() ******\\

        //isEmpty() methodu String datanin icinde bir sey yoksa true dondurur.
        //space de bir karakter oldugu icin false dondurur.
        //yalnica hiclik icin true döndürür.

        boolean result2 = str.isEmpty();// Javada bir islem yaptirdik. Bu tercih edilir.
        System.out.println("String bos mu ? = " + result2);  //true  //3 islem yaptiridk


        //Example : Bir String datanin space haric hic bir karakter icerip icermedigini gosteren kodu yaziniz.
        String t ="  ";
        //1.yol
        boolean t2 =t.replace(" ","").length()==0;
        System.out.println("t2 = " + t2); // true     //2 islem yaptirdik.

        //2.yol
        boolean t3 =t.replace(" ","").isEmpty();
        System.out.println("t3 = " + t3); //true      //1 islem yaptirdik.

        //3.yol
        // ************** isBlank() ***********\\
        /*
        isBlank()  ==> space + hiclik ise True döndürür.
        String bir datanin bos mu dolu mu olduguna bakar isEmpty'den farki space varsa yine true döndürür.
        Boolean bir deger döndürür.
        isEmpty'den farki variable'da sadece space varsa bos mu dolu mu diye soruldugunda
            isBlank==Bos der
            isEmpty==Bos degil der

         */

        boolean t4 = t.isBlank();
        System.out.println("t4 = " + t4); // true


        //Example : Bir Strin'in "*" haric hicbir karakter icermedigini kontrol eden kodu yaziniz

        String a= "*";
        boolean sonuc = a.replace("*","").length()==0;
        boolean sonuc2 =a.replace("*","").isEmpty();
        System.out.println("sonuc = " + sonuc);  //True
        System.out.println("sonuc2 = " + sonuc2);  //True
        //ikisi de ayni sonucu verir.
        //Char konteynirina koyamyiz cünkü hicligi karakter kabul etmez.


        //************* indexOf() ***********\\
        /*
        indexOf() verilen karakter veya karakterlerin ilk gorunumunun indexini verir.
        Tek bir karakter ya da coklu karakter kullanilabilir.
        Coklu data kullanildiginda ilk gordugu datanin ilk karakterinin indexini verir.
        int deger dondurur.
        Olmayan bir karakterin indexini -1 olarak döndürür.
         */

        //Exapmle : Bir string de a,i,e karakterleinin ilk gorunumun indexleri toplamini ekrana yazdiriniz.

        String s ="Java is easy to learn";    //1+5+8 =14
        int aIdx =s.indexOf('a');
        System.out.println("aIdx = " + aIdx); // aIdx=1
        
        int iIdx = s.indexOf('i');
        System.out.println("iIdx = " + iIdx);  //iIdx = 5

        int eIdx = s.indexOf('e');
        System.out.println("eIdx = " + eIdx);  //eIdx = 8

        System.out.println("indexler toplami = " +(aIdx + iIdx + eIdx));  //14
        
        
        String s2 ="Java is easy to learn to easy to";
        int idx = s2.indexOf("to");
        System.out.println("idx = " + idx);  //13 ilk gordugu kelimenin ilk karakterini dondurur.
        
        int s3 = s2.indexOf('p');
        System.out.println("s3 = " + s3);    //Olmayan karakterin indexini -1 olarak döndürür.
        
        //Example : Bir String de "Java" kelimeisnin ilk olarak kacinci Index de oldugunu gosteren kodu yaziniz.

        String cumle= "Ah Java vah Java sen ne guzel seysin Java";
        int indexJava= cumle.indexOf("Java");
        System.out.println("indexJava = " + indexJava); //3 

        int indexQ =cumle.indexOf("QYX");
        System.out.println("indexQ = " + indexQ);  //-1 olmayan bir sey icin -1 döndürür.

        //************ lastIndexOf ************\\
        /*
        lastIndexOf()
        Bu method sondan baslar.
        Verilen String bir datada istenilen degerin son görünümünün indexini verir.
        Istenilen karakter ya da karakterlerin sondan baslayarak kacinci indexte oldugunu verir.
        Olmayan bir karakter sorulursa -1 verir

         */
        //Example: Bir Stringdeki a,i,e karakterlerinin son gorunumunun indexleri toplamini yazdiriniz.

        String c = "Java is earn to learn";
        int aIndex = c.lastIndexOf('a');
        int eIndex = c.lastIndexOf('e');
        int iIndex = c.lastIndexOf('i');

        System.out.println("son görünüm indexler toplami = " +  (aIndex + eIndex + iIndex)); //40











    }

}
