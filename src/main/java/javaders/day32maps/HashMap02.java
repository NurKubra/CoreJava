package javaders.day32maps;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        //Interview Sorusu!!!
        //Example 1: Type code to print the number of occurrences of word in a sentence
        //Verilen cumledeki kelimelerin gorunum sayiisni veren kodu yaziniz

        //"I like you, like like!" ==> I=1 , like=3, you=1
        //Not: son like! oldugundan like olarak saymaz!! farkli kelimeler olarak gorur.

        String s= "I like you you, like like!";

        //1-like ile like! 'i ayni yapabilmek icin tum noktalama isaretlerini silelim
        s= s.replaceAll("\\p{Punct}","");
        System.out.println(s); //I like you you like like

        //2-Ben kelimelerle calismaliyim bu yüzden split(" ") kullanicam
        //split() her bir kelimeyi bir Array icine koyar

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));  //[I, like, you, you, like, like]

        //Ilk elemani al map'e bak yoksa 1 degeriyle oraya yerlestir..ikinci kelime icinde 1 degeriyle ekle, ucuncuyu de 1 degeriyle ekle
        //4. kelimeye bak varsa var olan degri 1 arttir yoksa 1 degeriyle yerlestir.

        //3- "words" Array'indeki kelimeler birer birer Map'te var mi yok mu diye kontrol edilcek
        //"words" Array'indeki kelimeler Map'te yoksa value'su 1 olarak yerlestirilcek,
        //"words" Array'indeki keliemler Map'te varsa value'su 1 arttirilarak yerlestirilcek

        HashMap<String, Integer> occ = new HashMap<>();
         for(String w: words){
             Integer numOfOccurrence = occ.get(w); //key ile gorunumu verir yoksa null verir.
             if(numOfOccurrence==null){ //nonPrimitive'ler null'i eleman olarak kabul eder.Primitivler degil
                 occ.put(w,1);
             }else{
                // occ.put(w,numOfOccurrence+1);  //key varsa value'i arttir yapariz
                 occ.replace(w, numOfOccurrence+1);  //value degistirilceginden replace daha güzel olur

                 }
             }

         System.out.println(occ);  //{like=3, I=1, you=2}
    }
}
