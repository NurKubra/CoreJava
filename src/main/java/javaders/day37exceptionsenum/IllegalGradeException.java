package javaders.day37exceptionsenum;

public class IllegalGradeException extends Exception{  //Exception classdaki butun ozellikleri kullanabilmek icin child yaptik

    /*
    1)Custom Exception Class(kendim olusturduysam Custom olur) olusturmak icin Exception Class'a extends etmeliyiz.
      Exception Class'a extend ederek olusturdugumuz Custom Exception "Compile Time Exception" olur.
    2)Custom Exeption olusturuken "constructor " olsuturmalisiniz.
      Bu "constructor" parent'daki constructor'I cagirmalidir.
      Bu "constructor" mesaj vercek ya da vermeyecek sekilde olusturulabilir.
    3)Custom Exeption olusturdugunuzda ismin sonunda "Exception" kelimesini kullanmalisniz,
      IllegalGradeException da oldugu gibi.
    4)

     */

    /*
    //benim constructor'im benim class'im obje olustrucak.
    //ama ben super() ekleyerek exception parentina gidip ordan olusturudm
    //mesaj veren bir constructor ve vermeyen ayni anda olusturulabilir
     */
    public IllegalGradeException(String message){
        super(message);

    }

    public IllegalGradeException(){
        super();
    }
}
