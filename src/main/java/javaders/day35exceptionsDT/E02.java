package javaders.day35exceptionsDT;

public class E02 {

    public static void main(String[] args) {
        String s = "1234";
        convertStringToInt2(s);

        String t ="1234a";
        convertStringToInt2(t);
    }

    private static void convertStringToInt2(String s) {
        //  Eger icinde rakamlr disinda character olan bir String'i saysiya cevrimek isterseniz java NumberFormatException atar.
        try {
            int intS= Integer.valueOf(s);

            System.out.println(intS+1);
        }catch (NumberFormatException e){
            System.out.println("Bir String'in saysiya donusturulebilmesi icin rakam disi character icermemesi gerekir ");
            System.out.println(e.getMessage()); //For input string: "1234a"==> Javanin kedndi mesaji
        }

    }
}
