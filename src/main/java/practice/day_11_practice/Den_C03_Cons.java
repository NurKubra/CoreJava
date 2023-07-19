package practice.day_11_practice;

public class Den_C03_Cons {


    public static void main(String[] args) {

        C03_Constructor obj1 = new C03_Constructor();
        //esitligin sag tarafi constructor'dir. Parntez icinin bos olmasi paramtresiz bi constructor'dir
        //burda olusturulan constructor, diger class'daki görünmeyen  default const. gdiciek ici bos oldugundan geri gelcek

        obj1.marka="Mercedes";
        obj1.model= "C180";
        obj1.yil= 2023;
        obj1.yakit= "Benzin";
        System.out.println(obj1.marka);  //Mercedes
        System.out.println(obj1.model);  //C180
        System.out.println(obj1.yil);    //2023
        System.out.println(obj1.yakit);  //Benzin







    }
}
