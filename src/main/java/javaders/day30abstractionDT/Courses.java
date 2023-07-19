package javaders.day30abstractionDT;

public abstract class Courses {
    /*
    Bazi classlarin amaci obje uretmek degil, siniflandirma yapmak icin kullanilir. Objeleri katogerize etmek icin kullaniriz.
    Bir class i sadece siniflandrima yapmak ve Sadece child class'larin tasimak zorunda oldugu özellikleri belirtmek uzere olusturulan classlar.
     */
    public abstract void math();
    public void science(){
    }

    public void art(){
        System.out.println("Learn art");
    }
}


/*
Eger bir classdan Obje olusturulmasini istemiyorsak
ve bu classlarin yapmak zorunda oldukalri gorevleri belirlemek
icin kullaniyorsak
"Abstraction " yapariz.


 */