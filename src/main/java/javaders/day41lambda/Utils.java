package javaders.day41lambda;

public class Utils {
    //Utils class her projede vardir. Helper, Utils vs. olabilir
    //Faydali methodlarin depolandigi yerdir.
    //mesela day41 de ilk soruda karesini alma metjodu olmadigi icin burda bir method olusturuyorum.
    //INTERVIEW Sorusu :
    //Util Class'inizda hangi methodlar vardi???


    public static int getSquare(int a) {
        return a * a;

    }

    public static boolean isOdd(int a) {
        return a % 2 != 0;

    }


    public static int getSumOfDigits(int a) {
        int sum = 0;
        while (a > 0) {
            sum = sum + a % 10;
            a = a / 10;

        }
        return sum;
    }
}
