package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {
        //Specific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz.

        String names[] = {"K", "C", "R", "A" ,"S"};
        String el ="A";  //arrayde A yi ariyorum var mi diye

        //1.yol
        int counter =0;
        for (String w : names){
            if(w.equals(el)){  //names Arrayinin icindeki A lari buldukca counter 1 artar.
                counter++;  //ilkini bulduktan sonra gerisine bakmasa da olur o yüzden break ekliyoruz
                            //soruda sadece var mi yok mu diye sormus cunku
                break;
            }
        }

        if (counter>0){
            System.out.println("Array has "+ el);

        }else {
            System.out.println("Array does not have " +el);
        }

        //1.yolda listede 10 bin eleman olsa ve aradigimiz en sonda ise cok zaman ister(birer birer bakar)

        //2.yol ==> binarySearch() ----> hizli arama yapar!!

        //eger elemanlari "sort" ile siralarsak isimiz kolaylasir.
        //Java önce ortadaki elemana bakar(zaten alfabetik sirada) soldakine ve sagdakine bakar elemanin olmadigi kismi kopmle eler,
        //daha sonra buldugu tarafi da ortdan taramaya baslar ve yine elemanlari ortadan taramaya baslar.
        //boylece hizli calisir
        //Bu islemi bir method yardimiyla yapar "binarySearch()"


        //1) binarySearch() methodu sort() kullanmadan kullanmayiniz!! Cunku binarySearch() mantigi sirali elemanlar icin gecerlidir.
        //2) binarySearch() methodu var olan elemanlar icin size o elemanin indexini verir
        //3) binarySearch() methodunda aldiginiz index 0 veya buyukse bu eleman array'de var demektir.
        //4) binarySearch() methodu olmayan elemanlar icin negatif tamsayi degeri verir
        // "-" isaretinin anlami o eleman yok demektir
        // "sayi" ise o eleman olsaydi kacinci eleman olurdu demektir.

        Arrays.sort(names); //
        int result = Arrays.binarySearch(names,"A");  //bize indexi verir
        //int result = Arrays.binarySearch(names,el);  el yazarsak String deki deger degistikce burdaki degisir!!
        System.out.println(result);  //index verirse o harf vardir.

        if (result>0){
            System.out.println("Array has "+ el);

        }else {
            System.out.println("Array does not have " +el);
        }

        //negatif senaryoda
        int result2 = Arrays.binarySearch(names,"E");  //bize -3 verir ; yani olusturulan siralamda olsaydi 3. sirada olurdu demek!
                                                           //index numarasi degil sira numarasini verir!!!!!!!!
        System.out.println(result);


    }
}
