package javaders.day25polymorphism;

public class Student {

    //Encapsulation : Data saklamaktir. (Data Hiding)
    //Data'yi nasil saklarsin ? Access Modifier'ini "private" yaparak.


    public String stdName ="Tom Hanks";
    public int age =23;

    private String stdId = "AC2023102T";
    private double gpa =3.87;
    private boolean successful = false;

    //Burda private kapsuldür icindeki bilgi ise String

    //*** Encapsulation yaptigimiz data`yi istersek diger class'lardan okuyabilirz.
    //Nasil okyuabiliriz ? "get method"(getter) olusturarak Encapsulate edilmis data'nin degerini
    //okuyabiliirz.
    //i) get method'lari hep "public" olur
    //ii) get methodu'un "return type"i okudugu variable'in return teype'i ile ayni olur.
    //iii) get method bir boolean variable icin olusturulduysa isim "is" ile baslar.

    public String getStdId() { // sdtId yi gormedigimiz halde degerini görebilirz Eger class'in icinde
                               // get ()methodu olusturarark istenen yererde ulasmaya izin verilri.
        return stdId;
    }

    public double getGpa() {   //gpa 'in return type'ina göre method olusturdu Java.
        return gpa;
    }
    //Encapsulation yapilan variable'in data type'i boolean ise get method "is"  ile baslar.
    //Sadece boolean da "is" döner
    public boolean isSuccessful() { //method is ile basladi cünkü data type boolean
        return successful;
    }

    //*** Encapsulation yaptigimiz data`yi istersek diger class'lardan nasil degistirebilirz.
    //Nasil degistirebiliriz ? "set method" (setter) olusturarak Encapsulate edilmis data'nin degerini
    //degistirebiliriz.
    //i) set methodlari hep "public" olur
    //ii) return type 'i hep "void" olur.
    //iii) set method parametre kullanir ve parametrenin data type'i variable ile ayni olur.
    // set() method kullanarak varolan Object üzerinde degisiklikler yaparak o Objeyi
    // sanki yeni bir Object mis gibi kullanabiliriz !!!!

    //not : get methodlarin diger adi "getter" , set methodlarin diger adi "setter"dir.

    public void setGpa(double gpa) {
        this.gpa = gpa;

        //set () methodlarin return type'lari void olur.
        // Yeni bir data vermez sadece yazdirir.
        //set () methodlar parametre kullanilir.
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;

        //set methodunda boolean yine set'dir "is" olmaz.



    }
}
