package javaders.day35exceptions;

public class E01 {

    /*
    Exception Class sayesinde mesela Array'de kullanmamam gereken seyler kullandigimda Java bunu engeller.
    Not :NumberFormatException'i alinca exception'i handle etmek icin method body'si icine try ve catch yazdik.
    try body'si icine return Integer.valueOf(str) yazdik. catch icine ilgili exception ismini e harfi ile yazdik.
    catch body'si icine replaceAll methodu ile rakamdan farkli karakterleri sildik. kalani yine str'ye assign ettik.
    Ardindan return kismini yazinca java artik hata vernmedi.

     */

    public static void main(String[] args) {
        System.out.println(convertStringToInt("123")+2);
        System.out.println(("12ab")+2);


    }

    //Bir String'i Integer'a ceviren method olusturunuz.
    public static int convertStringToInt(String str){

        try {
            return Integer.valueOf(str);

        }catch (NumberFormatException e){ //NumberFormatException valueOf() method'u non-digit charcater iceren bir String
                                          // ile kullanildiignda atilir.
            str= str.replaceAll("[^0-9]","");
            return Integer.valueOf(str);
        }
    }
}
