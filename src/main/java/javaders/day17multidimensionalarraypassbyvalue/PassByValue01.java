package javaders.day17multidimensionalarraypassbyvalue;

public class PassByValue01 {
    /*
    Method olusturmak icin asagidaki 5 adimi takip ediniz:
    1)Access Modifier
    2)Return Type
    3)Method ismi
    4)Method parantez
    5){} Method body'si

    Note: "main" methodun icindeki tum methodlar static olmalidir!
            Bir methodu static yapmak icin "access modifier" ile "return type" in arasina
            static yazmak yeterlidir.
     */
    /*
    Pass by Value:
    1) Java "Pass by Value" kullanir.
    2) Yani; Java method'larin orjinal degerin degismesine musaade etmez
    3) Java method'lara deger yollarken orjinal degerin kopyasini olusturur ve kopyayi methoda yollar.
       Method kopya deger uzerinde degisiklik yapar, boylece orjinal deger korunmus olur.
    4) Java Esnek bir dildir. Istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebilirz.
    Pass by Reference
    1) Methoda reference yollanir.
    2) Reference adres demektir. Adres yollninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir.
    Bu yüzden "C#" gibi Pass by Reference kullanan dillerde method variable'in orjinal degerini degistirir.
     */

    public static void main(String[] args) {

        int shirtPrice =200;
        System.out.println(discount("student", shirtPrice));  //burda indirim yapmis olmasina ragmen ==> 180
        System.out.println(shirtPrice);                            //burdaki asil fiyati degistirmez ==> 200

        //ilk sout da diyorumki discount methodunu bul type icin student price icin shirtPrice al.
        //Bu durumda asagidaki methoddaki duruma gore hesaplayip ögrneci icin olan price i 180 olarak veriyor
        //ikinci sout da "passByValue" kullanarak orjinal price'i korur.
        //yani orjinal datayi koruyarak kopyasini method da kullanir.
        //methodlarin datalari degistircegini bilir bu yüzden orjinal degeri korur ve degismesine izin vermez
        //Bu duruma "Pass by Value" denir.

        shirtPrice =discount("veteran", shirtPrice);  //Bu sekilde orjinal fiyati degistirebileriz !!!!Pass by Reference
        System.out.println(shirtPrice);  //160
    }

    //Discount method'u olusturunuz!
    public static int discount(String type, int price){  //tip ve ücret

        switch (type){
            case "student" :
                price =price -20;
                break;
            case "veteran" :
                price =price-40;
                break;
            case "senior" :
                price =price-30;
                break;
            default:
                price= price;
        }
        return price;
    }
}
