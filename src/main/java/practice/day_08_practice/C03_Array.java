package practice.day_08_practice;

public class C03_Array {
    public static void main(String[] args) {
 /*

      Aşağıdaki multi dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
      toplamını yazdıran bir program yazın.


      int arr1[][] = {{1,2},{3,4,5}};
      int arr2[][] = {{7,8,9},{10,11},{12}};

     */

        int arr1[][] ={{1,2},{3,4,5}};
        int arr2[][] = {{7,8,9},{10,11},{12}};

        int sinir=0;
        int toplam = 0;


        for (int i = 0; i <arr1.length ; i++) {  //döngüyü kisa olan arraye gore döngüye alcaz.
                                                 // Cunku mesela 2. arraydeki 3.dis array isimize yaramiyor,
                                                  //diger arrayde ayni indexe sahip array yok
            if (arr1[i].length < arr2[i].length){ //arr1'in i. indexindeki dis array'in eleman uzunlugu ile
                                                  // arr2'nin i.indexteki dis array eleman uzunlugunu karsilastirdik.

                sinir = arr1[i].length;          //
            }else{
                sinir= arr2[i].length;           //yukardaki sart saglanmiyorsa demkki kucuk  olan arr2'nin i indexidir.
            }

            for (int j = 0; j <sinir ; j++) {
                toplam = arr1[i][j] + arr2[i][j]; //i dis array j ic array'i ifade ediyor.
                System.out.println(i+","+j+ "indexindeki elemanlari toplami. "+toplam);
            }
        }

    }
}
