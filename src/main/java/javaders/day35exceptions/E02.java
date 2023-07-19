package javaders.day35exceptions;

public class E02 {

    public static void main(String[] args) {


        //Example 1:Bir String'deki character'i index kullanarak alan bir method olusturunuz
        System.out.println(getCharFromString("Java",2));
        System.out.println(getCharFromString("Java",8));
    }

    public static char getCharFromString (String str, int idx){
        try{
            return str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){ //Stringlerde olmayan index kullanildiginda atilir.
            idx =Math.abs(idx);  //mutlak degeri al, negatif yazmalara karsi
            idx= idx%str.length();   //lenght 4 oldugundan 8'i 4e bolup indexin yeni degerini 4 indexten biri yapariz ve 0 olur;bu yüzden J verdi

            return str.charAt(idx);
        }

    }
}
