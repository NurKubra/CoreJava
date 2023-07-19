package javaders.day17multidimensionalarrayDT;

import java.util.Arrays;

public class MultidimensionalArray02 {
    // //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
    //        int numbers[][] = { {5, 4}, {2, 3, 2} }; // ==> { 5, 4, 2, 3, 2 }

    public static void main(String[] args) {
        int numbers[][] = { {5, 4}, {2, 3, 2} };

        //1.step iki boyutlu Array de öncelikle kac eleman oldugunu dinamik olarak bulalim
        int toplamElemanSayisi= 0;
        for(int [] w :numbers ){
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }
        System.out.println(toplamElemanSayisi);   //5

        //2.step Tek boyutlu arrayi elde ettigimiz eleman sayisi kullanarak olusturalim

        int newArr[] = new int[toplamElemanSayisi];  //[0,0,0,0,0] default valeu

        //3.step Iki boyutlu Array deki elemanlari tek boyutlu Array'e transfer edelim
        int idx =0;
        for(int [] w: numbers){ //multidimensional array deki iki elemani alcak 1. ==>{5,4},2.==>{2,3,2}
            for(int k : w){     //
                newArr[idx] = k; //newArr ye k daki elemanlari tek tek atiyoruz
                idx++;          //bir sonraki indexe gecmeyi saglar

            }
        }
        System.out.println(Arrays.toString(newArr));


        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        //        int ages[][] = { {15, 4}, {12, 43, 21} }; // ==> 4 + 43 = 47

        int ages[][] = { {15, 4}, {12, 43, 21} };
        int small= ages[0][0];  //hepsini tek tek gezip en kucuk olani icine aticak bu yuzden ilk basta ages Array deki ilk indexi atadik
        int big= ages[0][0];

        for (int [] w : ages) {
            for(int k: w){
                small= Math.min(small,k);  //tek tek elemanlari kiyaslayip en kucuk olani yazdirir.
                big= Math.max(big,k);  //tek tek elemanlari kiyaslayip en kucuk olani yazdirir.

            }

        }
        System.out.println(small+ big);  //sadece bir eleman yazdirdigiimizdan sout uböyle yazdirdik


    }
}
