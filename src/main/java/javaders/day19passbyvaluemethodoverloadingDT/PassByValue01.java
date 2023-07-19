package javaders.day19passbyvaluemethodoverloadingDT;

public class PassByValue01 {
    /* Pass by value
        1) Java Pass by Value kullanir.
        2) yani; java method larin orjinal degeri degistirmesine musaade etmez
        3) java methodlara deger yollarken orjinal degerin kopyasini olusturur ve o kopyayi methoda a yollar
            Method kopya deger uzerinde degisiklik yapar, boylece orjinal deger korunmus olur
        4)Java esnek bir dildir, Istersek yazdigimiz kod ile   orjinal degerin degismesini temin edebiliriz
        bakiniz line 24:

        Pass By Reference :
        1) Pass by reference da methoda reference yollanir
        2) Reference adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir
            Bu yüzden C# C++ gibi Pass by reference kullanan dillerde method variable orjinal degerini degisitirir
    */

    //Java methodlara deger yollarken orjinali degil kopyasini gönderir.
    public static void main(String[] args) {
        int shirtPrice=100;   //burada pass by value sayesinde shirtprice degeri koruma altina alinir.
        int studentShirtPrice = discount("student",shirtPrice); //methoda gönderirken degeri degil kopyasini gönderir
                                                                     // ve degisen deger kopyasi olur orjinal degil.
        System.out.println("studentShirtPrice = " + studentShirtPrice);  //90
        System.out.println(shirtPrice); //100 degismez

        System.out.println(discount("veteran", shirtPrice));  //80 ==> ya da direk boyle yazdiririz.
        System.out.println(shirtPrice); //100 degismez

        shirtPrice = discount("senior",shirtPrice); //burda orjinal degeri kasten degistirdik
        System.out.println("shirtPrice = " + shirtPrice);  //95


    }

    public static int discount(String type, int price) {  //discount benim methodumun ismi
        switch (type) {
            case "student":
                price = price - 10;
                break;
            case "veteran":
                price = price - 20;
                break;
            case "senior":
                price = price - 5;
                break;
            default:
        }

        return price; //case lerdeki uygun durum sonrasi returnde bize degeri döner
    }
}
