package ders39_exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {


        String str = "123a5";



        try {
            int say = Integer.parseInt(str);
            System.out.println(say*say);
        }catch (Exception e){
            System.out.println("lutfen sadece numara tazini ");

        }














        /*
        kulanicidan String olarak bir ddeger aliyor ve bunu int'a ceviriyorsak
        NumberFormatException ile karsilasabilecegimizi on gorururz
        NumberFormatException aldigimizda kodun durmamasini istiyorsak try-cacth ile cevrileye biliriz


        eger bilmedigimiz bir exception  daha olusursa codunuz durnmasin istiyorsak bir kere daha cacth cumlesi
        ekleyip ondada en genis exception'i yazabiliriz
         */
    }
}