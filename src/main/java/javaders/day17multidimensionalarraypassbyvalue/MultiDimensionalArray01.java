package javaders.day17multidimensionalarraypassbyvalue;

import java.util.Arrays;

public class MultiDimensionalArray01 { //cok boyutlu Array

    /*
    1)Bir array'in elemanlari da array olursa bu tarz array'lere "Multidimensional Array" denir.
     */

    public static void main(String[] args) {

        //"Multidimensional Array" nasil olusturulur ?
        String names[][] =new String[3][2];   //yani 3 eleman icinde 2 elemanli kumeler var
        names[1][0]= "P";
        names[2][1]= "Z";
        names[0][0]= "A";
        names[0][1]= "K";
        names[1][1]= "M";
        names[2][0]= "C";

        //"Multidimensional Array"leri console'a yazdirmak icin toString() methodu degil deepToString() methodu kullaniniz!
        System.out.println(Arrays.deepToString(names)); //[[A, K], [P, M], [C, Z]]
        //toString() kullanilirsa referanslari konsola yazilir


        //"Multidimensional Array" icinden spesifik bir eleman nasil yazdirilir
        System.out.println(names[1][1]);  //M

        //"Multidimensional Array" icindeki bir array'i yazdirmak
        System.out.println(Arrays.toString(names[0]));  //[A, K]
        System.out.println(Arrays.toString(names[1]));  //[P, M]

        //Kisa yoldan "Multidimensional Array" nasil olusturulur?
        String students[][]= {{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan", "Kayahan"}};





        //Example 1: yukaridaki students array'inde toplam kac isim oldugunu bulunuz
        //for each dongusuyle her ic array'e ayri ayri bakariz
        int sum = 0;
        for (String[] w :students){  //{"Ali","Kemal"} bu bir String Array'dir.
            sum =sum + w.length;     //length ile her bir ic Array'in eleman sayisini alir ve sum'da toplar.

            //System.out.print(sum+" "); //2, 3, 6, 8 her asamada toplama isleminin sonucunu ayri ayri yazdirirken
        }

        System.out.println(sum);  //8





        //Example 2:Yukaridaki students arrayin de icinde "m" olan isimleri konsola yazdiriniz.
        //nestedLoop ile yapmamiz lazim

        for(String[] w : students){  //ic array'lere tek tek bakiyor

            for(String k : w){       //burda ic array'lerdeki elemanlara tek tek bakiyor

                if(k.contains("m")){
                    System.out.println(k);  //tek tek bakilan elemanlarin icinde eger m varsa yazdirir.
                }
            }
        }


        //Example 3:Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz
        int nums[][] = {{5,4},{2,3,2},{7}};
        int carpim= 1;

        for(int[] a : nums){  //burda ilk ic arrayi alcak yani {5,4}'ü
            for(int b : a){   //burda da {5,4} arrayindeki elemanlari tek tek alcak ve carpcak
                carpim = b*carpim;
            }
        }
        System.out.println(carpim);  //1680

        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz.
        int numbers[][] = {{5,4},{2,3,2},{7}}; //==> {5,4,2,3,2,7}

        //1.step :Iki boyutlu array'de kac eleman oldugunu bulan kodu yazmaliyiz.
        int toplamElemanSayisi = 0;

        for(int[] w : numbers){
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }
        //2.step :Tek boyutlu array'i iki boyutlu array'in eleman saiysini kullanarak olusturmaliyiz
        int newArr[] = new int[toplamElemanSayisi];

        //3.step :Iki boyutlu array'deki elemanlari tek boyutlu array'e transfer etmeliyim
        int index =0;

        for(int[] w: numbers){  //ilk {5,4} arrayini w'a atar
            for (int k : w){     //burda ise k'ya once 5'i sonra 4'ü atar
                newArr[index]=k;  //o zaman burda newArr (yani yeni Array deki) 0. indexe 5'i atamis olduk.
                index++;          //index arttikca diger elemanlari da sirasiyla yeni Array'e yerlestirir.
            }
        }
        System.out.println(Arrays.toString(newArr));   //[5, 4, 2, 3, 2, 7]



        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz
        int ages[][] = { {15, 4}, {12, 43, 21}, {17}};

        //Alternatif yol: tek boyutlu array'e cevirip sirlayip ilk ve son elemani alip toplayabiliriz.

        int small = ages[0][0];
        int big = ages[0][0];

        for(int[] w: ages){ //ilk ic array gelir {15,4}
            for(int k :w){  // buraya ilk 15' i atar. Bu durumda k=15 dir ve small'a da basta gecici olarak ilk index yani 15 atamistik

                small = Math.min(small,k); //burda k 15 dir ve small da 15'dir bu durumda kiyaslar ve kucuk olani yazdirir. small==>15
                                           //bir sonraki adimda small==> 15'dir ve k==> 4 tür bu durumda ikisini kiyasalar
                                           //bir sonrakinde ise small==> 4 tur ve k ==> 12 dir tekrar kucuk olani yazdirir ve small==> 4
                big = Math.max(big,k);
            }

        }
        System.out.println(small + big);  //4+43 =47
    }
}
