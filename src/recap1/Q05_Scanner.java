package recap1;

import java.util.Scanner;

public class Q05_Scanner {

    public static void main(String[] args) {

 /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
double a = scan.nextDouble();
        System.out.println("2. sayiyi giriniz");
double b = scan.nextDouble();
        System.out.println("3. sayiyi giriniz");
double c = scan.nextDouble();


        System.out.println(((a*a)-(b*b))/(c*3));










    }
}
