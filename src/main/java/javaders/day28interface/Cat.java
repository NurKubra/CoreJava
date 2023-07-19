package javaders.day28interface;

public class Cat implements Mammal {


    @Override
    public void eat() {

    }

    @Override
    public void drink() {  //drink() methodu Mammal'In parent'i olan Animal da
                           //olusturuldu ve mutlaka concrete child class class da
                           //override edilmelidir.


    }

    public static void main(String[] args) {
        //Interfcace'lerde varibale'lar cagrilirken "intergace" adini kullarak cagirin
        // Bu hem "static" variable olmanin gerigidir, hem de okunurlulugu arttiririr.

        System.out.println(Animal.age);       //4 age her zaman 4 'tür. Static oldg. icin obje olusturmadan
                                              // interface'in ismi ile cagirdik ve main method da yazdirdik
        System.out.println(Mammal.feedbaby);  // Milk

        System.out.println(Mammal.age);      //diger parent deki age yazdirilabilir. ikisi de ayni ada sahip olmasina
                                             // ragmen kullanilir; cünkü basinda interface ismini yazarak cagirdigimiz icin
                                             // hangi interface Parent da oldgunu biliriz. Bu da karisikliga sebep olmaz.
                                             //Eger Mammal'i yazmadan age yazarsak bir üstündeki parent'dakini yazdirir.
                                             //interface adi belirtilmeden cagirmak tavsiye edilmez


    }
}
