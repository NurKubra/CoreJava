package javaders.day18constructorsstatickeyword;

public class Student {

    //Örnek ; Static olma durumunda; mesela bir okulun ogrenci sayisi static olarak verilir. Bu sayede, ögrenciler,
    //Ogretmenler, Mudur, Aileler ogrneci sayisi ile ilgili bir degisiklik oldugunda haberdar olurlar.
    //Ama bir ogrencinin geliri non-static'tir yani onunla ilgili bilgi sahibi olamazlar.


    /*
    1)static class member'lar (variable +method +constructor +code blocks) tum object'ler tarafindan paylasilir.
    2)static class member'lardaki degisiklikler tum object'ler tarafindan otomatik olarak görülür.
    3)static class member'lar gökteki ayin dunyaya bagli oldugu gibi, class'a baglidirlar.
      Bu yüzden "static variable"lara  "class variable" da denir.
    4)static class member'larin nasil calistigini anlamak icin cizim yapip static olanlari class'a olmayanlara object'e
    baglayarak dusunmek bu konuyu kolaylastirir.
    5)"static" class member lari cagirmaik icin object olusturmak gerekmez ve tavsiye edilmez.
          "non-static" "class member"lari cagirmak icin object olusturmak sarttir.


     */

    /*
    non-static == instance variable == object variable
     */
    public static int numOfRegisteredStd =0;
    public int num =0;

    public Student( ){
        numOfRegisteredStd++;
        num++;
    }

    public static void main(String[] args) {

        Student s1= new Student();
        System.out.println(numOfRegisteredStd);
        Student s2= new Student();
        System.out.println(numOfRegisteredStd);
        Student s3= new Student();
        System.out.println(numOfRegisteredStd);


        System.out.println(s1.num);
    }
}
