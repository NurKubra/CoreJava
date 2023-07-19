package javaders.day35exceptions;

public class E03 {

    /*
    1)try block'dan sonra coklu catch block kullanilabilir.
      catch block'lar arasinda Parent-Child iliskisi yoksa Catch-block'lar istenildigi gibi siralanabilir
      catch block'lar arasinda Parent-Child iliskisi varsa Child ustte olmalidir.
    2)"Exeption Class" tum Exception'larin Parent'idir.
       Coklu Catch Block kullanmak yerine sizden istenen fonksiyonu karsiladigi surece tek catc block'i
       "Exception Class" ile kullanabilirsiniz.
    3)"try +1 catch"- "try + cok catch" olur. Ama "try" tek basina kullanilamaz.
    4)"try" catch block olmadan kullanilabilir mi ?
      "try + finally" olabilir.
     */
    //Example 1: Bir String' i integer'a ceviren ve bu integer' String'in lenghtin 1 eksigine bolen method'u olusturunuz

    public static void main(String[] args) {
        System.out.println(covertStringToIntDivideByLenght("124"));
        System.out.println(covertStringToIntDivideByLenght("Learn Java earn money"));  //NumberFormatException ==> mutlaka rakam verilmeli bos olursa da olmaz
        System.out.println(covertStringToIntDivideByLenght("2"));  //ArithmeticException  ==> 2/0 olcagi icin bu hatayi verir.
        System.out.println(covertStringToIntDivideByLenght1("6"));


    }

    public static int covertStringToIntDivideByLenght(String str){
        int result =0;
        try{
            int a =Integer.valueOf(str);
            result= a/(str.length()-1);
        }catch (NumberFormatException e){
            System.out.println("Non-Digit character cannot be used in valueOf()");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());  //javanin kendi mesaji
        }

        return result;  //0 ilk dedegri 0 oldugundan altta extra bir 0 cikar

    }

    public static int covertStringToIntDivideByLenght1(String str){
        int result =0;
        try{
            int a =Integer.valueOf(str);
            result= a/(str.length()-1);
        }catch (Exception e){  //Tum exception'lar icin kullanilir.
            System.out.println(e.getMessage());  //javanin kendi mesaji
        }
        return result;  //0 ilk dedegri 0 oldugundan altta extra bir 0 cikar

    }

    public static int covertStringToIntDivideByLenght3(String str){
        int result =0;
        try{
            int a =Integer.valueOf(str);
            result= a/(str.length()-1);

        }catch (ArithmeticException e){
            System.out.println("Jump");

        }catch (Exception e){       //Exception Class butun Exception class'larin Parent'idir.
            System.out.println(e.getMessage());
        }

        return result;




        /*
        Stringden karakter almak icin charAt() kullaniriz. getCharFromString isimli methodumuz icine
        parametre olarak String olan "Java"yi yazdik ve virgul sonrasi index olarak 2 yazdik
        ve Java sout icine bunu yazip calistirmamiz ile hata verdi. Olmayan indexi istedigimiz icin
        exception olustu. indexin negatif bir sayi olmasi halinde Math.abs() methodu ile negatif indexi
        pozitife cevirebiliriz. Exception'i handle ederken catch kisminda Math.abs(idx); yazarak problemi
        giderebiliriz. Pozitif sayiya donusen indexi int olan index'e tekrar aktardik.

        Index 8 ise, 8.indeximiz yok. Bunun exception'a neden olmamasi icin indexi modules
        kullanarak lengthden az cikmasini saglariz. Modules bize kalani verir ve kalan lenghden daha kucuk olacaktir.
        Ornegimizde 8. indexi modules ile 4'e bolduk ve kalan 2 oldu. Neden 4'e bolduk? Cunku bizim Stringimizin
        lengthi 4'tur. Modules islemi sayesinde olmayan degil olan indexi istemis oluruz.

         */
    }
}
