package sorular;

import java.util.Scanner;

public class gg {

    public static void main(String[] args) {

        /*
        1 ile 12 arasında girilen sayıdan ve yıldan yılın hangi ayı olduğunun ve o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.

Test Data:
2
2016

Beklenen çıktı:
2016 yili Subat ayi 29 gun
Test Data:
4
1998

Copied!
Beklenen Çıktı:
1998 yili Nisan ayi 30 gun
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Ay numarasi giriniz");
        int ay = input.nextInt();
        System.out.println("Yili giriniz");
        int yil = input.nextInt();
        boolean artikYil=(yil%4==0 && yil%100!=0)||(yil%4==0 && yil%100==0&&yil%400==0);
        switch (ay) {
            case 1: System.out.println("Ocak" +yil + " 31 Gundur.");
                break;
            case 2:
                if (artikYil) System.out.println("Subat " + yil + " 29 Gundur.");
                else System.out.println("Subat " + yil + " 28 Gundur.");
                break;
            case 3: System.out.println("Mart " +yil+ " 31 Gundur.");
                break;
            case 4: System.out.println("Nisan "+ yil+ " 30 Gundur.");
                break;
            case 5: System.out.println("Mayıs"+ yil+" 31 Gundur.");
                break;
            case 6: System.out.println("Haziran "+ yil+" 30 Gundur.");
                break;
            case 7: System.out.println("Temmuz "+ yil+" 31 Gundur.");
                break;
            case 8: System.out.println("Agustos "+ yil+" 31 Gundur.");
                break;
            case 9: System.out.println("Eylül"+ yil+" 30 Gundur.");
                break;
            case 10: System.out.println("Ekim "+yil+" 31 Gundur.");
                break;
            case 11: System.out.println("Kasım"+yil+" 30 Gundur.");
                break;
            case 12: System.out.println("Aralık"+yil+" 31 Gundur.");
                break;
            default: System.out.println("Gecerli bir ay numarası girin.");
        }












    }
}
