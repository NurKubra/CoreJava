package javaders.day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01_bak {

    public static void main(String[] args) {
        //Kullanicinin coklu datayi bir array'a yerlestirebilmesi icin gereken kodu yaziniz

        /*
        1)Kullanicidan data almak icin Scanner object olustur.
        2)Coklu Datayi yerlestirmek icin bir array olusturmaliyim
        3)Array olusturabilmek icin kullanicidan array'e kac tane eleman koyacagini almaliyim.
        4)Loop olusturup eleman ekleme isini tekrar tekrar yapabilmeliyim.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of elements you want to add");
        int numOfElement = scan.nextInt();
        //Bir kere sorcam bu yüzden loop icine koymama gerek yok.
        String stdNames[] = new String[numOfElement];
        //System.out.println("To stop adding press 'q'");  buraya bir kere yazarsak sadece basta bir kez sorar

        for (int i=0; i<stdNames.length ; i++){

            System.out.println("Enter the "+ (i+1) +".student name");
            System.out.println("To stop adding press 'q'");  //eklemeyi durdurmak icin q'ya basin
            String name = scan.next();

            if (name.equalsIgnoreCase("q")){
                break;
            }else{
                stdNames[i] = name; //yukarda bos olarak olusturudgumuz String 'e loop her döndüdügünde girdigimiz degerlerin
                                    //eklenmis aktuell halini veren String !!
            }

        }
        System.out.println(Arrays.toString(stdNames));  //loop döngusunu tamamlayip kirilinca yazdirir!!


        // ilk ismi girdikten sonra q ya basarsak [Ali, null, null] yapar yani sadece bir ismi yazdirip sonra mola verir.

    }
}
