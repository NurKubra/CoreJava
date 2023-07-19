package javaders.day20methodovarloadingarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList01 {
    public static void main(String[] args) {

        //ArrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<Integer>();

        //ArrayList console nasil yazdirilir?
        System.out.println(ages); //[ ]

        //ArrayListlere eleman nasil eklenir?
        //add() methodu elemanlari sizin verdiginiz sirada liste ekler(==>insertion order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        System.out.println(ages); //[9,12,10]

        ages.add(1,656);
        System.out.println(ages);  //[9, 656, 12, 10]
        ages.add(3,777);
        System.out.println(ages);  //[9, 656, 12, 777, 10]

        ages.add(888); //en sona eklemek istersek index koymaya gerek yok
        System.out.println(ages);  //[9, 656, 12, 777, 10, 888]


        //List'e coklu eleman nasil eklenir? veya Liste baska bir list nasil eklenir?
        ArrayList<Integer> newAges =new ArrayList<>();

        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        System.out.println(ages);  //[9, 656, 12, 777, 10, 888, 8, 9, 10]  sona ekler insertion order'dan dolayi

        ages.addAll(2,newAges);
        System.out.println(ages);  //[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        //ArrayListte eleman sayisi nasil bulunur?
        //size() methodu bir listteki eleman sayisini bize verir

        int numOfElement = ages.size();
        System.out.println(numOfElement);  //12

        //ArrayList de spesific bir eleman nasil alinir?
        //get() methodu index kullanarak istedigimiz elemani almaya yarar
        int el1 = ages.get(1);
        System.out.println(el1);  //656

        //ArrayList spesific bir eleman nasil degistirilir?
        ages.set(2,313);
        System.out.println(ages);  //[9, 656, 313, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        ages.set(4,353);
        System.out.println(ages);  //[9, 656, 313, 9, 353, 12, 777, 10, 888, 8, 9, 10]


        //Bir List de tüm elemanlari nasil silebilebiliriz
        ages.clear();
        System.out.println(ages);  //[]

        //ArrayList de spesific bir elemanin var olup olmadigiini nasil anlariz?
        boolean r =ages.contains(656);
        System.out.println(r);   //false

        //not:static icin objeye gerek yok

        //Arraylistin bos olup olmadigini nasil kontrol ederiz?
        boolean r2= ages.isEmpty();
        System.out.println(r2);  //eger bossa true döner

        ages.clear();
        boolean r3 = ages.isEmpty();
        System.out.println(r3);

        //Example 1: Bir istin bos olup olmaidigni kontrol eden kodu yaziniz
        ArrayList<String> names = new ArrayList<>();
        names.add("usame");
        names.add("fatih");
        names.add("ali");
        names.add("ufuk");

        //Listin size'i Arrayin length' idir.

        if(names.size()==0 ){  //Bu islemin aynisini yapan method varsa onu tercih etmeliyiz
            System.out.println("List ist empty");
        }else {
            System.out.println("List has at least 1 element");
        }

        names.clear();
        //2. yol --> tavsiye edilen yol tek islem yapar
        if(names.isEmpty()){
            System.out.println("List ist empty");
        }else {
            System.out.println("List has at least 1 element");
        }

        //Bir Listin baska bir List ile ayni olup olmadigini nasil kontrol ederiz?
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("usame");
        names1.add("fatih");
        names1.add("ali");
        names1.add("ufuk");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("usame");
        names2.add("fatih");
        names2.add("ufuk");
        names2.add("ali");

        boolean s = names1.equals(names2);
        System.out.println(s);  //ayni indexte de ayni elemanlar olmali !!!!

        //Verilen iki Integer Listte tamaiyla ayni elemanlar olup olmaidgini kontrol eden kodu yaziniz.
        ArrayList<Integer> nums1 =new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 =new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        //sort methodu ile buyukten kucuge siralanir
        Collections.sort(nums1);
        Collections.sort(nums2);
        boolean s2 = nums1.equals(nums2);
        System.out.println(r2);   //true



    }
}
