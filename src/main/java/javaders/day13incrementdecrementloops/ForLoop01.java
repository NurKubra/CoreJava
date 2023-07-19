package javaders.day13incrementdecrementloops;

public class ForLoop01 {

    //Note : Bir string'de son index her zaman length()-1
    //Note : Yazdiginiz kod belli senaryolar icin calisiyor ancak tüm senaryolar icin calismiyorsa;
    //bu tarz koda ==> hard-code denir ==> ve mutlaka düzeltilmelidir

    public static void main(String[] args) {

        //Example 1: 21 den 180 e kadar hem 4 hemde 6 ile bolunebilen tamsayilari ekrana yazdirabilen kodu yazdiriniz

        for (int i=21; i<181 ; i++){
            if(i%4==0 && i%6==0){
                System.out.print(i+" ");
            }
        }

        //Example 2 : Size verilen kucuk harfle yazilmis String'in indexi cift sayi olan karakterlerini buyuk harfe donusturunuz
        //ankara ==> AKR
        String s ="ankara";

        for (int i=0 ; i<s.length() ; i++){
            String ch = s.substring(i,i+1);
            if (i%2==0){
                System.out.print(ch.toUpperCase());
            }
        }

        //String bir variable icine yerlestiridk bu sayede toUpperCase kullanabildik.
        //char konteynra yerlestirisek charAt kullaniriz.


        //Example 2.yol  //ama bu yontemle tekrarli harf olmasinda dogru sonuc vermedi
        String st = "miami";
        for(int i =0; i<st.length(); i++){
            String ch2= st.substring(i,i+1);
            if (i%2==0){
                st = st.replace(ch2, ch2.toUpperCase());  //tekrari harf oldugunda hepsini degistirir.
            }
            System.out.println(st);
        }



    }
}
