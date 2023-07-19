package javaders.day34exceptions;


      /*
      NullPointerException String class'da "null" ile uyumlu olmayan method'lar kullanildiginda atilir.
      Interview sorusu ; hangi durumda Exception aldiniz ? nasil cözdünüz? Exception ne zaman alinir.?
       */
public class E03 {
    public static void main(String[] args) {
        System.out.println(getNumOfChars("Java"));  //4
        System.out.println(getNumOfChars("Money"));  //5
        System.out.println(getNumOfChars(""));
        System.out.println(getNumOfChars(null));  //NullPointerException

    }

    //Bir String'deki eleman sayisini veren method olusturunuz

    public static int getNumOfChars(String s){
        // ilk hali :return s.length();

        int result =0;
        try {
            result =s.length();
        }catch (NullPointerException e){
         //1. yol==>    return 0;     //null'i bos String gibi kullaniyorum.
         //2.yol ==> mesaj vererek;
            System.out.println("Some String methods do not work with null..");
         //3.yol ==> Javanin varsa eger kendi teknik mesajini verir
            System.out.println(e.getMessage());  //Cannot invoke "String.length()" because "s" is null
        }
        return result;
    }

}
