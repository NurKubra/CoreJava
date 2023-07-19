package javaders.day37exceptionsenum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*

    Not:
    Custom exception; bizim kendimizin olusturcagi Exceptionlar.
    Exceptionlar Applikation da yapilmaisni asla istemediginiz seyler icin koyulur.
    Ihmal edilmemesi gereken kurallari kontrol etmek icin kullanilir.
    Custom; 1-Runtime(parent Runtime Exception yapilmali) 2-Compile Time(uretmek class'in parent'ini Runtimeexception class yapilmali)
    Wxception class'lar isimlendirilirken mutkala sonda Exception eklenmeli.
    Exception atarken mesaj da eklemek isterseniz; exception class'in icine mesaj parametresi iceren cont. eklenmeli
    Mesaj eklemek istemezsek; parametresiz constructor ekleriz ya da ikisini de birden kullanabiliriz.



    1)try kullandigimizda her senaryo icin calismasini istedgigimiz kodlari "finally block" icine koyariz.
    sadece try block'la da kullanilanilabilir.
    2) final, finally ve finalize aciklar misniz ? (interwiev sorusu!!!)
      "final" aciklandi
      "finally" aciklandi
      "finalize" Garbage Collecter memory'i temiz tutmak icin surekli memory'i tarar ve silinmesi gerekenleri siler.
                 Garbage Collecter silmeden once silecegi data'lari finalize eder ve sonra siler.

      silinmesi gerekeni silincek hale getirip oyle siliyor.

 */
public class CustomExceptionRunner {

    public static void main(String[] args) throws IllegalGradeException {

        //Exampe 1
        System.out.println(getGrades());

        //Exampe 2
        printAge(45);
      // printAge(-45);  //IllegalException: Ages cannot be negativ

        //try-catch ile kod calismaya devam eder ve mesaji verir.
        try{
            printAge(-35);
        }catch (IllegalException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("I alwasy work");  //finally block exception olsa da olmasa da calisir.
                                                  //her senaryo icin calismaisni istedgiginiz kodlari finally blcok icine alaiirz

        }
    }

    //Example 1: ogrenci notlarini bir list'de ekleyen methodu olusturunuz.


    public static List<String> getGrades() throws IllegalGradeException { //more action secip ilkini atadim bu sayede buraya yazdirdik

        List<String> grades = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        String grade = "";
        int intGrade =0;


        do {
            System.out.println("Please enter the grade. To stop entering press q..");
            grade = input.next();

            if(!grade.equals("q")){
                intGrade = Integer.valueOf(grade);
            }
            if(grade.equals("q")){
                break;
            }
            if (intGrade >= 0 && intGrade <= 100 ) {
                grades.add(grade);

            } else {
                throw new IllegalGradeException("Grades less than zero and grater tha 100 are not valid..");  //alti kizardi cunku kodum compileTime
            }
        } while (!grade.equals("q"));

        return grades;
    }

    //100 den buyuk bir sayi girdigimde kendi olusturdugum Exception'i kullanabildim.


    //Example 2: Kullanicinin yasini konsola yazdiran methodu olusturunuz
    public static void printAge(int age){  //negatif yas girilmemeli

        if(age<0){
            throw new IllegalException("Ages cannot be negativ");
        }
        System.out.println(age);
    }

}
