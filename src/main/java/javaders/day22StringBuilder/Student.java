package javaders.day22StringBuilder;

public class Student {  //Not : Classlar kaliptir bu yüzden  private ve protected yapilmaz!!
                        //      public ve default olabilir.

    //main method yok
    //stName "public" oldugu icin diger class'lardan ulasilabilir.

    public String stName ="Ali Can";
    //Access Modifier'i default olan ile public olan class memeber'lar ayni package icinde
    //kullanildiklarinda ayni ozellikleri gosterirler.
    //Fakat farkli packageà gectiginizde "public" olanlara ulasilir, "default"olanlara
    //ulasilmaz.


    //default
    int age =23;   // (default) ama ayni package da oldugundan public gbi davranir.

    //private

    //Access Modifier'i "private" olan Class member'lar sadece olustruldukalri class icinde
    //gorulebilirler.
    //Olusturuldaklari class'in disinda ciktiginzda görülmezler, ulasilmaz olurlar
    //yani StudentRunner ve StudentRunner2  de gorunmezler!
    private String healtCondition ="Cancer";


    //protected

    //Accsess Modifier'i "protected" olan Class member'lar ayni package icinde iken
    //"public" gibi davranirlar.
    //farkli package gectiginizde "protected" olanlar child classlardan gorunebilirler.
    protected int salary = 3000;

    //ayni class icinde public, default ve protected ayni sekilde davranir
    //protected ile default farki ise==> protected child class lar icinde görünebilir

    //farkli package da public calisir ve gorunur, default ve private görünmez
    //ama protected olanlar child class ise gorunur.



}
