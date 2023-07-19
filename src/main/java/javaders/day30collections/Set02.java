package javaders.day30collections;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {

    public static void main(String[] args) {
        //Interview Sorusu
        //Example: ogrenci email adreslerini Natural Order'da siralanmis olarak depolayiniz.
        //email adesleri dunyada benzersiz oldugunda Set kullanilir.

        // ==> TreeSet ile natural order'e göre dizmem lazim, fakat TreeSet'in yavasligindan kurtulamk icin
        //HashSet'in eleman ekleme hizini kullanip sonra onu TreeSet' cevirirm. Bu sayede de natural order'e göre siralarim


        //1.Yol
        long t1 = System.nanoTime();
        TreeSet<String> emails = new TreeSet<>();
        emails.add("abc@gmail.com");
        emails.add("abe@gmail.com");
        emails.add("abf@gmail.com");
        emails.add("abd@gmail.com");
        emails.add("abh@gmail.com");
        emails.add("abv@gmail.com");
        emails.add("abo@gmail.com");
        emails.add("abb@gmail.com");
        emails.add("abz@gmail.com");
        emails.add("aba@gmail.com");

        System.out.println(emails);

        long t2 = System.nanoTime();
        //2.yol ==> Daha hizli yok icin önce HashSet yapip sonra onu TreeSet'e atarsak hizli bir sekilde siralar.

        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("abc@gmail.com");
        emailsHs.add("abe@gmail.com");
        emailsHs.add("abf@gmail.com");
        emailsHs.add("abd@gmail.com");
        emailsHs.add("abh@gmail.com");
        emailsHs.add("abv@gmail.com");
        emailsHs.add("abo@gmail.com");
        emailsHs.add("abb@gmail.com");
        emailsHs.add("abz@gmail.com");
        emailsHs.add("aba@gmail.com");

        TreeSet<String> emailsHsTs = new TreeSet<>();
        System.out.println(emailsHsTs);
        long t3 = System.nanoTime();

        System.out.println(t2-t1); //                         765300
        System.out.println(t3-t2);  //daha kisa zamanda yapar 105200
        //t2-t1 = ilk isin yapilis süresini
        //t3-t2 = ikinci isin yapilis süresini verir
    }
}
