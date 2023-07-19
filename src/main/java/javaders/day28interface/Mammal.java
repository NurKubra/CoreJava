package javaders.day28interface;

    /*
     1) Child ===> Parent

        Class --> Class'in Parent'i olcaksa "extends"
        interface --> interface' in Parent'i olcaksa "extends"
        Class --> interface'in Parent'i olcaksa "implement"

        interfcace --> Class yapma olamaz...
        Ayni ise "extends",farkli ise "implements" kullan.
        "interface"'i Class'in Child'i yapma.



      Child ve Parent ikisi de interface ise extends kullanilir.
      Parent da yani Mammal da eat() methodu yazdik ama Child da
      override etmemeize ragmen sikayet etmedi; bunun sebebi-->
      Child'in concrete olmasi durumunda gecerlidir.!!!
      Burda Mammal interface yani Child concrete Class degil!!


       Parentlerde abstract method olusturudugnuzda mutlaka concrete child classlarda
       o methodlar Override edilmelidir!!! cok önemli (app'In calismasi icin)

       Not : bir methoda static keyword koyulursa mutlaka body koyulmali
             abstract yani interfacedeki methodlarda body olmaz bu yüzden
             methodlarda static kullanilmaz.



       Interview Sorusu !!
       abstarct class ile interfcae arasindaki farklar nelerdir?

          ******1) Abstarct Class'lar hem "abstarct" hem de "concrete" methodlar icerebilirler fakat
          interface'ler sadece abstract method icerir.
          Ama interface'lerde istersek "default" ve "static" keyword'larini kullanarak "concrete" method uretebilirz.
          ***2) Abstract Class'lar multiple inheritance'i desteklemez ama inheritance'ler destekler
          **3)Abstract Class'lar icinde her turlu variable olusturulabilir, interfcae'ler icindeki variable'lara public, static
          ve final olmak zorundadir.
          4)"interface", Class'in child'i olamaz.. ama "abstract class" Class'in child'i olabilir.
          5) abstract class'lar da constructer vardir ama object uretemez, interface'lerde constructer yoktur bu yuzden object uretemez



     */


public interface Mammal extends Animal {

    String feedbaby = "Milk";
    int age= 6;




}
