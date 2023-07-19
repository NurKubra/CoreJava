package practice.day_11_practice;

public class Den_C04_Cons {
    public static void main(String[] args) {

        //once degerleri const. parantez icine yazdik
        //bu constrcutor atanan degerleri asil clasa tasir.
        //daha sonra asil class'da constructor olusturduk ve isim atadik
        //constr. bodysinde ise instance varibale'lara atadik
        //bu class da yazdirdigimizda obje uzerinden olustrudgumuz degrleri yazdirabildik
        //deger isimlerini ayni kullanmak istersek this yazrsak instance variable oldugunu anlariz

        C04_Constructor obj1 = new C04_Constructor("Honda", "Civic", 2020,"Benzin");

        System.out.println(obj1.marka);  //Honda
        System.out.println(obj1.model);  //Civic
        System.out.println(obj1.yil);   //2020
        System.out.println(obj1.yakit);  //Benzin
    }

}
