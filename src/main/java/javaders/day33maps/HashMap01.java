package javaders.day33maps;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMap01 {
    public static void main(String[] args) {
        //Example 1 : Verilen bir String'de hangi harfin kac defa kullanildiini veren method olusturunuz.
        // "Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1
        //ciktidan Map kullanmamiz gerektigini anlariz
        String s= "Hello Henry!";
        getTheNumOfOccurrenceIfLetters(s);   //method olusturup String icine koyulur.
        System.out.println(getTheNumOfOccurrenceIfLetters(s));  //{r=1, e=2, H=2, y=1, l=2, n=1, o=1}
    }

    public static HashMap<String, Integer> getTheNumOfOccurrenceIfLetters(String s){
        //String'deki harf disi karakterleri sil
       s= s.replaceAll("[^a-zA-Z]", "");

       //Gorunum sayilarini depolamak icin Map olustur;
        HashMap<String, Integer> numOfOccurrence = new HashMap<>();

        //Harfleri al
         String letters[] = s.split("");

        //for-each loop

        for(String w: letters){
           Integer numOfOcc = numOfOccurrence.get(w);  //bize vaule döncek o yüzden Integer
            if(numOfOcc==null){
               numOfOccurrence.put(w,1);



            }else{
                numOfOccurrence.replace(w,numOfOcc+1);
               // numOfOccurrence.put(w,numOfOcc+1);
            }

        }
        return numOfOccurrence;   //methodum Map return ettigi icin
    }
}
