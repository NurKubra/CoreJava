package javaders.day34exceptions;

public class E02 {

    /*
    ArrayIndexOutOfBoundsException : Array'lerde olmayan index kullanildiignda
     */

    public static void main(String[] args) {

        //Bir String Array'den istenilen bir elemani sirasi ile alan method olusturunuz
        String a[] = {"A","V","A","J"};
        System.out.println(getElement(a,3));
        System.out.println(getElement(a,1));
        System.out.println(getElement(a,4));
        System.out.println(getElement(a,2));
        System.out.println(getElement(a,6));  //ArrayIndexOutOfBoundsException
        System.out.println(getElement(a,-3));  //ArrayIndexOutOfBoundsException


    }
    public static String getElement(String[] a, int numOfElement){
       // ilk hali :return a[numOfElement-1];  //indexle calistigi icin -1 yazdik a[2] demek ==> index 2 yani 3. eleman demek

        String result="";
        try {
            result= a[numOfElement-1];
        }catch (ArrayIndexOutOfBoundsException e){  // ArrayIndexOutOfBoundsException
                                                    //Array islemlerinde olmayan index kullanginizda atilir.
          if(numOfElement-1<0){
              result = a[0];
          }else{
              result = a[a.length-1];
          }
        }

        return result;

    }
}
