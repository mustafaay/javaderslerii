package sorular;

import java.util.Scanner;

public class ff {

    public static void main(String[] args) {


        /*
        Girilen 3 sayıdan en büyüğünü bulan Java Kodunu yazınız.

Test Data:
12
34
23
Beklenen Çıktı:
En Buyuk Sayi: 34
         */



        Scanner in = new Scanner(System.in);
        System.out.println("en buyugunu bulmak ıstedıgınız 3 sayıyı gırınız");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if (num1>num2 && num1>num3) {
            System.out.println("En Buyuk Sayi :" + num1);

        } else if (num2>num3 && num2>num1) {
            System.out.println("En Buyuk Sayi :" + num2);

        }else {
            System.out.println("En Buyuk Sayi :" + num3);
        }



    }
}
