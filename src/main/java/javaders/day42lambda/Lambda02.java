package javaders.day42lambda;

import javaders.day41lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {
        System.out.println(getSumInTheGivenRange(7, 10));  //34
        System.out.println(getMultiplicationInTheGivenRange(7,10));
        System.out.println(getSumOfDigitsInTheGivenRange(45,47));

    }

    private static List<Integer> swap(int starting, int ending){  //bu kod tekrarlanyacgi icin method olusturup method cagirdik
        //alinti not : ilk değer ikinci değerden büyükse rangeClosed() hata verir bu yüzden verilen değerleri swap yapmak gerekir
        List<Integer> list =new ArrayList<>(); //bos bir List olusturduk.
        if(starting>ending) {  //ise iki sayinin yerini degistirmeyi saglar.
            starting= starting+ending;
            ending=starting-ending;
            starting=starting-ending;
        }
        list.add(starting);
        list.add(ending);
        return list;

        //Baslangic ve bitis degerinin yerini once kucuk gelcek sekilde ayarladiktan sonra
        //Bu iki sayiyi depolamak icin List olusturduk.

    }
    //Example 1: 7'den 10'a kadar tam sayilarin toplamini hesaplayan methodu olusturunuz.

    public static int getSumInTheGivenRange(int starting, int ending){

        //Burda List yok o yuzden IntStream kullaniriz(int'i List'in icinde verir)
        //Aralik icin rangeClosed() kullaniyoruz.
        //range() de ilk eleman dahil sondaki dahil degil
        List<Integer> list=  swap(starting,ending);
        return IntStream.rangeClosed(starting,ending).sum();
    }
    //Example 2: 7'den 10'a kadar tamsayilarin carpimini hesaplayan method'u olusturdugunuz.
    public static int getMultiplicationInTheGivenRange(int starting, int ending){
        List<Integer> list= swap(starting,ending);
        return IntStream.
                rangeClosed(starting,ending).
                reduce(Math :: multiplyExact).
                getAsInt();  //int'a cevirdik

        }

        //Exampe 3: 45'den 47'ye kadar olan tamsayilarin rakamlari toplamini hesalayan method'u olusturunuz
        //          45 46 47 ==?
    //          4+5+4+6+4+7 =30

        public static int getSumOfDigitsInTheGivenRange(int starting, int ending){
         //elemanlar degiscegi icin map kullaniirz.==> 45'i 9 yapcak mesela tum elemanlar  icin yaptiktan sonra toplayacak
            // Utils :: getSumOfDigits ==> Utils classInda olusturdugumuz methodu cagirdik
            List<Integer> list= swap(starting,ending);
            return IntStream.rangeClosed(starting,ending).map(Utils :: getSumOfDigits).sum();

        }


    }

