package recap1;

import java.util.Scanner;

public class Q01_Modulus {

    public static void main(String[] args) {

/*
 *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
 *
 *   Ex :
 *   input  : 12345
 *   output : 12
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 5 basmakli bir sayi giriniz");
int sayi=scan.nextInt();



int ilkiki=sayi/1000;
int ilk=ilkiki/10;
int ilkki=ilkiki%10;
int soniki=sayi%100;
int son=soniki/10;
int sonraki=soniki%10;

        System.out.println(ilk+ilkki+ son+ sonraki);
















    }
}
