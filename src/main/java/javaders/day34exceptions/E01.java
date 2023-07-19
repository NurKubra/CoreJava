package javaders.day34exceptions;

public class E01 {

    /*
    1) "Exeption" beklenmedik problem demektir(umulmadik hata)
    2) "Exeption"i halledebilmek icin iki tememl yol vardir;
        i) "Exeption" a uygun cozumler uretebilirsiniz. Buna "Exeption Handling" denir.
        ii) "Exeption" olustugunda bunu ilan eder ve geri cekilirsiniz. Buna da "Throw Exeption" denir.
    3)Exception'a uygun cozumler uretmede "try-catch" kullanilir.
      "try block" da yapilmasi gereken islemi Java'dan yapmasi istenir.
       Java islemi problesmiz bir sekilde yaparsa "cath block"  Java tarafindan okunmaz.
       "try block" da islem yapilirken "Exception" olusursa "catch block" devreye girer ve "catch  block" icindeki kodlar calisir.
    4) "try block"da islem yapilirken "Exception" olusursa "try block"  icindeki Exception'dan sonraki kodlar calistirilmaz

    ArithmeticException: matematik ile ilgili herhangi bir kural ihlal edildiginde atilir.
    > matematik islemlerinde umulmadik hatalarda verir
    > riskli matematik islemlerinde bu hataya karsi try-catch kullanilir.
    Exception aldiginizda Applikation'unuz durur. Benzin bittiginde arabanin gitmemesi gibi.
    Toplama isleminde toplanamayan sayi yoktur.
    Toplamada, cikarmada ya da carpmada yazmaya gerek yok.
     */
    public static void main(String[] args) {
        System.out.println(divide1(12,3));
        System.out.println(divide1(6,0));  //ArithmeticException: / by zero

        System.out.println(divide2(12,3));
        System.out.println(divide2(6,0));

    }

    //1.Way : Exeption'i handel etmede ilk yol;
    public static  int divide1(int a, int b) {  //if blogu sayesinde hatayi ortadan kaldirdik.
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }

    }
    //2.Way : Exeption'i Handel etmede harika yol
        public static int divide2(int a, int b){
         int result=0;
         try {   //bolmeyi dene dedikten sonra neyi denemsi gerektigini ve olmazsa ne olcagini yazmak lazim
             result =a/b;
             System.out.println("I am here");  //once "I am here" sonra da sayiyi yazdirir.
         }catch (ArithmeticException e){    //matemetik ile ilgili butun problemi bu sekilde cozebiliriz.OLuscak sorunla ilgili kod da yazilabilir,
             System.out.println("Do not divide any number by zero");
         }
         return result;

        }
    }

