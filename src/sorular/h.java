package sorular;

import java.util.Scanner;

public class h {

    public static void main(String[] args) {

         /*Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
        Input :1238
        Output :Girilen Numananin Tersi: 8321

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        System.out.println("Girilen Numaranin Tersi: ");
        while (sayi > 0) {
            System.out.print(sayi % 10);
            sayi /= 10;


        }
    }
}