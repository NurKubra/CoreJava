package javaders.day16arraysforeachloopDT;

import java.util.Arrays;

public class Arrays04 {

    //ornek 1 :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
    public static void main(String[] args) {

        String s = "Java is easy. Learn Java earn money.";
        String word[] = s.split(" ");

        System.out.println(Arrays.toString(word)); //[Java, is, easy., Learn, Java, earn, money.]
        System.out.println(word.length);           //7


        //ornek 2: size verilen cumlede kac harf oldugunu gösteren kodu yaziniz
        //harf disinda ne varsa silip

        String letters[] = s.replaceAll("[^a-zA-Z]","").split(""); //split'i hiclikten bolmemiz lazim
        // sadece replaceAll dan sonra butun harfleri yan yana yazdirir ==>JavaiseasyLearnJavaearnmoney ==>splitle hepsini böldük
        //System.out.println(s.replaceAll("[^a-zA-Z]","").length()); //28
        System.out.println(Arrays.toString(letters)); //[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]
        System.out.println(letters.length);           //28


    }
}
