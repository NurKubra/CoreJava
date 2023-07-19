package javaders.day36exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
    /*

    1) Run butonuna bastiktan sonra konsolda alinan exception'lara "Run Time Exception" denir.
      Aritmetic Exception, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, StringIndexOfBoundsException
      "Runtime Exception"a ornektir.
      "Runtime Exception" lara "Unchecked Exception" da denir.

    2)Code yazarken kirmizi alt cizgi seklinde alinan Exception'lar da vardir, bunlar "Compile Time Exception" denir.
      FileNotFoundException, IOException "Compile Time Exception"a ornektir.
      "Compile Time Exception"lara "Checked Exception" da denir.

    3)FileNotFoundException --> dosya bulunamadi hatasi
                                Java'ya bir dosyayi bul dedigimizde, Java "Dosyanin adresi ve Dosyanin varligi" konusunda
                                hata olusursa ne yapmasi gerektigini soylemenizi ister.
    4)IOException : "IO" Input Output demektir.
                     Note: IOException, FileNotException'in parent'idir.

    5)Java da hata'lar temelde 2 ye ayrilir.
       i) Exception'lar(cozumu olan problemler)
       ii) Error'lar--> a)StackOverflow Error(Stack Memory'nin dolmasi hatasi)-Kod ile duzeltimez, yeni hafiza gerek
                        b)Out of Memory Error (Heap Memory'nin dolmasi hatasi)
                        c)Virtual Machine Error(javanin icindeki sanal makinada olusabilcek hata)

       Exceptionlar handel edilebilir, ama errorlar handel edilemez!

    Run butonuna bastiktan sonra cikan exception'lara "run Exception" denir.
    Kodu yazarken veren hatalara compile time exception.

    sirayla;
    parantez icine yazilan(yesil) dosyayi bul dedik
    read methodu gelcek dosyadaki ilk karakteri alcak alcak ama direk karakteri degil ascii degeri alir.
    Mesela ilk harf icin L(ascii degeri 76) 76!= -1 dir yani kod calisir, ve ekranda char halini yani buyuk L yazdirir.
    read methodu alt satira gectigini anlar ve satirlar bittiginde -1 döndürür ve loop kirilir.


     */
                                                                 //Exception aldiginda haberim olsun anlamina gelir
    public static void main(String[] args) throws IOException {  //throws FileNotFoundException  "more action--> add method" secerek elde ettik
                                                                           //bu dosya yerinde yoksa haber ver demek
                                                                 //Asagidaki kodlari yazinca read methodunu kullanabilmek icin bu sefer ==> Parent'i olan
                                                                 //IOException'a cevirdi.
        FileInputStream fis= new FileInputStream("src/main/java/javaders/day36exception/TestFile"); //bu adrestedki file i bul dedik
        //1.way :Exception'i method signature satirina ekledik
        int i = 0;
        while ((i= fis.read())!=-1){  //read methodu bize ascii degerleri verir. Ascii -1 olana kadar kodu calistir.Butun karakterler bitince -1 olur.
            System.out.print((char) i);  //i ascii degerler ==> bu yüzden ascii degerleri char'a cevirdik. ln kaldirdik yan yana yazsin diye

        }
    }
    //2.durum ;
  /*  public static void main(String[] args){
        try {
            FileInputStream fis= new FileInputStream("src/main/java/javaders/day36exception/TestFile");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/

    //Code yazarken kirmizi cizgi ile hata oldugunu bildirdi ve cozum olarak 1. ve 2. yolu yapabiliriz.



    }

