package javaders.day35exceptionsDT;

public class E04 {
    public static void main(String[] args) {

        String arr[] ={"A","G","M","L"};
        getElementFromArray(arr,1);  //G
        getElementFromArray(arr,5);  //ArrayIndexOutOfBoundsException

    }
    public static void getElementFromArray(String[] s, int idx){
        //Arraylerde olmayan bir index kullanildiginda java ArrayIndexOutOfBoundsException atar.
        try{
            String el= s[idx];
            System.out.println(el);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getCause());  //null==>  tanimlanmais
            System.out.println(e.getMessage()); //Index 5 out of bounds for length 4 ==> teknik mesaj
        }
    }
}
