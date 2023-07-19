package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {

    public static void main(String[] args) {
        //Size verilen bir cumleden kac kelime oldgunu gosteren kodu yaziniz
        //microsof word'de yazi yazdigimizda kac kelime oldgunu yazan kod!

        //coklu datalar Array lere koyulur.
        //Bir String'i kestigimizde coklu data elde eder ve coklu datalari Array'lere koyar.

        String s = "Java is easy. Learn Java earn money.";
        String words[]= s.split(" ");         //split() butun bosluklardan keser. Elimizde bir suru kelime olur.
                                                    // Hepsini words'un icine koyar
        System.out.println(Arrays.toString(words)); //[Java, is, easy., Learn, Java, earn, money.]
        System.out.println(words.length);           // 7

        //Size verilen cümlede kac harf oldugunu yazdiriniz

        String letters[] = s.replaceAll("[^a-zA-Z]","").split(""); //harf disindaki herseyi hiclik yapip hiclikten böldük!
        System.out.println(Arrays.toString(letters));
        //[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]
        System.out.println(letters.length); //28


    }
}
