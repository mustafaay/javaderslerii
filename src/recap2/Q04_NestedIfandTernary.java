package recap2;

import java.util.Scanner;

public class Q04_NestedIfandTernary {
     /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 0-9 arasi bir sayi giriniz");
        int sayi = scan.nextInt();


        if (sayi >= 0 && sayi <= 9) {

            if (sayi == 9) {
                System.out.println("dokuz");
            } else if (sayi == 8) {
                System.out.println("sekiz");
            } else if (sayi == 7) {
                System.out.println("yedi");
            } else if (sayi == 6) {
                System.out.println("alti");
            } else if (sayi == 5) {
                System.out.println("bes");
            } else if (sayi == 4) {
                System.out.println("dort");
            } else if (sayi == 3) {
                System.out.println("uc");
            } else if (sayi == 2) {
                System.out.println("iki");
            } else if (sayi == 1) {
                System.out.println("bir");
            } else if (sayi == 0) {
                System.out.println("sifir");
            }


        }

        else {
            System.out.println("lutfen 0-9 arasi mir sayi giriniz \n girdiginiz sayi min:0  max:9  olabilir");
        }












    }
}
