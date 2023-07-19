package javaders.day13incrementdecrementloops;

public class ForLoops03NT {
    public static void main(String[] args) {

        //Interview Sorusu : Break ve continue arasindaki fark nedir?

        //Break switch'in disari cikmak icin ve Loop'u kirmak icin kullanilinir
        //continue ise Loop yaparken bazi elemanlari isleme sokmamak icin kullanilir.

        //Example : verilen bir String de kucuk harfleri console'a yazmayiniz.

        String pas = "Pwd12?Ab";

        for (int i=0 ; i<pas.length(); i++){
            char ch =pas.charAt(i);
            if (ch>='a' && ch<='z'){
                continue;     //bosver demektir. Yani bu sart saglanirsa hic bir sey yapma devam et demek
            }else {
                System.out.print(ch);
            }
    }

        //break loop'u kirar , continue ise bazi elemanlar icin islem yapmaz!!
        //Loop yaparken bazi elemanlari isleme sokmamak icin kullanilir.

        //BREAK switch statment ya da loop larda kullanilir. Belli durumlarda kodun calismanini durdurmak icin.
        //Loop larda loop'u kirmak icin






    }
}
