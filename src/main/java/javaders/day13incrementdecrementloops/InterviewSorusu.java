package javaders.day13incrementdecrementloops;

public class InterviewSorusu {

    public static void main(String[] args) {
        // Example : Bir String'i ters ceviren kodu yaziniz.
        //ters yazdiran derse char kullanbilirdik.

        //1.way
        String t= "Java";
        //yeni bir String olusturuz bu yüzden once Memory de bos bir konteynr aciyorum yeni String icin
        String ters= "";


        for(int i=t.length()-1 ;  i>=0 ; i--){
            ters = ters + t.substring(i,i+1); //ters + yazarak concatination yapmayi saglar !!!!!

            //System.out.println(ters); burada yazdirma islemimizi yaparsak butun adimlari yazdirir
            //x
            //xe
            //xep
            //xepA
        }
        System.out.println(ters);

        //sartlar tamamlandiginda loops un gorevi tamamlancak ve ilk String icin islem tamamlandi.
        //daha sonra disardaki kodu calistirdik.
        //sout' u disari yazdirdik cunku kodun basamaklarini degil son halini görmek istiyoruz.


        //2.way
        String u= "Java";
        String ters2= "";
        for(int i=u.length()-1; i>=0 ; i--){
            ters2 =ters2 + u.charAt(i);   //chari String hale cevirmek(concatination) Java icin extra is olur
        }
        System.out.println(ters2);


        System.out.println(u);
        System.out.println(ters2);
        //memroy e string halde iki hazir data olusturmus olduk.



        //Example 2: Bir tamsayinin rakamlari toplamini veren kodu yaziniz.
        //578 ==> 5+7+8

        int sum=0;  //rakamlri toplami yeni bir data oldugunda kutuya ihtiyacimiz var
        int n= -578;
        n= Math.abs(n);  //Bu sekilde - sayilar icinde gecerli hale getirdik. abs ==> Mutlak deger demek!!
        //absoulate value ==> Mutlak deger

        for (int i= n ; i>0 ; i=i/10){  // alterntf i/=10
            sum = sum + i%10;
            //altrntf  sum += i%10;
        }
        System.out.println(sum);


    }
}
