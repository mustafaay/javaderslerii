package practice6;

import java.util.Scanner;

public class Q11_Odev {

    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {

        String pin="mustafa12345";
        int girishaki=5;
        Scanner scanner=new Scanner(System.in);
        System.out.println("********* hos geldiniz ***********");

        while (true){

            System.out.println("pin giriniz");

                String girilenpin=scanner.nextLine();

            if(pin.equals(girilenpin)){

                System.out.println("giris basarili");
                break;
            } else  {
                System.out.println("hatali sifre  \n lutfen tekrar giriniz ");
                girishaki--;
                System.out.println("galan deneme hakiniz =  "+girishaki);
            }if(girishaki==0){

                System.out.println("you hasben blocked ");
                break;
            }


        }









    }
}
